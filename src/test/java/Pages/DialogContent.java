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
    @FindBy (xpath = "(//*[ contains( text(), 'Proceed' )  ])[2]")
    public WebElement proceedCheckoutButton;
    @FindBy (xpath = " //div//label")
    public WebElement IAgree;
    @FindBy (xpath = "//input[@id='paypal-standard-btn']")
    public WebElement paypalButton;
    @FindBy (xpath = "//div[@class='message']")
    public WebElement paypalMessage;
    @FindBy (xpath = "(//p[@class='payment_module'])[3]")
    public WebElement creditCardButton;
    @FindBy (xpath = "//body[text()='Invalid request (1).']")
    public WebElement creditCardMessage;
    @FindBy (xpath = " (//p[@class='payment_module'])[1]")
    public WebElement bankWireButton;
    @FindBy (xpath = "//span[@id='amount' and @class='price']")
    public WebElement totalPrice;
    @FindBy (xpath = "//button[@class='button btn btn-default button-medium']")
    public WebElement confirmButton;
    @FindBy (xpath = "//p[@class='alert alert-success']")
    public WebElement shoppingFinishMessage;
    @FindBy (xpath = "//p[@class='cart_navigation exclusive']/a")
    public WebElement orderHistory;
    @FindBy (xpath = "(//td[@class='history_link bold footable-first-column']/a)[1]")
    public WebElement orderNumber;





    // Murat ---> AddToCart : Sepete ürün ekleme

    @FindBy(xpath = "//a[@title='Women']")
    public WebElement Women;

    @FindBy(xpath = "(//*[@title='Summer Dresses'])[1]")
    public WebElement summerDresses;

    @FindBy(xpath = "//a[@class='product-name']")
    public List<WebElement> YazÜrünleri;

    @FindBy(css = "[class='exclusive']")
    public WebElement addToCardBtn;

    @FindBy(xpath = "(//span[@class='title'])[1]")
    public WebElement dogrulamaMesaji;


















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
            case "DressesLink" :
                return this.DressesLink;
            case "PRODUCTS" :
                return (WebElement) this.PRODUCTS;
            case "addToCartButton" :
                return this.addToCartButton;
            case "continueShoppingButton" :
                return this.continueShoppingButton;
            case "shoppingCart" :
                return this.shoppingCart;
            case "AddToCartElements" :
                return (WebElement) this.AddToCartElements;
            case "proceedCheckoutButton" :
                return this.proceedCheckoutButton;
            case "IAgree" :
                return this.IAgree;
            case "paypalButton" :
                return this.paypalButton;
            case "paypalMessage" :
                return this.paypalMessage;
            case "creditCardButton" :
                return this.creditCardButton;
            case "creditCardMessage" :
                return this.creditCardMessage;
            case "bankWireButton" :
                return this.bankWireButton;
            case "totalPrice" :
                return this.totalPrice;
            case "confirmButton" :
                return this.confirmButton;
            case "shoppingFinishMessage" :
                return this.shoppingFinishMessage;
            case "orderHistory" :
                return this.orderHistory;
            case "orderNumber" :
                return this.orderNumber;


        }
        return null;

    }
}
