package com.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Inputs {
    @Test
            public void inputTest() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://the-internet.herokuapp.com/inputs";
        driver.get(url);
        driver.manage().window().maximize();

        //add number to input
        WebElement inputChar= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/input"));
        inputChar.click();
        inputChar.sendKeys("3678887266");
        //Assert.assertTrue(inputChar.getText().contains("3678887266"));
        Assert.assertTrue(inputChar.isDisplayed());
        inputChar.clear();
        driver.close();
    }
}
