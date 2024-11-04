package pages;

import base.BaseTest;
import base.TestData;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.util.Arrays;
import java.util.List;

public class LoginPage extends BaseTest {

    @Step("Kullanici adi alani doldurma")
    public void fillUserName(String text){

        driver.findElement(By.name("username")).sendKeys(text);

    }

    @Step("Password alani doldurma")

    public void fillPassword(String text){
        driver.findElement(By.name("password")).sendKeys(text);

    }

    @Step("Login button tiklanir")
    public void clickLogin(){
        driver.findElement(By.cssSelector("[value='Log In']")).click();
        screenshot();

    }

    @Step("Register button tiklanir")
    public void clickRegister(){
        driver.findElement(By.cssSelector("[href*='register.htm']")).click();
    }


}
