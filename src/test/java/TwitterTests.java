package test.java;


import main.java.*;
import org.testng.annotations.Test;

public class TwitterTests extends TestBase{

    @Test
    public void lastTwitTest(){
        new LoginPage(driver).loginToApp("andrew.t@techery.io", "123qwerty");
        new HomePage(driver).search("Reuters Top News");
        new SearchResultsPage(driver).openPublicByText("Reuters Top News");
        new NewsPage(driver).checkTimeDifferenceByIndex(0);
    }
}