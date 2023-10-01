package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    DialogContent dc=new DialogContent();

    @Given("Navigate to cleverppc")
    public void navigateToCleverppc() {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/");
    }

    @Then("click Sign in button")
    public void clickSignInButton() {
        dc.myClick(dc.signInButton);
    }

    @When("enter your email and password and click sign in button")
    public void enterYourEmailAndPasswordAndClickLoginButton() {
        dc.mySendkeys(dc.emailInput, "abc123@gmail.com");
        dc.mySendkeys(dc.passwordInput, "123456");
        dc.myClick(dc.logInButton);
    }

    @Then("User should be login successfully")
    public void userShouldBeLoginSuccessfully() {
        dc.veifyContainsText(dc.txtCart, "Cart");
    }

    @When("Enter your <email> and <password> and click sign in button")
    public void enterYourEmailAndPasswordAndClickSignInButton(String email,String password) {
        dc.mySendkeys(dc.emailInput, email);
        dc.mySendkeys(dc.passwordInput,password);
        dc.myClick(dc.logInButton);
    }


    @When("Enter fail your email and password and click sign in button")
    public void enterFailYourEmailAndPasswordAndClickSignInButton() {
        dc.mySendkeys(dc.emailInput, "abcc123@gmail.com");
        dc.mySendkeys(dc.passwordInput, "123456");
        dc.myClick(dc.logInButton);
    }
}
