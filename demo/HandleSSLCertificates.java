package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static java.lang.System.*;

public class HandleSSLCertificates {
    public static void main(String[] args) throws InterruptedException {

        // Create an instance of ChromeOptions
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);

        // Create a new instance of the Chrome driver with the options
        WebDriver driver = new ChromeDriver(options);

        // Navigate to a website with an invalid SSL certificate
        driver.get("https://self-signed.badssl.com/");

        Thread.sleep(5000);

        // Perform your tests
        System.out.println("Page title is: " + driver.getTitle());


        // Close the browser
        driver.quit();
    }

}
