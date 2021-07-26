package elements;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import tasks.elements.AddElement;
import tasks.elements.IsAddedButton;
import tasks.TheInternet;


public class AddElementTest extends BaseTest {

    @Test
    public void testSuccessAdd() {
        TheInternet.click(webDriver, "Add/Remove Elements");
        AddElement.add(webDriver);
        Assert.assertTrue(IsAddedButton.check(webDriver));
    }
}
