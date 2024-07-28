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

    //url
    String url = "https://glab-v2.khgc.dev/login";

    //String input
    String userName = "luffymurom@gmail.com";
    String password = "Quan@123";

    //element
    WebElement txtUsername = driver.findElement(By.xpath("//div//input[@name='email']"));

    Actions action = new Actions(driver);

    @Test
    public void TC_01_GotoLinkGoogle() {
        driver = new ChromeDriver();
        driver.get("https://glab-v2.khgc.dev/login");
        action.sendKeys(txtUsername, userName);
        driver.quit();
    }


}
