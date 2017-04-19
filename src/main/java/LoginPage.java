package main.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    @FindBy(id = "signin-email")
    private WebElement signInField;

    @FindBy(id = "signin-password")
    private WebElement passwordField;

    @FindBy(xpath = "//td/button[@type='submit']")
    private WebElement loginButton;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void loginToApp(String email, String password){
        signInField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();
    }
}
