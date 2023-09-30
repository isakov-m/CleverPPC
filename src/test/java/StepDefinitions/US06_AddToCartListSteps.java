package StepDefinitions;

import Pages.DialogContent;
import Pages.Parent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;

public class US06_AddToCartListSteps {

    DialogContent dc = new DialogContent();
    Map<Integer, WebElement> selectedProducts = new HashMap<>();

    @Then("Element Random Click in Dialog")
    public void elementRandomClickInDialog(DataTable linkler) {


        dc.myClick(dc.DressesLink);


        while (selectedProducts.size() < 3) {

            int randomPick = Parent.randomSecim(3);
            WebElement product = dc.PRODUCTS.get(randomPick);


            if (!selectedProducts.containsKey(randomPick)) {
                selectedProducts.put(randomPick, product);
                dc.wait.until(ExpectedConditions.visibilityOf(product));
                dc.wait.until(ExpectedConditions.elementToBeClickable(product));
                dc.myClick(product);
                dc.myClick(dc.addToCartButton);
                dc.myClick(dc.continueShoppingButton);
                dc.myClick(dc.DressesLink);


            }

        }
    }


    @And("Verify your Shopping elements ind Add to Cart")
    public void verifyYourShoppingElementsIndAddToCart(DataTable verify) {
        dc.Hover(dc.shoppingCart);
        Assert.assertEquals(selectedProducts.size(), dc.AddToCartElements.size());


    }
}