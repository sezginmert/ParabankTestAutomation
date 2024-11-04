package pages;

import base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class RegisterPage extends BaseTest {

    @Step("First name alani doldurulur")
    public void fillFirstName(String text){
        driver.findElement(By.id("customer.firstName")).sendKeys(text);

    }

    @Step("Last name alani doldurulur")
    public void fillLastName(String text){
        driver.findElement(By.id("customer.lastName")).sendKeys(text);

    }

    @Step("Adres alani doldurulur")
    public void fillAdress(String text){
        driver.findElement(By.id("customer.address.street")).sendKeys(text);

    }

    @Step("City alani doldurulur")
    public void fillCity(String text){
        driver.findElement(By.id("customer.address.city")).sendKeys(text);

    }

    @Step("State alani doldurulur")
    public void fillState(String text){
        driver.findElement(By.id("customer.address.state")).sendKeys(text);

    }

    @Step("ZipCode alani doldurulur")
    public void fillZipCode(String text){
        driver.findElement(By.id("customer.address.zipCode")).sendKeys(text);

    }

    @Step("Phone alani doldurulur")
    public void fillPhoneNumber(String text){
        driver.findElement(By.id("customer.phoneNumber")).sendKeys(text);

    }

    @Step("SSN alani doldurulur")
    public void fillSSN(String text){
        driver.findElement(By.id("customer.ssn")).sendKeys(text);
    }

    @Step("UserName alani doldurulur")
    public void fillUserName(String text){
        driver.findElement(By.id("customer.username")).sendKeys(text);

    }

    @Step("Password alani doldurulur")
    public void fillPassword(String text){
        driver.findElement(By.id("customer.password")).sendKeys(text);

    }

    @Step("Repeated alani doldurulur")
    public void repeatedPassword(String text){
        driver.findElement(By.id("repeatedPassword")).sendKeys(text);
        screenshot();

    }

    @Step("Register buttonu tiklanir")
    public void registerClick(){
        driver.findElement(By.cssSelector("[value=Register]")).click();
    }
}
