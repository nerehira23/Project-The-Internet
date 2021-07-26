package tasks.formAuth;

import actions.GetText;
import org.openqa.selenium.WebDriver;
import ui.SecureAreaUI;

public class GetTextAlertSecureArea {

    public static String getTextAlert(WebDriver webDriver){
        return GetText.getText(webDriver, SecureAreaUI.alert);
    }

}
