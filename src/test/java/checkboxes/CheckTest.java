package checkboxes;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import tasks.TheInternet;
import tasks.checkboxes.CheckCheckbox;
import tasks.checkboxes.IsCheckedCheckbox;

public class CheckTest extends BaseTest {

    @Test
    public void testSuccessCheckWhenIsChecked() {
        String textCheckbox = "checkbox 1";
        TheInternet.click(webDriver, "Checkboxes");
        CheckCheckbox.check(webDriver, textCheckbox);
        Assert.assertTrue(IsCheckedCheckbox.check(webDriver, textCheckbox));
    }

}
