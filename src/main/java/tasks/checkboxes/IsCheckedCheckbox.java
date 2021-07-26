package tasks.checkboxes;

import actions.GetStatus;
import org.openqa.selenium.WebDriver;
import ui.CheckboxesUI;

public class IsCheckedCheckbox {
    public static boolean check(WebDriver webDriver, String textCheckbox) {
        return GetStatus.isSelected(webDriver, CheckboxesUI.getCheckbox(textCheckbox));
    }
}
