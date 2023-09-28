package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AddNewAddress {
    DialogContent dc = new DialogContent();

    @And("Navigate to SiteMap")
    public void navigateToSiteMap() {
        dc.myClick(dc.siteMapLink);
    }

    @Then("Navigate to Addresses Click Add New Address Button")
    public void navigateToAddressesClickAddNewAddressButton() {

        dc.myClick(dc.addressesLink);
        dc.myClick(dc.addNewAdressBtn);
    }

    @Then("Clik to Select Adress Infromations")
    public void clikToSelectAdressInfromations() {
       // dc.mySelect(dc.state, "Florida");
        //dc.myClick(dc.selectState);
        dc.mySelect(dc.state, 4);
    }

    @And("And Send Keys")
    public void AndSendKeys() {
        dc.mySendkeys(dc.addressInput, "Miami Beach");
        dc.mySendkeys(dc.cityInput, "Orlando");
        dc.mySendkeys(dc.postCodeInput, "12345");
        dc.mySendkeys(dc.homePhoneInput, "1234567890");
        dc.mySendkeys(dc.mobilePhoneInput, "9876543210");
        dc.mySendkeys(dc.informationInput, "put on the Garden Door");
    }

    @Then("Click Save Button")
    public void clickSaveButton() {
        dc.myClick(dc.saveButton);
    }


    @Then("Succes Message should be displayed")
    public void succesMessageShouldBeDisplayed() {
        dc.veifyContainsText(dc.succesMessage, "Your addresses are listed below.");
    }


}
