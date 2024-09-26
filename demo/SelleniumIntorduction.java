package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SelleniumIntorduction {
    public static void main(String[] args) {
        System.setProperty("web driver.chrome.driver", "/Users/armenavagyan/Desktop/Udemy3/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
//        WebDriver driver = new FirefoxDriver();
//        WebDriver driver = new SafariDriver();

        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.quit();


    }
}
