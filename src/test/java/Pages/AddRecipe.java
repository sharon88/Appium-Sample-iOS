package Pages;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRecipe {

    private AppiumDriver driver;

    public AddRecipe(AppiumDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    @iOSXCUITFindBy(accessibility = "Add")
    public MobileElement addRecipe;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Recipes\"]")
    public MobileElement editBox;

    @iOSXCUITFindBy(accessibility = "Save")
    public MobileElement saveButton;

    @iOSXCUITFindBy(accessibility = "Preparation time:")
    public MobileElement description;

}
