package com.crm.step_definitions;

import com.crm.pages.LoginPage;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page of the CRM application")
    public void user_is_on_the_login_page_of_the_crm_application() {
        Driver.getDriver().get(ConfigurationReader.getProperty("crm_url"));

    }

    @When("user enter username in the usernameInputBox")
    public void user_enter_in_the_username_input_box() {
        loginPage.username.sendKeys(ConfigurationReader.getProperty("hr1_username"));


    }

    @When("user enters password in the passwordInputBox")
    public void user_enters_in_the_password_input_box() {
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));

    }

    @When("user click the login button")
    public void user_click_the_login_button() {
        loginPage.loginButton.click();

    }

    @Then("user should see that the title of the page is {string}")
    public void user_should_see_that_the_title_of_the_page_is(String expectedTitle) {

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(expectedTitle.equals(actualTitle));
    }

}
