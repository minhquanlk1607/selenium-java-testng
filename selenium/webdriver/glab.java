package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class glab {

    WebDriver driver;

    @Test
    public void TC_01_Glab() {
        driver = new ChromeDriver();
        driver.get("https://glab-v2.khgc.dev/login");
        driver.quit();
    }
}
