package test.java.UITests;


import main.java.TimeOperations.TimeActions;
import main.java.UI.Actions.*;
import main.java.UI.Support.TestBase;
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
        long timeOfLastTweet = newsPageActions.getTimeOfPostByIndex(0);

        TimeActions timeActions = new TimeActions();
        long currentTime = timeActions.getCurrentTime();
        int differenceInHours = timeActions.calculateDifferenceInHours(currentTime, timeOfLastTweet);

        assertThat("Difference is " + differenceInHours + " hours, it's more than 24 hours",
                differenceInHours, lessThan(24));
    }
}