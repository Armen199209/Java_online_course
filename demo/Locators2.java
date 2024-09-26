package demo;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class Locators2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web driver.chrome.driver", "/Users/armenavagyan/Desktop/Udemy3/chromedriver-mac-arm64/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        String username = getPassword(driver);
        String name = "Sam";
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(name);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(username);
        driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();

        String actualResult = driver.findElement(By.xpath("//div[@class='login-container']/p")).getText();
        System.out.println(actualResult);
        Assert.assertEquals(actualResult , "You are successfully logged in.");

        String helloUser = driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText();
        System.out.println(helloUser);
        Assert.assertEquals(helloUser, "Hello "+ name +",");

        driver.findElement(By.xpath("//button[text()='Log Out']")).click();

        Thread.sleep(3000);
        driver.quit();

    }

    public static String getPassword(WebDriver driver) throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.xpath("//div[@class='forgot-pwd-container']/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
        Thread.sleep(2000);
        String passwordText = driver.findElement(By.xpath("//form/p[@class='infoMsg']")).getText();
        String[] passwordArray = passwordText.split("'");
        String password = passwordArray[1].split("'")[0];
        return password;
    }
}
