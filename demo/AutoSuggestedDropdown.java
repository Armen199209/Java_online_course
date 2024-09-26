package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AutoSuggestedDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
        List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));


        for (int i=0; i<options.size(); i++){
            WebElement option = options.get(i);
            if (option.getText().equalsIgnoreCase("India")){
                option.click();
            }
        }

        Thread.sleep(2000);
        driver.quit();
    }
}
