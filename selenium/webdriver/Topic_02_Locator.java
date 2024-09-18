package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Topic_02_Locator {

    WebDriver driver;

    @BeforeClass
    public void beforeclass(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Test
    public void TC_01_GotoLinkGoogle() {

        String txtFirstName = "//input[@id='firstName']";
        String txtLastName = "//input[@id='lastName']";
        String url = "https://glab-v2.khgc.dev/register";
        String txtEmail = "//input[@id='emailInput']";
        String txtPass = "//input[@id='passwordInput']";
        String txtConfirmPass = "//input[@id='passwordCfmInput']";
        String checkboxAgree = "//input[@id='agreeCkb']";
        String btnRegister = "(//button[@type='submit'])[2]";

        driver.get(url);
        driver.findElement(By.xpath(txtFirstName)).sendKeys("First Name");
        driver.findElement(By.xpath(txtLastName)).sendKeys("Last Name");
        driver.findElement(By.xpath(txtEmail)).sendKeys("abc@gmail.com");
        driver.findElement(By.xpath(txtPass)).sendKeys("Test@123123");
        driver.findElement(By.xpath(txtConfirmPass)).sendKeys("Test@123123");
        driver.findElement(By.xpath(checkboxAgree)).click();
        driver.findElement(By.xpath(btnRegister)).click();
    }

    @AfterClass
    public void afterclass(){
    //    driver.quit();
    }

}
