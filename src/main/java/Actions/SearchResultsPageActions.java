package main.java.Actions;

import main.java.Pages.SearchResultsPage;
import main.java.Support.ElementsHelper;
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
            throw new RuntimeException("Cannot find public with name [" + name + "]");
        }
        else {
            resultLink.click();
        }
    }
}