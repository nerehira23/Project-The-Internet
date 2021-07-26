package tasks.elements;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.ElementsUI;

public class AddElement {

    public static void add(WebDriver webDriver) {
        Click.on(webDriver, ElementsUI.btnAdd);
    }
}
