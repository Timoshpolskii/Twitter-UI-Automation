package main.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    @FindBy(id = "search-query")
    private WebElement searchField;

    @FindBy(xpath = ".//span/button[@type='submit']")
    private WebElement searchButton;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public SearchResultsPage search(String query){
        searchField.sendKeys(query);
        searchButton.click();
        return new SearchResultsPage(driver);
    }
}
