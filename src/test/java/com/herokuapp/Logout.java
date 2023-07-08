package com.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Logout {
    @Test
    public void logoutTest(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://the-internet.herokuapp.com/login";
        driver.get(url);
        driver.manage().window().maximize();

        //enter username
        WebElement usernameInput = driver.findElement(By.id("username"));
        usernameInput.sendKeys("tomsmith");


        //enter password
        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys("SuperSecretPassword!");
        //click login

        //WebElement loginButon = driver.findElement(By.tagName("button"));
        WebElement loginButton = driver.findElement(By.className("radius"));
        loginButton.click();

        //tema
        //Logout

        WebElement logoutButton = driver.findElement(By.className("icon-signout"));
        logoutButton.click();

        WebElement logoutArea = driver.findElement(By.xpath("//*[@id=\"flash\"]"));
        Assert.assertTrue(logoutArea.getText().contains("You logged out of the secure area!"));
        driver.close();


    }
}
