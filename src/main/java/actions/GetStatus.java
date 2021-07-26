package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetStatus {
    public static boolean isSelected(WebDriver webDriver, By locator){
        try {
            return webDriver.findElement(locator).isSelected();
        } catch (NullPointerException e) {
            return false;
        }
    }

}
