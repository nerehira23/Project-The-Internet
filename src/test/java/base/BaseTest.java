package base;

import com.aventstack.extentreports.Status;
import helper.ScreenShotHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import report.ReportManager;

public class BaseTest {

    protected WebDriver webDriver;
    private String browser;

    @BeforeSuite
    public static void setUpSuite() throws Exception {
        ReportManager.init("Reports", "Trabajo Final The Internet");
    }

    @BeforeMethod
    @Parameters("browser")
    public void setUp(ITestResult iTestResult, String browser){
        ReportManager.getInstance().startTest(iTestResult.getMethod().getMethodName());
        this.browser = browser;
        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
                webDriver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "resources/geckodriver");
                webDriver = new FirefoxDriver();
                break;
        }
        webDriver.get("https://the-internet.herokuapp.com/");
    }

    @AfterMethod
    public void tearDown(ITestResult iTestResult){
        try {
            switch (iTestResult.getStatus()){
                case ITestResult.FAILURE:
                    ReportManager.getInstance().getTest().log(Status.FAIL, "Test failed in " + this.browser);
                    break;
                case ITestResult.SKIP:
                    ReportManager.getInstance().getTest().log(Status.SKIP, "Test skipped in " + this.browser);
                    break;
                case ITestResult.SUCCESS:
                    ReportManager.getInstance().getTest().log(Status.PASS, "Test passed in " + this.browser);
                    break;
                default:
                    ReportManager.getInstance().getTest().log(Status.FAIL, "Test incomplete in " + this.browser);
            }

            if(iTestResult.getStatus() != ITestResult.SUCCESS && iTestResult.getThrowable() != null){
                ReportManager.getInstance().getTest().log(Status.FAIL, iTestResult.getThrowable().getMessage());
                ScreenShotHelper.takeScreenShotAndAdToHTMLReport(webDriver, Status.FAIL, "Failure Image");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(webDriver != null)
                webDriver.quit();
        }
    }

    @AfterSuite
    public static void tearDownSuite(){
        ReportManager.getInstance().flush();
    }
}
