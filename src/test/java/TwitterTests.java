package test.java;


import main.java.Pages.*;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.lessThan;

public class TwitterTests extends TestBase {

    @Test
    public void lastTwitTest(){
        NewsPage newsPage = new NewsPage();

        new LoginPage().loginToApp("andrew.t@techery.io", "123qwerty");
        new HomePage().search("Reuters Top News");
        new SearchResultsPage().openPublicByName("Reuters Top News");

        long timeOfLastTweet = newsPage.getTimeOfPostByIndex(0);
        long currentTime = newsPage.getCurrentTime();
        int differenceInHours = newsPage.calculateDifferenceInHours(currentTime, timeOfLastTweet);

        assertThat("Difference is " + differenceInHours + "hours, it's more than 24 hours",
                differenceInHours, lessThan(24));
    }
}