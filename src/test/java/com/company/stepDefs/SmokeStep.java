package com.company.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SmokeStep {

    @Given("User logged into their BoA account")
    public void userLoggedIntoTheirBoAAccount() {
        System.out.println("user has logged in successfully");
    }

    @And("user clicks on {string} tab")
    public void userClicksOnTab(String arg0) {
        System.out.println("user clicks on tab "+arg0);
    }

    @Then("user should see their account page")
    public void userShouldSeeTheirAccountPage() {
        System.out.println("user sees their account");
    }

    @Then("user should see their fico score")
    public void userShouldSeeTheirFicoScore() {
        System.out.println("user is able to see their fico score");
    }
}
