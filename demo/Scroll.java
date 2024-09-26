package demo;

import junit.framework.Assert;
import junit.runner.Version;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Scroll {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,500)");

        Thread.sleep(2000);

//  First working variant for table scroll
//        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");



//  Second working variant for table scroll
        WebElement table = driver.findElement(By.className("tableFixHead"));
        js.executeScript("arguments[0].scrollTop += 200;", table);
        Thread.sleep(2000);

        List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));

        int sum = 0;
        for (int i =0; i < values.size(); i++){
            //System.out.println(values.get(i).getText());
            int value = Integer.parseInt(values.get(i).getText());

            sum = sum + value;
        }

        System.out.println(sum);
        int totalValue = Integer.parseInt(driver.findElement(By.xpath("/html/body/div[3]/div[2]/fieldset[2]/div[2]")).getText().split(":")[1].trim());
        Assert.assertEquals(sum, totalValue);
        driver.quit();
    }
}
