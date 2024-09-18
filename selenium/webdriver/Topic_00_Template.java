package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Topic_00_Template {

    WebDriver driver;

    @BeforeClass
    public void beforeclass(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Test

    public void TC_01_GotoLinkGoogle() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com.vn/");

    }

    @AfterClass
    public void afterclass(){driver.quit();}

}
