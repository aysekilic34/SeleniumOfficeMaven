package com.techproed;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class Question07 {
     WebDriver driver;
     SoftAssert softAssert=new SoftAssert();
    @BeforeClass
    public  void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test01(){
        driver.get("https://www.amazon.com");
        String titleAmazon=driver.getTitle();
        softAssert.assertTrue(titleAmazon.contains("Amazon"));
        softAssert.assertAll();
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
