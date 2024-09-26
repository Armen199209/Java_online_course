package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vegetables {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebDriverWait expliciteWait =new WebDriverWait(driver, Duration.ofSeconds(5));

        String[] neededItems = {"Brocolli", "Cucumber", "Beans"};
//        addItems(driver, neededItems);
        Vegetables addItemsList = new Vegetables();
        addItemsList.addItems(driver, neededItems);
        driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
        driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//button[@class='promoBtn']")).click();

        expliciteWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
        System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
        Thread.sleep(3000);
        driver.quit();
    }


    public void addItems(WebDriver driver, String[] neededItems) throws InterruptedException {

        int j = 0;

        List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));

        for (int i = 0; i < products.size(); i++) {
            List<String> neededItemsList = new ArrayList<>(Arrays.asList(neededItems));

            String[] productsFormated = products.get(i).getText().split("-");
            String productsFormatedList = productsFormated[0].trim();

            if (neededItemsList.contains(productsFormatedList)) {
                driver.findElements(By.xpath("//div[@class='product-action']/button[@type='button']")).get(i).click();
                j++;
                if (j == neededItems.length) {
                    break;
                }
            }
        }


    }
}
