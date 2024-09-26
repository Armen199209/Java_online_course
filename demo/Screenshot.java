package demo;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Screenshot {
    public static void main(String[] args) throws IOException, WebDriverException {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        // Take the first screenshot and store it as a file format
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Get the path to the Desktop for the first screenshot
        String desktopPath = System.getProperty("user.home") + "/Desktop/Udemy3/screenshots/screenshot.png";
        File destFile = new File(desktopPath);
        // Copy the first file to the destination
        FileUtils.copyFile(srcFile, destFile);
        System.out.println("Screenshot taken and saved at: " + destFile.getAbsolutePath());


//        File srcFile3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(srcFile, new File(System.getProperty("user.home") + "/Desktop/Udemy3/screenshots/screenshot.png"));


        // Set dimensions for the second screenshot
        int width = 800;
        int height = 600;
        driver.manage().window().setSize(new Dimension(width, height));

        // Take the second screenshot and store it as a file format
        File srcFile2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Get the path to the Desktop for the second screenshot
        String desktopPath2 = System.getProperty("user.home") + "/Desktop/Udemy3/screenshots/screenshot2.png";
        File destFile2 = new File(desktopPath2);

        // Copy the first file to the destination
        FileUtils.copyFile(srcFile2, destFile2);
        System.out.println("Second screenshot (800x600) taken and saved at: " + destFile2.getAbsolutePath());


        // Close the browser
        driver.quit();
    }
}