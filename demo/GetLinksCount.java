package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class GetLinksCount {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebDriverWait expliciteWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().window().maximize();
        Actions a = new Actions(driver);


        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        System.out.println(driver.findElements(By.tagName("a")).size());


        WebElement footerDriver = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
        System.out.println(footerDriver.findElements(By.tagName("a")).size());

        WebElement footerColum = driver.findElement(By.xpath("//tbody/tr/td[1]/ul[1]"));
        System.out.println(footerColum.findElements(By.tagName("a")).size());
        String newTab = Keys.chord(Keys.COMMAND, Keys.RETURN);
        for (int i = 1; i < footerColum.findElements(By.tagName("a")).size(); i++) {
            footerColum.findElements(By.tagName("a")).get(i).sendKeys(newTab);
        }

        // Get window handles
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();

        while (iterator.hasNext()){

            driver.switchTo().window(iterator.next());
            System.out.println("Window title: " + driver.getTitle());
            Thread.sleep(2000);
        }

        Thread.sleep(5000);
        driver.quit();
    }
}
