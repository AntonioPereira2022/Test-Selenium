package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {

    WebDriver driver;

    @FindBy(className = "login")
    private WebElement btnSignin;

    @FindBy(id = "email_create")
    private WebElement email;

    @FindBy(id = "SubmitCreate")
    private WebElement createAnAccount;

    @FindBy(css = ".required > label")
    private WebElement firstName;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void entrarNoSite() {
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
    }

    public void clico_em_sing_in_digito_email_no_capmpo_Email_address() {
        btnSignin.click();
        email.sendKeys("novoemailtest@gmail.com");
    }

    public void clico_em_create_an_account() {
        createAnAccount.click();

    }


}

