import base.BaseTest;
import base.TestData;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MainPage;

public class LoginTests extends BaseTest{

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    MainPage mainPage = new MainPage();


    @Test(description = "Basarili kullanici giris kontrolu")
    public void LoginSuccesfullControl(){

        loginPage.fillUserName(userName);
                loginPage.fillPassword(password);
                loginPage.clickLogin();

        homePage.accountControl("Welcome " + userName);

    }


    @Test(description = "Basarisiz kullanici giris kontrolu")
    public void LoginUnSuccesfullControl(){

        loginPage.fillUserName(userName);
        loginPage.fillPassword("42442");
        loginPage.clickLogin();

       mainPage.erolControlMessage("An internal error has occurred and has been logged.");

    }


    @Test(description = "Required kontrolu")
    public void LoginRequiredControl(){

        loginPage.fillUserName("");
        loginPage.fillPassword("");
        loginPage.clickLogin();


        loginPage.fillUserName(userName);
        loginPage.fillPassword("");
        loginPage.clickLogin();

        mainPage.erolControlMessage("Please enter a username and password.");

        loginPage.fillUserName(userName);
        loginPage.fillPassword(password);
        loginPage.clickLogin();


        homePage.accountControl("Welcome " + userName);


    }



}
