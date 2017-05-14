package main.java.UI.Actions;

import main.java.UI.Pages.LoginPage;

public class LoginPageActions {

    private LoginPage loginPage = new LoginPage();

    public void loginToApp(String email, String password) {
        loginPage.signInField.sendKeys(email);
        loginPage.passwordField.sendKeys(password);
        loginPage.loginButton.click();
    }
}
