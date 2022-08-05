package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CadastrarPage {

    WebDriver driver;

    @FindBy(id = "id_gender1")
    public WebElement gender;

    @FindBy(css = ".required > label")
    public WebElement lblFirstName;

    @FindBy(id = "customer_firstname")
    public WebElement firstNameCustomer;

    @FindBy(id = "customer_lastname")
    public WebElement lastNameCustomer;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "passwd")
    public WebElement passwd;

    @FindBy(id = "days")
    public WebElement days;

    @FindBy(id = "months")
    public WebElement months;

    @FindBy(id = "years")
    public WebElement years;

    @FindBy(id = "firstname")
    public WebElement firstname;

    @FindBy(id = "lastname")
    public WebElement lastname;

    @FindBy(id = "company")
    public WebElement company;

    @FindBy(id = "address1")
    public WebElement address1;

    @FindBy(id = "address2")
    public WebElement address2;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "id_state")
    public WebElement id_state;

    @FindBy(id = "postcode")
    public WebElement postcode;

    @FindBy(id = "id_country")
    public WebElement id_country;

    @FindBy(id = "other")
    public WebElement other;

    @FindBy(id = "phone")
    public WebElement phone;

    @FindBy(id = "phone_mobile")
    public WebElement phoneMobile;

    @FindBy(id = "alias")
    public WebElement alias;

    @FindBy(id = "submitAccount")
    public WebElement submitAccount;

    CommonsPage commonsPage;

    public CadastrarPage(WebDriver driver) {
        this.driver = driver;
        commonsPage = new CommonsPage(driver);
        PageFactory.initElements(driver, this);
    }

    public String validarPaginaCreateAnAccount() {
        commonsPage.esperarElementoAparecer(lblFirstName);
        return lblFirstName.getText();
    }

//    public void preencherData() {
//        commonsPage.selecionarCombo(days, "23");
//        commonsPage.selecionarCombo(months, "June");
//        commonsPage.selecionarCombo(years, "1989");
//    }

}

