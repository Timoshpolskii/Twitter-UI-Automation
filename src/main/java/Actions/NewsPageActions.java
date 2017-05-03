package main.java.Actions;

import main.java.Pages.NewsPage;
import main.java.Support.ElementsHelper;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class NewsPageActions implements ElementsHelper {
    private NewsPage newsPage = new NewsPage();

    private WebElement getPostByIndex(int index) {

        waitElementToBeDisplayed(newsPage.followersTitle);
        WebElement test = null;
        try {
            test = newsPage.timeOfAllPosts.get(index);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Cannot find post with index [" + index + "]");
        }
        return test;
    }

    public long getTimeOfPostByIndex(int index) {
        WebElement post = getPostByIndex(index);
        if (post == null) {
            throw new RuntimeException("Cannot get time of post by index [" + index + "]");
        }
        String timeOfPost = post.getAttribute("data-time-ms");
        return Long.parseLong(timeOfPost);
    }
}