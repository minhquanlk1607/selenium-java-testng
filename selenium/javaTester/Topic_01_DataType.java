package javaTester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.List;

public class Topic_01_DataType {
    int iNumber = 123456;
    float fNumber = 15.9f;
    double dNumber = 16.9d;
    boolean isDeleted = false;

    String empID = "EM001";
    String[] listEmpName = {"ABC","DEF","GHI"};
    int[] listEmpAge = {10,11,12};


    //Kiểu dữ liệu tham chiếu
    //class
    ChromeDriver chromeDriver = new ChromeDriver();

    //Interface
    WebDriver driver = new ChromeDriver();

    //Collection
    List<WebElement> textBoxes = driver.findElements(By.xpath("//input[@name='email']"));
    ArrayList<String> empCity = new ArrayList<String>();
}
