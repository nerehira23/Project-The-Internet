package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class IsDisplayed {
    public static boolean element(WebDriver webDriver, By locator){
        List<WebElement> elements = webDriver.findElements(locator);
        if (elements.size() > 0)
            return elements.get(0).isDisplayed();
        return false;
    }
}
