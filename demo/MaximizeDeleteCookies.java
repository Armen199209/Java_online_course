package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeDeleteCookies {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("http://www.google.com");
        driver.quit();
    }
}
