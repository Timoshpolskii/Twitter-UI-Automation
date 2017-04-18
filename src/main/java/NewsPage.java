package main.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class NewsPage {

    private WebDriver driver;

    @FindBy(xpath = ".//span[@class='_timestamp js-short-timestamp js-relative-timestamp']")
    private List<WebElement> timeOfAllPosts;



    private WebElement getPostByIndex(int index){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfAllElements(timeOfAllPosts));

        return timeOfAllPosts.get(index);
    }

    private long getCurrentTime(){
        return System.currentTimeMillis();
    }

    private long getTimeOfPostByIndex(int index){
        String timeOfPost = getPostByIndex(index).getAttribute("data-time-ms");
        return Long.parseLong(timeOfPost);
    }

    public NewsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    public void checkTimeDifferenceByIndex(int index){
        long difference = getCurrentTime() - getTimeOfPostByIndex(index);
        long differenceInHours = TimeUnit.MILLISECONDS.toHours(difference);

        Assert.assertTrue(differenceInHours < 24, "Time of post is more than 24 hours");
    }
}
