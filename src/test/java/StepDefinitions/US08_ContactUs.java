package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.awt.*;
import java.awt.event.KeyEvent;

public class US08_ContactUs {

    DialogContent dc = new DialogContent();

    @When("Click on Element")
    public void clickOnElement(DataTable dataTable) {
        dc.myClick(dc.contactUsButton);
    }

    @And("Select Information's")
    public void selectInformations(DataTable dataTable) throws InterruptedException {
        Thread.sleep(2000);
        dc.mySelectValue(dc.selectCustomerService, "2");
        Thread.sleep(2000);
        dc.mySelectIndex(dc.selectOrderNumber, 1);
        Thread.sleep(2000);
        dc.mySelectIndex(dc.selectProduct, 3);

    }


    @Then("User Send Keys")
    public void userSendKeys(DataTable dataTable) {
        dc.mySendkeys(dc.emailInput, "Tester@outlook.com");
        dc.mySendkeys(dc.textInput, "Banka havalesi henüz yapıldı, ödeme dekontu ektedir\nFirstname: Techno\nLastname: Tester");
    }

    @When("User Upload File")
    public void userUploadFile(DataTable dataTable) throws AWTException, InterruptedException {
        dc.myClick(dc.chooseFileButton);

        Robot robot = new Robot();
        Thread.sleep(2000);
        for (int i = 0; i < 5; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }
        Thread.sleep(2000);
        for (int i = 0; i < 20; i++) {
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_DOWN);
        }
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(2000);
        for (int i = 0; i < 4; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);

        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        dc.myClick(dc.sendButton);
        dc.veifyContainsText(dc.successMessage, "Your message has been successfully sent to our team.");


    }
}