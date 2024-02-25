package com.example.SerenityCucumber.steps;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class StepLoginPage extends PageObject {

    @FindBy(name = "user-name")
    WebElementFacade username;

    @FindBy(name = "password")
    WebElementFacade password;

    @FindBy(xpath = "//input[@id=\"login-button\"]")
    WebElementFacade submitButton;

    @Step("Enter Username")
    public void inputUserName(String userName) {
        username.sendKeys((userName));
    }

    @Step("Enter Password")
    public void inputPassword(String passWord) {
        password.sendKeys((passWord));
    }

    @Step("Click Submit Button")
    public void clickLogin() {
        submitButton.click();
    }



}
