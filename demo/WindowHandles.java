package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class WindowHandles {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebDriverWait expliciteWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().window().fullscreen();

        driver.get("https://rahulshettyacademy.com/loginpagePractise/");

        driver.findElement(By.xpath("//a[@class='blinkingText']")).click();


        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentId = it.next();
        String childId = it.next();

        driver.switchTo().window(childId);

        System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText());
        String getUsername = driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("with")[0].split("at")[1].trim();
        System.out.println(getUsername);

        driver.switchTo().window(parentId);
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(getUsername);

        Thread.sleep(3000);
        driver.quit();

    }
}
