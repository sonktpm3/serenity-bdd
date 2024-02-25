package com.example.SerenityCucumber.definitions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.example.SerenityCucumber.steps.StepLoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;


public class LoginPageDefinitions {

    @Steps
    StepLoginPage loginPage;

    @Given("User is on Home page")
    public void openApplication() {
        loginPage.open();
    }

    @When("User enters username as {string}")
    public void enterUsername(String userName) {

        loginPage.inputUserName(userName);
    }

    @When("User enters password as {string}")
    public void enterPassword(String passWord) {
        loginPage.inputPassword(passWord);
        loginPage.clickLogin();
    }


}