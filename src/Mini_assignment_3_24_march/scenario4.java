package Mini_assignment_3_24_march;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scenario4
{
    public static void main(String [] args)throws  InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        openurl(driver);

    }

    public static void openurl(WebDriver driver)throws  InterruptedException
    {
        driver.get("https://www.goibibo.com/");
        driver.manage().window().maximize();
        Actions a = new Actions(driver);
        driver.findElement(By.cssSelector(".sc-GEbAx.izHSju")).click();
    }
}
