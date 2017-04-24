package main.java.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static main.java.Support.SingletonDriver.getDriver;

public class HomePage {

    @FindBy(id = "search-query")
    private WebElement searchField;

    @FindBy(className = "Icon--search")
    private WebElement searchButton;

    public HomePage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void search(String query){
        searchField.clear();
        searchField.sendKeys(query);
        searchButton.click();
    }
}