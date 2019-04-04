package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class UnitConversion {

    public AppiumDriver driver;

    public UnitConversion (AppiumDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    @iOSXCUITFindBy(accessibility = "Unit Conversion") public MobileElement unitConversionTab;

    @iOSXCUITFindBy(accessibility = "Temperature") public MobileElement temperature;

    @iOSXCUITFindBy (accessibility = "150") public MobileElement temp150;

}
