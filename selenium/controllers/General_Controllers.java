package controllers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class General_Controllers {
    public static WebDriverWait wait;
    public static WebDriver driver;

    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        StringBuilder randomString = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());

            randomString.append(characters.charAt(index));
        }

        return randomString.toString();
    }
    public static String generateRandomEmail() {
        String randomEmail = "autoEmail"+ generateRandomString(4) + "@gmail.com";
        return randomEmail;
    }

    public static String generateRandomNumber(int length) {
        String numbers = "0123456789";

        StringBuilder randomNumber = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(numbers.length());

            randomNumber.append(numbers.charAt(index));
        }
        return randomNumber.toString();
    }

    public static String generateRandomAlphabet(int length) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        StringBuilder randomAlphabet = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(alphabet.length());

            randomAlphabet.append(alphabet.charAt(index));
        }
        return randomAlphabet.toString();
    }

    public static void enterText(String locator, String value) {
//        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
        WebElement element = driver.findElement(By.xpath(locator));
                element.clear();
        element.sendKeys(value);
    }
    public static void clickElement(String locator) {
        WebElement element = driver.findElement(By.xpath(locator));
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
        element.click();
    }
}

/*
* Anh ơi quán cf đuổi e r, e push lên git hub a clone về fix cho e vs đc ko
* oke a clone về r
*ể a xem cho
* da giờ e ve
* bye anh nha thanko ke oke bye e
* */
