package tasks.elements;

import actions.IsDisplayed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui.ElementsUI;

public class IsDeletedButton {
    public static boolean check(WebDriver webDriver) {
        WebDriverWait wait = new WebDriverWait(webDriver, 3);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(ElementsUI.btnFirstAdded));
        return !IsDisplayed.element(webDriver, ElementsUI.btnFirstAdded);
    }
}
