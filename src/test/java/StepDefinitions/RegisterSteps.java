package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Random;

public class RegisterSteps {

    DialogContent dc=new DialogContent();
    @Given("CleverPPC de hesap olusturma sayfasina git")
    public void cleverppc_De_Hesap_Olusturma_Sayfasina_Git() {

        GWD.getDriver().get("https://cleverppc.com/prestashop4//");

        dc.myClick(dc.signInButton);
        dc.mySendkeys(dc.emailCreate,"2@mail.ru");
        dc.myClick(dc.createBtn);


    }


    @Then("Kullanici basariyla kayit yaptigini dogrular.")
    public void kullaniciBasariylaKayitYaptiginiDogrular() {

        Assert.assertTrue(dc.succesMessage.isDisplayed());

    }

    @When("Kullanici tum zorunlu bilgileri doldurdukta sonra Register butonuna tiklar.")
    public void kullaniciTumZorunluBilgileriDoldurduktaSonraRegisterButonunaTiklar() {

        dc.myClick(dc.gender.get(new Random().nextInt(dc.gender.size())));
        dc.mySendkeys(dc.firstName,"Ad");
        dc.mySendkeys(dc.lastName,"Da");
        dc.mySendkeys(dc.passwordInput,"123456");
        dc.myClick(dc.days.get(new Random().nextInt(dc.days.size())));
        dc.myClick(dc.months.get(new Random().nextInt(dc.months.size())));
        dc.myClick(dc.years.get(new Random().nextInt(dc.years.size())));
        dc.myClick(dc.registerbtn);
        }
}

