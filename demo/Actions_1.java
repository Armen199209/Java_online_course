package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");
        Actions act = new Actions(driver);

        act.moveToElement(driver.findElement(By.xpath("//span[text()='Account & Lists']"))).build().perform();

        Thread.sleep(2000);
        driver.quit();
    }
}
