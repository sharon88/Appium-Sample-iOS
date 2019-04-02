package Script;

import Pages.DeleteRecipe;
import org.testng.annotations.Test;

public class DeleteRecipeTest extends Config{

    public DeleteRecipe deleteRecipe;

    @Test
    public void deleteRecipe(){
        deleteRecipe = new DeleteRecipe(driver);
        deleteRecipe.deleteRecipe();
    }
}
