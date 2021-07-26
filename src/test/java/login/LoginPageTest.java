package login;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import tasks.formAuth.GetTextAlertSecureArea;
import tasks.formAuth.LoginPage;
import tasks.TheInternet;

public class LoginPageTest extends BaseTest {

    @Test
    private void testSuccessfulLogin(){
        TheInternet.click(webDriver, "Form Authentication");
        LoginPage.as(webDriver,"tomsmith","SuperSecretPassword!");
        String result = GetTextAlertSecureArea.getTextAlert(webDriver);
        Assert.assertTrue(result.contains("You logged into a secure area!"));
    }
}
