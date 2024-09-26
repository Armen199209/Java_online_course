package demo;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HandleScroll {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        js.executeScript("window.scrollBy(0,500)");


        Thread.sleep(2000);
//        WebElement table = driver.findElement(By.xpath("//div[@class='tableFixHead']"));
//        js.executeScript("arguments[0].scrollTop += 200;", table);

        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");

        List<WebElement> listOfAmount = driver.findElements(By.xpath("//table[@id='product']/tbody/tr/td[4]"));
        int numbersAmount = 0;
        for (int i=0; i<listOfAmount.size(); i++) {
            int amount = Integer.parseInt(listOfAmount.get(i).getText());
            numbersAmount = numbersAmount + amount;
        }
        System.out.println(numbersAmount);
        String str = String.valueOf(numbersAmount);

        String totalAmountCollected = driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim();
        Assert.assertEquals(totalAmountCollected , str);


        Thread.sleep(3000);
        driver.quit();
    }
}
