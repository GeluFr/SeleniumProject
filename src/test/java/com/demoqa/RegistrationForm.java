package com.demoqa;

import org.checkerframework.checker.nullness.qual.EnsuresKeyForIf;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class RegistrationForm {

    WebDriver driver;
    String url = "https://demoqa.com/automation-practice-form";

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Test
    public void registrationFormTest() throws InterruptedException {

        //First name
        WebElement firstNameInput = driver.findElement(By.id("firstName"));
        firstNameInput.sendKeys("Fratean");

        //Last name
        WebElement lastNameInput = driver.findElement(By.id("lastName"));
        lastNameInput.sendKeys("Gelu-Marius");

        //email
        WebElement emailInput = driver.findElement(By.id("userEmail"));
        emailInput.sendKeys("frateangelu@gmail.com");

        //Gender select
        WebElement genderSelect = driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label"));
        genderSelect.click();

        //Mobile
        WebElement mobileInput = driver.findElement(By.id("userNumber"));
        mobileInput.sendKeys("0746283219");

        //Date of birth

        WebElement birthDateSelect = driver.findElement(By.id("dateOfBirthInput"));
        birthDateSelect.click();

                //month
        WebElement monthSelect = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
        Select monthSelect1 = new Select(monthSelect);
        monthSelect1.selectByValue("5");

               //year
        WebElement yearSelect = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
        Select yearSelect1 = new Select(yearSelect);
        yearSelect1.selectByValue("1994");

              //day
        WebElement daySelect = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[5]"));
        daySelect.click();

        //Subjects
        WebElement subjectsInput = driver.findElement(By.xpath("//*[@id=\"subjectsInput\"]"));
        subjectsInput.sendKeys("Economics");
        new Actions(driver).sendKeys(Keys.ARROW_DOWN).perform();
        new Actions(driver).sendKeys(Keys.ENTER).perform();

        subjectsInput.sendKeys("History");
        new Actions(driver).sendKeys(Keys.ARROW_DOWN).perform();
        new Actions(driver).sendKeys(Keys.ENTER).perform();

        subjectsInput.sendKeys("Computer Science");
        new Actions(driver).sendKeys(Keys.ARROW_DOWN).perform();
        new Actions(driver).sendKeys(Keys.ENTER).perform();

        //Hobbies
        WebElement hobbySports  = driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label"));
        hobbySports.click();


        WebElement hobbyMusic = driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label"));
        hobbyMusic.click();

        //Picture
        WebElement picUpload = driver.findElement(By.id("uploadPicture"));
        picUpload.sendKeys("C:\\Users\\User\\IdeaProjects\\myFirstSeleniumProject\\src\\test\\java\\com\\demoqa\\images.jpeg");

        //Current Address
        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Str.Memorandumului, nr.1, Cluj-Napoca,Romania, zip code 400534");















    }



}
