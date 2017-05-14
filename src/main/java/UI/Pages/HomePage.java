package main.java.UI.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static main.java.UI.Support.SingletonDriver.getDriver;

public class HomePage {

    @FindBy(id = "search-query")
    public WebElement searchField;

    @FindBy(className = "Icon--search")
    public WebElement searchButton;

    public HomePage() {
        PageFactory.initElements(getDriver(), this);
    }

}