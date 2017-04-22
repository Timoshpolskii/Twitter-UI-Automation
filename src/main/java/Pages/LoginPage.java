package main.java.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static main.java.Support.SingletonDriver.getDriver;

public class LoginPage {

    @FindBy(id = "signin-email")
    private WebElement signInField;

    @FindBy(id = "signin-password")
    private WebElement passwordField;

    @FindBy(xpath = "//td/button[@type='submit']")
    private WebElement loginButton;

    public LoginPage(){
        PageFactory.initElements(getDriver(), this);
    }

    public void loginToApp(String email, String password){
        signInField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();
    }
}
