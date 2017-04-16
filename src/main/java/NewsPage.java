package main.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class NewsPage {

    private WebDriver driver;

    @FindBy(xpath = ".//li[1]//a[@class='tweet-timestamp js-permalink js-nav js-tooltip']/span[1]")
    private WebElement firstPostTime;

    public NewsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void checkTimeOfLastPost(){
        WebDriverWait wait = new WebDriverWait(driver, 5);

        //get time of post in milliseconds
        String postTime = wait.until(ExpectedConditions.elementToBeClickable(firstPostTime)).getAttribute("data-time-ms");
        long postTimeInLong = Long.parseLong(postTime);

        //get current time in milliseconds
        long currentTime = System.currentTimeMillis();

        //calculate difference between current time and time of post
        long difference = currentTime - postTimeInLong;
        long differenceInHours = TimeUnit.MILLISECONDS.toHours(difference);

        Assert.assertTrue(differenceInHours < 24);
    }
}
