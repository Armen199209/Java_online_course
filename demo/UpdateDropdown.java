package demo;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UpdateDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        Assert.assertFalse(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());

        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());


        System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
        driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
        Thread.sleep(2000);
        int i = 1;
        while (i < 5) {
            driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
            i++;
        }
        for (int j = 0; j < 3; j++) {
            driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click();
        }

        Assert.assertEquals(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText(), "5 Adult, 3 Child");
        System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());

        Thread.sleep(2000);
        driver.quit();

    }
}
