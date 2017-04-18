package test.java;


import main.java.*;
import org.testng.annotations.Test;

public class TwitterTests extends TestBase{

    @Test
    public void lastTwitTest(){
        new LoginPage(driver).loginToApp();
        new HomePage(driver).search("Reuters Top News");
        new SearchResultsPage(driver).openReutersPublicDetails();
        new NewsPage(driver).checkTimeDifferenceByIndex(0);
    }
}