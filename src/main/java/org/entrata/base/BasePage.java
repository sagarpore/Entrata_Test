package org.entrata.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void type(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }

    public void clear(By locator) {
        driver.findElement(locator).clear();
    }

    public String getText(By locator) {
        return driver.findElement(locator).getText();
    }

}
