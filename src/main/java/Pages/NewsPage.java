package main.java.Pages;

import main.java.Support.ElementsHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static main.java.Support.SingletonDriver.getDriver;

public class NewsPage implements ElementsHelper{

    @FindBy(className = "_timestamp")
    private List<WebElement> timeOfAllPosts;

    @FindBy(className = "WhoToFollow-title")
    private WebElement followers;



    private WebElement getPostByIndex(int index){

        waitElementToBeDisplayed(followers);
        return timeOfAllPosts.get(index);
    }

    public NewsPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public long getCurrentTime(){
        return System.currentTimeMillis();
    }

    public long getTimeOfPostByIndex(int index){
        String timeOfPost = getPostByIndex(index).getAttribute("data-time-ms");
        return Long.parseLong(timeOfPost);
    }

    public int calculateDifferenceInHours(long firstTime, long secondTime) {
        long difference = firstTime - secondTime;
        return (int)TimeUnit.MILLISECONDS.toHours(difference);
    }
}
