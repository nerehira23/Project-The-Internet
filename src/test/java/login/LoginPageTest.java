package login;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import tasks.GetTextAlertSecureArea;
import tasks.LoginPage;
import tasks.TheInternet;

public class LoginPageTest extends BaseTest {

    @Test
    private void testSuccessfulLogin(){
        TheInternet.as(webDriver);
        LoginPage.as(webDriver,"tomsmith","SuperSecretPassword!");
        String result = GetTextAlertSecureArea.getTextAlert(webDriver);
        Assert.assertTrue(result.contains("You logged into a secure area!"));
    }
}
