package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WindowActivities {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web driver.chrome.driver", "/Users/armenavagyan/Desktop/Udemy3/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.manage().window().fullscreen();
        Thread.sleep(2000);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        Thread.sleep(2000);
        driver.navigate().to("https://www.google.com/");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.quit();
    }
}
