package elements;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import tasks.elements.AddElement;
import tasks.elements.DeleteElement;
import tasks.elements.IsAddedButton;
import tasks.elements.IsDeletedButton;
import tasks.TheInternet;

public class DeleteElementTest extends BaseTest {

    @Test
    public void testSuccessDelete() {
        TheInternet.click(webDriver, "Add/Remove Elements");
        AddElement.add(webDriver);
        if (IsAddedButton.check(webDriver))
            DeleteElement.delete(webDriver);
        Assert.assertTrue(IsDeletedButton.check(webDriver));
    }
}
