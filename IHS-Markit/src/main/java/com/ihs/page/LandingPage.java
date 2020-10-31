package com.ihs.page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class LandingPage {

    String actual = "Hello World";
    public static String baseURL = "https://dotnetfiddle.net/";
    WebDriver driver;
    WebDriverWait wait;


    @FindBy(id="run-button")
    WebElement runButton;

    @FindBy(id="output")
    WebElement outputField;

    @FindBy(id="Share")
    WebElement shareButton;

    @FindBy(id="ShareLink")
    WebElement shareLink;

    public LandingPage(WebDriver driver){
        this.driver=driver;
        wait = new WebDriverWait(driver,10);
    }

    public void verifyHelloWorld(){
        wait.until(ExpectedConditions.visibilityOf(runButton));
        runButton.click();
        String outputValue = outputField.getText();
        Assert.assertEquals(actual,outputValue);
    }

    public void verifyShareLinkAttribute(){
        shareButton.click();
        wait.until(ExpectedConditions.visibilityOf(shareLink));
        String contentOfShareLink = shareLink.getAttribute("value");
        Assert.assertTrue(contentOfShareLink.startsWith(baseURL));
    }
}
