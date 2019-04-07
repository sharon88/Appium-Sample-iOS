package Script;

import Pages.UnitConversion;
import org.testng.annotations.Test;

public class UnitConversionTest extends Config {

    @Test (groups = {"three", "two"})
    public void navaigateToTempConversion() {
        UnitConversion conversion = new UnitConversion(driver);
        conversion.unitConversionTab.click();
        conversion.temperature.click();
        conversion.temp150.click();
    }
}
