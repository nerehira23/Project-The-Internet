package tasks.checkboxes;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.CheckboxesUI;

public class CheckCheckbox {
    public static void check(WebDriver webDriver, String textCheckbox) {
        if (!IsCheckedCheckbox.check(webDriver, textCheckbox))
            Click.on(webDriver, CheckboxesUI.getCheckbox(textCheckbox));
    }
}
