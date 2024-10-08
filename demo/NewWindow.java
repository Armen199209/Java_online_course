package demo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class NewWindow {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.switchTo().newWindow(WindowType.TAB);

        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> it = windowHandles.iterator();
        String parentWindow = it.next();
        String childWindow = it.next();

        driver.switchTo().window(childWindow);
        driver.get("https://rahulshettyacademy.com/");

        String text = driver.findElements(By.xpath("//a[@href='https://courses.rahulshettyacademy.com/p/get-access-to-all-courses']")).get(1).getText();

        driver.switchTo().window(parentWindow);
        WebElement name = driver.findElement(By.xpath("/html/body/app-root/form-comp/div/form/div[1]/input"));
        name.sendKeys(text);


        // Screenshot
        File file = name.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File(System.getProperty("user.home") + "/Desktop/Udemy3/screenshots/logo.png"));


        // Get Height and Width
        System.out.println(name.getRect().getDimension().getHeight());
        System.out.println(name.getRect().getDimension().getWidth());

        Thread.sleep(3000);
        driver.quit();


        driver.quit();
    }
}
