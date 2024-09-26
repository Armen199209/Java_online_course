package demo.streams;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.stream.Collectors;

public class Stream_2 {
    public static <WebElements> void main (String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        // click on colum
        driver.findElement(By.xpath("//span[normalize-space()='Veg/fruit name']")).click();

        //capture all web elements into list
        List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));

        //capture text of  all web elements into new (original) list
        List<String> originalList = elementList.stream().map(s -> s.getText()).collect(Collectors.toList());

        //sort on the original list of step 3 -> sorted list
        List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());

        //compare original list vs sorted list
        Assert.assertTrue(originalList.equals(sortedList));

        driver.quit();

    }
}
