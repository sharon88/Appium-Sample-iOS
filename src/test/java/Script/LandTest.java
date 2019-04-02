package Script;

import Pages.Common;
import Pages.Landing;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LandTest extends Config {

    public Common common;

    @Test
    public void FirstTest() {
        Landing landing = new Landing(driver);
        landing.chocolateCake.click();
        common = new Common(driver);
        Boolean chocklateState = common.elementExists(landing.chocolateCake);
        Assert.assertTrue(chocklateState, "choclate is not displayed");
    }
}
