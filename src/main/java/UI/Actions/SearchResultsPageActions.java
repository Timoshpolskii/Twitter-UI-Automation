package main.java.UI.Actions;

import main.java.UI.Pages.SearchResultsPage;
import main.java.UI.Support.ElementsHelper;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class SearchResultsPageActions implements ElementsHelper {

    private SearchResultsPage searchResultsPage = new SearchResultsPage();

    private WebElement getResultByText(String text) {

        return searchResultsPage.searchResults.stream()
                .filter(element -> element.getText().equals(text))
                .findAny()
                .orElse(null);
    }

    public void openPublicByName(String name) {

        WebElement resultLink = getResultByText(name);
        if (resultLink == null) {
            throw new NoSuchElementException("Cannot find public with name [" + name + "]");
        }
        else {
            resultLink.click();
        }
    }
}