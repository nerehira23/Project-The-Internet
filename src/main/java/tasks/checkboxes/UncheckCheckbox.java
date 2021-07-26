package tasks.checkboxes;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.CheckboxesUI;

public class UncheckCheckbox {
    public static void uncheck(WebDriver webDriver, String textCheckbox) {
        if (IsCheckedCheckbox.check(webDriver, textCheckbox))
            Click.on(webDriver, CheckboxesUI.getCheckbox(textCheckbox));
    }
}
