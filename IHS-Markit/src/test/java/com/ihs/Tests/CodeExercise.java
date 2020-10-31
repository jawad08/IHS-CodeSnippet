package com.ihs.Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;
import utility.InitiateBrowser;
import com.ihs.page.LandingPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CodeExercise {

    String browser = "Chrome";

    @Test
    public void verifyHelloWorld(){
        WebDriver driver = InitiateBrowser.startBrowser(browser,LandingPage.baseURL);

        LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);

        landingPage.verifyHelloWorld();

        driver.quit();
    }

    @Test
    public void verifyShareLinkAttribute(){
        WebDriver driver = InitiateBrowser.startBrowser(browser,LandingPage.baseURL);

        LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);

        landingPage.verifyShareLinkAttribute();

        driver.quit();
    }
}
