package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Topic_01_Environment {

    WebDriver driver;

    @Test
    public void TC_01_GotoLinkGoogle() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.quit();
    }

    @Test
    public void TC_02_GotoFacebook() {
        driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        driver.quit();
    }

    @Test
    public void TC_03_GotoYoutube() {
        driver = new EdgeDriver();
        driver.get("https://www.youtube.com/");
        driver.quit();
    }

}
