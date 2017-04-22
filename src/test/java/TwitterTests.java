package test.java;


import main.java.Pages.*;
import org.testng.annotations.Test;

public class TwitterTests extends TestBase {

    @Test
    public void lastTwitTest(){
        new LoginPage().loginToApp("andrew.t@techery.io", "123qwerty");
        new HomePage().search("Reuters Top News");
        new SearchResultsPage().openPublicByText("Reuters Top News");
        new NewsPage().checkTimeDifferenceByIndex(0);
    }
}