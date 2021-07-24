package tasks;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.TheInternetUI;

public class TheInternet {

    public static void as(WebDriver webDriver){
        Click.on(webDriver, TheInternetUI.linkFormAuthentication);
    }
}
