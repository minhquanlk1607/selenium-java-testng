package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.time.Duration;

public class Topic_04_Register {

    WebDriver driver;

    @BeforeClass
    public void beforeclass(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Test
    public void Register_01_Empty_data() {
        driver.get("https://alada.vn/tai-khoan/dang-ky.html/");
        //action
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        //expected result
        Assert.assertEquals(driver.findElement(By.xpath("//label[@id='txtFirstname-error']")).getText(),"Vui lòng nhập họ tên");
        Assert.assertEquals(driver.findElement(By.xpath("//label[@id='txtEmail-error']")).getText(),"Vui lòng nhập email");
        Assert.assertEquals(driver.findElement(By.xpath("//label[@id='txtCEmail-error']")).getText(),"Vui lòng nhập lại địa chỉ email");
        Assert.assertEquals(driver.findElement(By.xpath("//label[@id='txtPassword-error']")).getText(),"Vui lòng nhập mật khẩu");
        Assert.assertEquals(driver.findElement(By.xpath("//label[@id='txtCPassword-error']")).getText(),"Vui lòng nhập lại mật khẩu");
        Assert.assertEquals(driver.findElement(By.xpath("//label[@id='txtPhone-error']")).getText(),"Vui lòng nhập số điện thoại.");
    }
    @Test
    public void Register_02_Invalid_PhoneNumber() {
        driver.get("https://alada.vn/tai-khoan/dang-ky.html/");
        //Action
        //case1: - Less then 10 char
        driver.findElement(By.xpath("//input[@id='txtFirstname']")).sendKeys("Test Name");
        driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("testEmail@gmail.com");
        driver.findElement(By.xpath("//input[@id='txtCEmail']")).sendKeys("testEmail@gmail.com");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("123@123");
        driver.findElement(By.xpath("//input[@id='txtCPassword']")).sendKeys("123@123");
        driver.findElement(By.xpath("//input[@id='txtPhone']")).sendKeys("0123");

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        //expected result
        Assert.assertEquals(driver.findElement(By.xpath("//label[@id='txtPhone-error']")).getText(),"Số điện thoại phải từ 10-11 số.");

    }

    @AfterClass
    public void afterclass(){driver.quit();}

}
