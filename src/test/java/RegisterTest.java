import base.BaseLibrary;
import base.BaseTest;
import base.TestData;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class RegisterTest extends BaseTest {

        LoginPage loginPage = new LoginPage();
        RegisterPage registerPage = new RegisterPage();

        HomePage homePage = new HomePage();

        @Test(description = "Kullanici olusturma kontrolu")
        public void LoginSuccesfullControl(){

           String userName = creatUserName();
           loginPage.clickRegister();

            registerPage.fillFirstName("Test");
            registerPage.fillLastName("QA");
            registerPage.fillAdress("Cankaya");
            registerPage.fillCity("Ankara");
            registerPage.fillState("Turkey");
            registerPage.fillZipCode("55545");
            registerPage.fillPhoneNumber("54654654546");
            registerPage.fillSSN("89845311");
            registerPage.fillUserName(userName);
            registerPage.fillPassword(password);
            registerPage.repeatedPassword(password);
            registerPage.registerClick();

            String text =  driver.findElement(By.cssSelector("[class='title']")).getText();
            System.out.println(text);

           homePage.registerControl("Welcome "+ userName);


        }




    }


