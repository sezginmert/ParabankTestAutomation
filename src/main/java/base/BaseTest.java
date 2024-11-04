package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends BaseLibrary{



    @BeforeMethod
    public void openBrowser(){
        driver = new EdgeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");

    }

    @AfterMethod
    public void tearDown(){

        driver.quit();
    }

}
