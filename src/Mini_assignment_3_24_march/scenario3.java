package Mini_assignment_3_24_march;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenario3 {
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
        driver.findElement(By.xpath("//a[normalize-space()='JavaScript Alerts']")).click();
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        String t = driver.switchTo().alert().getText();
        System.out.println(t);
        driver.switchTo().alert().sendKeys(t);
        driver.switchTo().alert().accept();
        String tt = driver.findElement(By.xpath("//p[@id='result']")).getText();
        if(tt.contains(t))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        driver.quit();
    }

}
