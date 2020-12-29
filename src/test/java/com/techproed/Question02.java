package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Question02 {
    static WebDriver driver;

    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Before
    public void testtenOnce(){
        driver.get("https://www.google.com");
    }

    @Test
    public void test01(){

        WebElement aramaKutusu=driver.findElement(By.name("q"));
        aramaKutusu.sendKeys("zoom");
        aramaKutusu.submit();

    }
    @Test
    public void test02(){

        WebElement aramaKutusu=driver.findElement(By.name("q"));
        aramaKutusu.sendKeys("selenium");
        aramaKutusu.submit();

    }

    @Test
    public void test03(){

        WebElement aramaKutusu=driver.findElement(By.name("q"));
        aramaKutusu.sendKeys("techproeducation");
        aramaKutusu.submit();

    }

    @After

    public void sonucYazdirma(){
        WebElement sonucSayisi=driver.findElement(By.id("result-stats"));
        System.out.println(sonucSayisi.getText());
    }

    @AfterClass

    public static void tearDown(){
        driver.quit();
    }
}
