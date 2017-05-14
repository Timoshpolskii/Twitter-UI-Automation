package main.java.UI.Pages;

import main.java.UI.Support.ElementsHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import java.util.List;

import static main.java.UI.Support.SingletonDriver.getDriver;

public class SearchResultsPage implements ElementsHelper {

    @FindBy(className = "ProfileNameTruncated-link")
    public List<WebElement> searchResults;

    public SearchResultsPage() {
        PageFactory.initElements(getDriver(), this);
    }
}