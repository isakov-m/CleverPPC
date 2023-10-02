package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DataTableSteps {

    DialogContent dc = new DialogContent();


    @And("Click on Element in Dialog")
    public void clickOnElementInDialog(DataTable linkler) {
        List<String> strLinkList = linkler.asList(String.class);

        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebelement = dc.getWebelement(strLinkList.get(i));
            dc.myClick(linkWebelement);
        }


    }

    @And("select a Element in Dialog")
    public void selectAElementInDialog(DataTable selects) {

        List<String> strselectListList = selects.asList(String.class);


        for (int i = 0; i < strselectListList.size(); i++) {
            WebElement selectWebelement = dc.getWebelement(strselectListList.get(i));
            dc.mySelectIndex(selectWebelement, 9);
        }
    }

    @When("User send keys in Dialog")
    public void userSendKeysInDialog(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {

            WebElement e = dc.getWebelement(items.get(i).get(0));
            String text = items.get(i).get(1);
            dc.mySendkeys(e, text);
        }
    }

    @And("Click Save Button in Dialog")
    public void clickSaveButtonInDialog(DataTable buttons) {

        List<String> strButtonList = buttons.asList(String.class);

        for (int i = 0; i < strButtonList.size(); i++) {
            WebElement linkWebElement = dc.getWebelement(strButtonList.get(i));
            dc.myClick(linkWebElement);
        }
    }}
