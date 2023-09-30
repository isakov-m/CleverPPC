package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class Parent {
    public WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));

    public void myClick(WebElement element) {

        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElemenet(element);
        element.click();

    }

    public void mySendkeys(WebElement element, String text) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        scrollToElemenet(element);
        element.sendKeys(text);

    }

    public void scrollToElemenet(WebElement element) { //islem yapilacak elemente kaydirir sayfayi

        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void clickToElemenet(WebElement element) {  //normal myClick metodu calismadigi durumlarda kullanilarbilir

        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();

        js.executeScript("arguments[0].scrollIntoView(true);", element);

        js.executeScript("arguments[0].click();", element);
    }

    public void veifyContainsText(WebElement element, String value) {
        wait.until(ExpectedConditions.textToBePresentInElement(element, value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()));


    }

    public void mySelect(WebElement element, int index) { //select element secme Metodu -->selectByIndex<-- yerine
        scrollToElemenet(element);                        // selectByValue veya text  kullanilabilir
        Select nesneSelect = new Select(element);
        nesneSelect.selectByIndex(index);

    }

    public static int randomSecim(int limit) { // Random secim Metodu
        return (int) (Math.random() * limit);
    }

    public void Hover(WebElement element) { //Acilir alt menüsü olan elementin üzerine gitme Metodu
        Actions actions = new Actions(GWD.getDriver());
        Action action = actions.moveToElement(element).build();
        action.perform();
    }

    public void BackPage() {  //sayfayi bir önceki sayfaya götürür

        GWD.getDriver().navigate().back();
    }

    public void savedElement(WebElement element) {  //bir elementi list e atar, getText ini alir ve yazdirir
        wait.until(ExpectedConditions.visibilityOf(element));
        List<String> savedElement = new ArrayList<>();
        String save = element.getText();
        savedElement.add(save);
        System.out.println("SavedElement = " + savedElement);
    }


}
