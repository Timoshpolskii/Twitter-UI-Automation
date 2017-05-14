package main.java.UI.Actions;

import main.java.UI.Pages.HomePage;

public class HomePageActions {

    private HomePage homePage = new HomePage();

    public void search(String query){
        homePage.searchField.clear();
        homePage.searchField.sendKeys(query);
        homePage.searchButton.click();
    }
}