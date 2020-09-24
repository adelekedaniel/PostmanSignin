package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    //import selenium webdriver
    private WebDriver driver;
    //import chrome driver
    public void setUp()throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        //get the url
        driver.get("https://identity.getpostman.com/login");
        //page wait for complete loading
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //maximize page
        driver.manage().window().maximize();
        //get page title
        System.out.println(driver.getTitle());
        //get username
        driver.findElement(By.id("username")).sendKeys("ihamlord");
        //get password
        driver.findElement(By.id("password")).sendKeys("Adeleke123");
        //click on the sign in button
        driver.findElement(By.xpath("//*[@id=\"sign-in-btn\"]")).click();

        //wait
        Thread.sleep(100000);
        //close window
        driver.quit();

    }
    public static void main(String args[])throws InterruptedException {
        LoginTest test = new LoginTest();
        test.setUp();
    }

}