
package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class ResponseCodeExample {
    public static void main(String[] args) throws IOException {
        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // Find the link element and get its href attribute
        String url = driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[2]/ul/li[2]/a")).getAttribute("href");

        // Open an HTTP connection to the URL
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        conn.setRequestMethod("HEAD");
        conn.connect();

        // Get the response code
        int respCode = conn.getResponseCode();
        System.out.println("Response code: " + respCode);


        // Close the connection and the browser
        conn.disconnect();
        driver.quit();
    }
}

