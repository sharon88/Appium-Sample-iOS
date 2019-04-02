package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Common{

    private AppiumDriver driver;

    public Common(AppiumDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }


    public Boolean elementExists(MobileElement id) {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        try {
            id.isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }


    }
}
