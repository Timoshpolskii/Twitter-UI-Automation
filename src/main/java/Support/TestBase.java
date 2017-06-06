package main.java.Support;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    @BeforeSuite
    public void openBrowser(){
        SingletonDriver.getDriver().get("https://twitter.com/");
    }

    @AfterSuite
    public void closeBrowser() {
        SingletonDriver.getDriver().quit();
    }
}