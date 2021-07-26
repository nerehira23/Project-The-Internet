package checkboxes;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import tasks.TheInternet;
import tasks.checkboxes.IsCheckedCheckbox;
import tasks.checkboxes.UncheckCheckbox;

public class UncheckTest extends BaseTest {

    @Test
    public void testSuccessUncheckWhenIsChecked() {
        String textCheckbox = "checkbox 2";
        TheInternet.click(webDriver, "Checkboxes");
        UncheckCheckbox.uncheck(webDriver, textCheckbox);
        Assert.assertFalse(IsCheckedCheckbox.check(webDriver, textCheckbox));
    }

}
