package main.java.Pages;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static main.java.Support.SingletonDriver.getDriver;

public class TestBase {

    @BeforeSuite
    public void openBrowser(){
        getDriver().get("https://twitter.com/");
    }

    @AfterSuite
    public void closeBrowser(){
        getDriver().quit();
    }
}