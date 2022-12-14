package com.rootcodelabs.java.day7.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
    private final WebDriver driver;
    @FindBy(id = "welcome")
    private WebElement lnkWelcome;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getWelcomeMessage() {
        return lnkWelcome.getText();


    }
}
