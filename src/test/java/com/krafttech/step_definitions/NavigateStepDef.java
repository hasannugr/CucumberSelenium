package com.krafttech.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigateStepDef {

    @When("Get the text of dashboard")
    public void getTheTextOfDashboard() {
        System.out.println("Get the text of dashboard");
    }


    @Then("Then go to Edit Profile menu and get the text of Edit User Profile")
    public void thenGoToEditProfileMenuAndGetTheTextOfEditUserProfile() {
        System.out.println("Then go to Edit Profile menu and get the text of Edit User Profile");
    }

    @Then("Then go to My Profile menu and get the text of User Profile")
    public void thenGoToMyProfileMenuAndGetTheTextOfUserProfile() {
        System.out.println("Then go to My Profile menu and get the text of User Profile");
    }

    @Then("Then go to Developers menu and get the text of Developer")
    public void thenGoToDevelopersMenuAndGetTheTextOfDeveloper() {
        System.out.println("Then go to Developers menu and get the text of Developer");

    }
}
