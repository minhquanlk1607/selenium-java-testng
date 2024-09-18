package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Topic_02_Locator {

    WebDriver driver;
    WebDriverWait wait;

    private static final String URL = "https://glab-v2.khgc.dev/register";
    private static final String TXT_FIRST_NAME = "//input[@id='firstName']";
    private static final String TXT_LAST_NAME = "//input[@id='lastName']";
    private static final String TXT_EMAIL = "//input[@id='emailInput']";
    private static final String TXT_PASSWORD = "//input[@id='passwordInput']";
    private static final String TXT_CONFIRM_PASSWORD = "//input[@id='passwordCfmInput']";
    private static final String CHECKBOX_AGREE = "//input[@id='agreeCkb']";
    private static final String BTN_REGISTER = "(//button[@type='submit'])[2]";

    @BeforeClass
    public void beforeClass() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));  // Explicit wait initialization
    }

    private void enterText(String locator, String value) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
        element.clear();
        element.sendKeys(value);
    }

    private void clickElement(String locator) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
        element.click();
    }

    @Test
    public void TC_01_GotoLinkGoogle() {
        driver.get(URL);

        // Enter form data
        enterText(TXT_FIRST_NAME, "First Name");
        enterText(TXT_LAST_NAME, "Last Name");
        enterText(TXT_EMAIL, "abc1@gmail.com");
        enterText(TXT_PASSWORD, "Test@123123");
        enterText(TXT_CONFIRM_PASSWORD, "Test@123123");

        clickElement(CHECKBOX_AGREE);
        clickElement(BTN_REGISTER);
    }

    @AfterClass
    public void afterClass() {
        if (driver != null) {
            driver.quit();  // Ensure proper teardown
        }
    }
}