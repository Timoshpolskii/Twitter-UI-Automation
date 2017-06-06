package main.java.Actions;

import main.java.Pages.LoginPage;

public class LoginPageActions {

    private LoginPage loginPage = new LoginPage();

    public void loginToApp(String email, String password) {
        loginPage.signInField.sendKeys(email);
        loginPage.passwordField.sendKeys(password);
        loginPage.loginButton.click();
    }
}
