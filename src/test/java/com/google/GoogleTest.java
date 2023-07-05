package com.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest {

    @Test
    public void googleTest() {
        //instantiem driverul
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //deschidem google
        String url = "https://www.google.ro/";
        driver.get(url);

        //maximizare pagina
        driver.manage().window().maximize();

        //verificam pagina curenta
        Assert.assertEquals(url, driver.getCurrentUrl());


        //inchidem pagina
        driver.close();

    }
}
