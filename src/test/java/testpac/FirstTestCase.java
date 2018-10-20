package testpac;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*;


public class FirstTestCase {

    @Test
    public void test001(){
        browser = "chrome";

        open("https://www.google.com.ua");
        $x(".//input[@id='lst-ib']").sendKeys("Selenide");
        $x(".//input[@id='lst-ib']").pressEnter();

        $$x(".//h3[@class='LC20lb']").get(0).shouldHave(Condition.text("Selenide"));


    }
}
