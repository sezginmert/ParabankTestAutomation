package pages;

import base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends BaseTest {

    @Step("Kullanici kontrolu")
    public void accountControl(String value){
        String text = driver.findElement(By.cssSelector("[class='smallText']")).getText();

        Assert.assertEquals(value,text);


    }

    @Step("Kullanici olusturma kontrolu")

    public void registerControl(String value){
        String text =  driver.findElement(By.cssSelector("[class='title']")).getText();
        System.out.println(text);

        Assert.assertEquals(value ,text);
    }
}
