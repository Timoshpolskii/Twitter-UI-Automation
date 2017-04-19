package main.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchResultsPage {

    private WebDriver driver;

    public SearchResultsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = ".//a[@class='fullname ProfileNameTruncated-link u-textInheritColor js-nav']")
    private List<WebElement> searchResults;

    private WebElement getResultByText(String text){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElements(searchResults));

        WebElement result = null;

        for (int i = 0; i < searchResults.size(); i++){
            if (searchResults.get(i).getText().contains(text)){
                result = searchResults.get(i);
            }
        }

        return result;
    }


    public void openPublicByText(String text){
        getResultByText(text).click();
    }
}
