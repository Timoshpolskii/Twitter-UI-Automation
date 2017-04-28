package test.java;


import main.java.Actions.HomePageActions;
import main.java.Actions.LoginPageActions;
import main.java.Actions.NewsPageActions;
import main.java.Actions.SearchResultsPageActions;
import main.java.Pages.*;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.lessThan;

public class TwitterTests extends TestBase {

    @Test
    public void lastTwitTest() {

        new LoginPageActions().loginToApp("andrew.t@techery.io", "123qwerty");
        new HomePageActions().search("Reuters Top News");
        new SearchResultsPageActions().openPublicByName("Reuters Top News");

        NewsPageActions newsPageActions = new NewsPageActions();
        long timeOfLastTweet = newsPageActions.getTimeOfPostByIndex(20);
        long currentTime = newsPageActions.getCurrentTime();
        int differenceInHours = newsPageActions.calculateDifferenceInHours(currentTime, timeOfLastTweet);

        assertThat("Difference is " + differenceInHours + " hours, it's more than 24 hours",
                differenceInHours, lessThan(24));
    }
}