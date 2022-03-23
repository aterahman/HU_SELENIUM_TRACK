package Mini_assignment_2_23_March;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class assignment2headlessmode
{
    public static void main(String [] args)throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        WebDriver driver = new ChromeDriver(options);
        checkTitle(driver);

    }


    public static void checkTitle(WebDriver driver)throws InterruptedException
    {
        driver.get("https://phptravels.com/demo ");
        driver.manage().window().maximize();

        String t = driver.findElement(By.xpath("//*[name()='text' and @id='PHPTRAVELS']")).getText();
        if(t.equals("PHPTRAVELS"))
            System.out.println("PASS");
        else
            System.out.println("FAIL");

        String parentwindow = driver.getWindowHandle();

        driver.findElement(By.xpath("//a[@class='lvl-0 sign-in btn btn-md btn-white-outline']")).click();
        String t1 = driver.getTitle();

        if(t1.equals(t))
            System.out.println("PASS");
        else
            System.out.println("FAIL");

        driver.switchTo().window(parentwindow);
        System.out.println(driver.getCurrentUrl());
        String parentwindow1 = driver.getWindowHandle();

        driver.findElement(By.xpath("//a[normalize-space()='Pricing']")).click();
        driver.navigate().back();
        driver.navigate().refresh();
        driver.quit();

    }
}
