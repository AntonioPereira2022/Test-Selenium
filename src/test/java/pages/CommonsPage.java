package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CommonsPage {

    //Classe para agrupar métodos utilizados diversar vezes dentro do projeto
    //Motivo: para não duplicar códigos.

    static WebDriver driver;

    public CommonsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selecionarCombo(WebElement element, String text) {
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public void escrever(WebElement element, String text) {
        esperarElementoAparecer(element);
        element.sendKeys(text);
    }

    public void clicar(WebElement element) {
        esperarElementoAparecer(element);
        element.click();
    }

    public void esperarElementoAparecer(WebElement element) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(element));

    }

}

