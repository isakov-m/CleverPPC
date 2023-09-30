package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class AddCart {
    DialogContent dc=new DialogContent();
    @When("Ürün Secme")
    public void ürünSecme() {
        Actions actions=new Actions(GWD.getDriver());
        Action action=actions.moveToElement(dc.Women).build();
        action.perform();
        //actions().scrollByAmount(0,200).build().perform();
        dc.myClick(dc.summerDresses);
    }

    @Then("Ürün Ekleme")
    public void ürünEkleme() {
        int RandomUrun=(int)(Math.random()*dc.YazÜrünleri.size());
        //Actions aktion=new Actions(dc.YazÜrünleri)
        dc.YazÜrünleri.get(RandomUrun).click();
        dc.myClick(dc.addToCardBtn);
    }

    @And("AddToCart Dogrulama")
    public void addtocartDogrulama() {
        dc.veifyContainsText(dc.dogrulamaMesaji,"Product successfully added to your shopping cart");

    }
}
