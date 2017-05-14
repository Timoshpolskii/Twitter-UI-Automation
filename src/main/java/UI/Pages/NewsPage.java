package main.java.UI.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static main.java.UI.Support.SingletonDriver.getDriver;

public class NewsPage {

    @FindBy(className = "_timestamp")
    public List<WebElement> timeOfAllPosts;

    @FindBy(className = "WhoToFollow-title")
    public WebElement followersTitle;

    public NewsPage() {
        PageFactory.initElements(getDriver(), this);
    }
}