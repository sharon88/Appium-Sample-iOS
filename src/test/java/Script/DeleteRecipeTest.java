package Script;

import Pages.DeleteRecipe;
import org.testng.annotations.Test;

public class DeleteRecipeTest extends Config{

    public DeleteRecipe deleteRecipe;

    @Test (groups = "two")
    public void deleteRecipe(){
        deleteRecipe = new DeleteRecipe(driver);
        deleteRecipe.deleteRecipe();
    }
}
