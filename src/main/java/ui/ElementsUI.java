package ui;

import org.openqa.selenium.By;

public class ElementsUI {
    public static By btnAdd = By.xpath("//button[@onclick='addElement()']");
    public static By btnFirstAdded = By.xpath("//div[@id=\"elements\"]/button[1]");
}
