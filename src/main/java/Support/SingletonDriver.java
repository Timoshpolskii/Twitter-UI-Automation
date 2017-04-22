package main.java.Support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonDriver {

    private static WebDriver driver = null;

    private SingletonDriver(){}

    public static synchronized WebDriver getDriver(){
        if (driver == null){
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }
}