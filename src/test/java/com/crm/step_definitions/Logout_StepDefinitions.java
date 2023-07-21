package com.crm.step_definitions;

import com.crm.pages.LoginPage;
import com.crm.pages.LogoutPage;
import com.crm.utilities.BrowserUtilities;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Logout_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    LogoutPage logoutPage = new LogoutPage();

    @Given("users are on the CRM home page")
    public void users_are_on_the_crm_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("crm_url"));
        loginPage.login_CRM(ConfigurationReader.getProperty("hr1_username"), ConfigurationReader.getProperty("password"));
    }
    @When("users click the profile name")
    public void users_click_the_profile_name() {
        logoutPage.profileName.click();
    }
    @When("users should see the Log out option")
    public void users_should_see_the_log_out_option() {
        Assert.assertTrue(logoutPage.logoutBtn.isDisplayed());
    }
    @When("users click the Log out button")
    public void users_click_the_log_out_button() {
        logoutPage.logoutBtn.click();
    }
    @Then("users should be back to the CRM login page")
    public void users_should_be_back_to_the_crm_login_page() {
        //BrowserUtilities.sleep(2);

        Assert.assertTrue(logoutPage.loginPage.isDisplayed());
    }


    @Then("users should see five options under profile name")
    public void usersShouldSeeFiveOptionsUnderProfileName(List<String> expectedOptions) {
        //BrowserUtilities.sleep(2);

        List<String> actualOptions = new ArrayList<>();

        for (WebElement eachOption : logoutPage.optionsUnderProfileName) {
            actualOptions.add(eachOption.getText());
        }

        Assert.assertEquals(expectedOptions, actualOptions);
    }
}
