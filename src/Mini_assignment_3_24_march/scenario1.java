package Mini_assignment_3_24_march;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

import javax.swing.*;

public class scenario1
{
    public static void main(String [] args)throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        openurl(driver);

    }

    public static void openurl(WebDriver driver)throws  InterruptedException
    {
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[normalize-space()='Frames']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Nested Frames']")).click();
       driver.switchTo().frame("LEFT");
      String t = driver.getTitle();
        System.out.println(t);
        driver.quit();
    }

}
