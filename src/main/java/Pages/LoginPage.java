package main.java.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static main.java.Support.SingletonDriver.getDriver;

public class LoginPage {

    @FindBy(id = "signin-email")
    public WebElement signInField;

    @FindBy(id = "signin-password")
    public WebElement passwordField;

    @FindBy(className = "flex-table-btn")
    public WebElement loginButton;

    public LoginPage(){
        PageFactory.initElements(getDriver(), this);
    }
}