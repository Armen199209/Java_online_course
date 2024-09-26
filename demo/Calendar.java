package demo;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Calendar {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebDriverWait expliciteWait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        driver.manage().window().maximize();
        Actions a = new Actions(driver);


        String monthNumber = "6";
        String date = "15";
        String year = "2027";

        String[] expectedResult = {monthNumber, date, year};

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        // Open the date picker
        driver.findElement(By.xpath("//div[@class='react-date-picker__inputGroup']")).click();

        // Navigate to the year selection
        driver.findElement(By.xpath("//span[@class='react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from']")).click();
        driver.findElement(By.xpath("//span[@class='react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from']")).click();

        // Select the desired year
        driver.findElement(By.xpath("//button[text()='" + year + "']")).click();

        // Select the desired month (assuming months are 0-based)
        driver.findElements(By.xpath("//button[@class='react-calendar__tile react-calendar__year-view__months__month']")).get(Integer.parseInt(monthNumber) - 1).click();

        // Select the desired day
        driver.findElement(By.xpath("//abbr[text()='" + date + "']")).click();


        // Fetch the value of the date picker inputs
        List<WebElement> actualList = driver.findElements(By.xpath("//input[contains(@class, 'react-date-picker__inputGroup__input')]"));

        // Assuming expectedResult contains the expected values in the same order as the input fields
        for (int i = 0; i < actualList.size(); i++) {
            System.out.println(actualList.get(i).getAttribute("value"));
            Assert.assertEquals(actualList.get(i).getAttribute("value"), expectedResult[i]);
        }


        Thread.sleep(3000);
        driver.quit();
    }
}
