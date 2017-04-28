package main.java.Pages;

import main.java.Support.ElementsHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import java.util.List;

import static main.java.Support.SingletonDriver.getDriver;

public class SearchResultsPage implements ElementsHelper {

    @FindBy(className = "ProfileNameTruncated-link")
    public List<WebElement> searchResults;

    public SearchResultsPage() {
        PageFactory.initElements(getDriver(), this);
    }
}