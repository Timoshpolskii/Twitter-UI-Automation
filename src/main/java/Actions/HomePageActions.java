package main.java.Actions;

import main.java.Pages.HomePage;

public class HomePageActions {

    private HomePage homePage = new HomePage();

    public void search(String query){
        homePage.searchField.clear();
        homePage.searchField.sendKeys(query);
        homePage.searchButton.click();
    }
}