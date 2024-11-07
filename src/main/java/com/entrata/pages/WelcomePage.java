package com.entrata.pages;

import org.entrata.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage extends BasePage {

    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    public final By acceptCookies = By.xpath("//div[contains(@class,'cookie-button')]//a[@id='cookie-accept']");
    public final By declineCookies = By.xpath("//div[contains(@class,'cookie-button')]//a[@id='cookie-decline']");

    public boolean cookieConsentOptions(String optionName) {
        boolean value;
        if (optionName.equals("Accept")) {
            value = driver.findElement(acceptCookies).isDisplayed();
            System.out.println("Accept Cookies button is present");
        } else {
            value = driver.findElement(declineCookies).isDisplayed();
            System.out.println("Decline Cookies button is present");
        }
        return value;
    }

    public final By scheduleDemoButton = By.xpath("//div[text()='Schedule Your Demo']");
    public final By watchDemoButton = By.xpath("//div[text()='Watch Demo']");

    public void clickOnButton(String buttonName) {
        switch (buttonName) {
            case "Schedule Demo":
                click(scheduleDemoButton);
                break;
            case "Watch Demo":
                click(watchDemoButton);
                break;
        }
    }


    public void fillScheduleDemoDetails(String inputOption, String value) {
        String xpath1 = "//input[@id='";
        String xpath2 = "']";
        
        click(By.xpath(xpath1 + inputOption + xpath2));
        type(By.xpath(xpath1 + inputOption + xpath2), value);

    }


}
