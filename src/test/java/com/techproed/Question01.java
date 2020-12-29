package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Question01 {
    static WebDriver driver;

    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test

    public void test01(){
        driver.get("https://www.google.com");
        String titleGoogle=driver.getTitle();
        Assert.assertTrue(titleGoogle.contains("Google"));
    }

    @Test
    public void test02(){
        driver.get("https://www.amazon.com");
        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.amazon.com"));
    }




    @AfterClass

    public static void tearDown(){
        driver.quit();
    }
}
