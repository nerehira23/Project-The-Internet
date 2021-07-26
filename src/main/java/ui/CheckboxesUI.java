package ui;

import org.openqa.selenium.By;

public class CheckboxesUI {
    public static By checkbox1 = By.xpath("//form[@id='checkboxes']/input[1]");
    public static By checkbox2 = By.xpath("//form[@id='checkboxes']/input[2]");

    public static By getCheckbox(String textCheckbox) {
        switch (textCheckbox) {
            case "checkbox 1":
                return checkbox1;
            case "checkbox 2":
                return checkbox2;
        }
        return null;
    }
}
