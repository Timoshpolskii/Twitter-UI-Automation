package main.java.Support;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static main.java.Support.SingletonDriver.getDriver;

public interface ElementsHelper {

    default void waitElementsToBeDisplayed(List<WebElement> elements){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfAllElements(elements));
    }

    default void waitElementToBeDisplayed(WebElement element){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
