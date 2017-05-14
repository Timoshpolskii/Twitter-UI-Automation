package main.java.UI.Support;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static main.java.UI.Support.SingletonDriver.getDriver;

public class TestBase {

    @BeforeSuite
    public void openBrowser(){
        getDriver().get("https://twitter.com/");
    }

    @AfterSuite
    public void closeBrowser() {
        getDriver().quit();
    }
}