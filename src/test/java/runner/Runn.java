package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {},
        features = "src/test/resources/features",
        tags = {"@teste"},
        glue = {"steps"}
)
public class Runn {

   public static WebDriver driver;

    @BeforeClass                             // executado antes de tudo
    public static void start(){             //sempre antes do teste rodar passa por ele (para instanciar)
        driver = new ChromeDriver();
    }

    @AfterClass                             // executado depois de tudo
    public static void stop(){
        driver.quit();
    }

}
