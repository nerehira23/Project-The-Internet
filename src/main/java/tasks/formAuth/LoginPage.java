package tasks.formAuth;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.LoginPageUI;

public class LoginPage {

    public static void as(WebDriver webDriver, String user, String pass){
        Enter.text(webDriver, LoginPageUI.username,user);
        Enter.text(webDriver, LoginPageUI.password,pass);
        Click.on(webDriver, LoginPageUI.btnLogin);
    }
}
