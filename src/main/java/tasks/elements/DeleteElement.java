package tasks.elements;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.ElementsUI;

public class DeleteElement {

    public static void delete(WebDriver webDriver) {
        Click.on(webDriver, ElementsUI.btnFirstAdded);
    }
}
