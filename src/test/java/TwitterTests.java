package test.java;


import main.java.TestBase;
import main.java.LoginPage;
import org.testng.annotations.Test;

public class TwitterTests extends TestBase{

    @Test
    public void lastTwitTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToApp()
                .search("Reuters Top News")
                .openItemDetails()
                .checkTimeOfLastPost();
    }
}