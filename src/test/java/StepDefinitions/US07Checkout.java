package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US07Checkout {
    DialogContent dc = new DialogContent();

    @And("Shop and Payment")
    public void shopAndPayment(DataTable order) {
        dc.myClick(dc.shoppingCart);
        dc.myClick(dc.proceedCheckoutButton);
        dc.myClick(dc.proceedCheckoutButton);
        dc.myClick(dc.IAgree);
        dc.myClick(dc.proceedCheckoutButton);


    }

    @When("Check the Payment Methods")
    public void checkThePaymentMethods(DataTable paymetMethods) {

        dc.myClick(dc.paypalButton);
        dc.veifyContainsText(dc.paypalMessage, "Things don't appear to be working at the moment. Please try again later.");
        dc.BackPage();
        dc.myClick(dc.creditCardButton);
        dc.veifyContainsText(dc.creditCardMessage, "Invalid request (1).");
        dc.BackPage();
        dc.myClick(dc.bankWireButton);

    }

    @Then("Finish the Payment")
    public void finishThePayment(DataTable PaymentFinish) {
        String Totalprice = dc.totalPrice.getText().replaceAll("[^0-9.,]", "");
        System.out.println("Totalprice = " + Totalprice);
        dc.myClick(dc.confirmButton);
        dc.veifyContainsText(dc.shoppingFinishMessage, "Your order on Xu Clothing is complete.");
        dc.myClick(dc.orderHistory);
        dc.savedElement(dc.orderNumber);

    }
}
