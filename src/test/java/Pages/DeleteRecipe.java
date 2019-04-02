package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteRecipe {

    private AppiumDriver driver;

    public DeleteRecipe(AppiumDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    @iOSXCUITFindBy(accessibility = "Edit")
    public MobileElement editButton;

    @iOSXCUITFindBy(accessibility = "Delete Chocolate Cake, Chocolate cake with chocolate frosting")
    public MobileElement deleteRecipe;

    @iOSXCUITFindBy(accessibility = "Delete")
    public MobileElement deleteButton;

    public void deleteRecipe() {
        editButton.click();
        deleteRecipe.click();
        deleteButton.click();
    }


}
