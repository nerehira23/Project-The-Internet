package tasks;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.TheInternetUI;

public class TheInternet {

    public static void click(WebDriver webDriver, String link){
        switch (link) {
            case "Form Authentication":
                Click.on(webDriver, TheInternetUI.linkFormAuthentication);
                break;
            case "Add/Remove Elements":
                Click.on(webDriver, TheInternetUI.linkAddRemoveElements);
                break;
            case "Checkboxes":
                Click.on(webDriver, TheInternetUI.linkCheckboxes);
                break;
        }
    }
}
