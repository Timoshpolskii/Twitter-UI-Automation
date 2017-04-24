package main.java.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static main.java.Support.SingletonDriver.getDriver;

public class SearchResultsPage {

    @FindBy(className = "ProfileNameTruncated-link")
    private List<WebElement> searchResults;

    private WebElement getResultByText(String text){

        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfAllElements(searchResults));

        WebElement result = null;

        for (int i = 0; i < searchResults.size(); i++){
            if (searchResults.get(i).getText().equals(text)){
                result = searchResults.get(i);
            }
        }

        return result;
    }

    public SearchResultsPage() {
        PageFactory.initElements(getDriver(), this);
    }


    public void openPublicByName(String name){
        getResultByText(name).click();
    }
}