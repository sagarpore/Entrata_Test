package org.entrata.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

   public static WebDriver driver = new ChromeDriver();

    public void launchApplication() {
        System.setProperty("webdriver.chrome.driver", "E:\\SDET\\Drivers\\chromedriver-win64\\chromedriver.exe");

        driver.get("https://www.entrata.com/");
        driver.manage().window().maximize();
    }


    public void driverQuit() {
        driver.quit();
    }


}
