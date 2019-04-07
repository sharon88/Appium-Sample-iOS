package Script;

import Pages.AddRecipe;
import Pages.Common;
import org.testng.annotations.Test;



public class AddRecipeTest extends Config {

    public AddRecipe addRecipe;
    public Common common;

    private static String recipeName = "recipe";

    @Test (groups = {"one"})
    public void createRecipe(){
        addRecipe = new AddRecipe (driver);
        addRecipe.addRecipe.click();
        addRecipe.editBox.sendKeys(recipeName);
        addRecipe.saveButton.click();
        common = new Common(driver);
        common.elementExists(addRecipe.description);
    }
}
