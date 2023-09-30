package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    // Senol
    @FindBy(xpath = "//a[@title='Log in to your customer account']")
    public WebElement signInButton;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailInput;
    @FindBy(xpath = "//input[@id='passwd']")
    public WebElement passwordInput;
    @FindBy(id = "SubmitLogin")
    public WebElement logInButton;
    @FindBy(xpath = "//a/b")
    public WebElement txtCart;
    @FindBy(xpath = "//a[@title='Sitemap']")
    public WebElement siteMapLink;
    @FindBy(xpath = "//a[@title='View a list of my addresses']")
    public WebElement addressesLink;
    @FindBy(xpath = "(//div[@class]/a)[8]")
    public WebElement addNewAdressBtn;
    @FindBy(xpath = "//input[@id='address1']")
    public WebElement addressInput;
    @FindBy(xpath = "//input[@id='city']")
    public WebElement cityInput;
    @FindBy(xpath = "//input[@id='postcode']")
    public WebElement postCodeInput;
    @FindBy(xpath = "//input[@id='phone']")
    public WebElement homePhoneInput;
    @FindBy(xpath = "//input[@id='phone_mobile']")
    public WebElement mobilePhoneInput;
    @FindBy(xpath = "//textarea[@id='other']")
    public WebElement informationInput;
    @FindBy(xpath = "//select[@name='id_state']")
    public WebElement state;
    @FindBy(xpath = "(//select[@id='id_state']//option)[11]")
    public WebElement selectState;
    @FindBy(xpath = " //button[@id='submitAddress']")
    public WebElement saveButton;
    @FindBy(xpath = "//p//strong[@class='dark']")
    public WebElement succesMessage;
    @FindBy(xpath = "(//ul/li)[12]")
    public WebElement DressesLink;
    @FindBy(xpath = "//span[text()='Add to cart']")
    public WebElement addToCartButton;
    @FindBy(xpath = "//span[@title='Continue shopping']")
    public WebElement continueShoppingButton;
    @FindBy(xpath = "//a[@class='product-name']")
    public List<WebElement> PRODUCTS;
    @FindBy (xpath = "//div[@class='shopping_cart']/a")
    public WebElement shoppingCart;
    @FindBy (xpath = "  //span[@class='quantity']")
    public List<WebElement> AddToCartElements;





















    // Malik
    @FindBy(xpath = "//input[@id='email_create']")
    public WebElement emailCreate;
    @FindBy(xpath = "//*[@id='SubmitCreate']")
    public WebElement createBtn;
    @FindBy(css = "div[class='radio-inline']>label")
    public List<WebElement> gender;
    @FindBy(id = "customer_firstname")
    public WebElement firstName;
    @FindBy(id = "customer_lastname")
    public WebElement lastName;
    @FindBy(id = "days")
    public List<WebElement> days;
    @FindBy(id = "months")
    public List<WebElement> months;
    @FindBy(id = "years")
    public List<WebElement> years;
    @FindBy(id = "submitAccount")
    public WebElement registerbtn;
    @FindBy(css = "[class='alert alert-success']")
    public WebElement registerSuccesMsg;


    // Murat


    // Tuba


    // Emre


    public WebElement getWebelement(String strElement) {

        switch (strElement) {
            case "siteMapLink":
                return this.siteMapLink;
            case "addressesLink":
                return this.addressesLink;
            case "addNewAdressBtn":
                return this.addNewAdressBtn;
            case "state":
                return this.state;
            case "addressInput":
                return this.addressInput;
            case "cityInput":
                return this.cityInput;
            case "postCodeInput":
                return this.postCodeInput;
            case "homePhoneInput":
                return this.homePhoneInput;
            case "mobilePhoneInput":
                return this.mobilePhoneInput;
            case "informationInput":
                return this.informationInput;
            case "selectState":
                return this.selectState;
            case "saveButton":
                return this.saveButton;


        }
        return null;

    }
}
