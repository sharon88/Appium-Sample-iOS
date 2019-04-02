package Pages;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class Landing{

    private AppiumDriver driver;

    public Landing(AppiumDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);

    }

    @iOSXCUITFindBy(accessibility = "Chocolate Cake")
    public MobileElement chocolateCake;


}
