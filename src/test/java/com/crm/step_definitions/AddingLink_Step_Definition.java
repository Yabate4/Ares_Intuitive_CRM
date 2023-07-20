package com.crm.step_definitions;

import com.crm.pages.AddingLink_Page;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Set;

public class AddingLink_Step_Definition {
    AddingLink_Page addingLinkPage = new AddingLink_Page();
    @Given("User is logged in, and on homepage")
    public void user_is_logged_in_and_on_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("crm_url"));
        addingLinkPage.username.sendKeys(ConfigurationReader.getProperty("hr1_username"));
        addingLinkPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        addingLinkPage.loginButton.click();
    }
    @Given("User should be able to see and click MESSAGE button")
    public void user_should_be_able_to_see_and_click_message_button() {
        addingLinkPage.messageButton.click();
    }
    @Then("Link button should be visible and clickable")
    public void link_button_should_be_visible_and_clickable() {
        addingLinkPage.linkButton.click();
    }
    @When("User enter text {string}")
    public void user_enter_text(String text) {
        addingLinkPage.textLink.sendKeys(text);
    }
    @When("User enter URL Link {string}")
    public void user_enter_url_link(String urlLink) {
        addingLinkPage.linkURL.sendKeys(urlLink);
    }
    @Then("User should click on Save button")
    public void user_should_click_on_save_button() {
        addingLinkPage.saveButton.click();
    }
    @Then("User should click SEND button")
    public void user_should_click_send_button() {
        addingLinkPage.sendButton.click();
    }
    @When("User click on created Link")
    public void user_click_on_created_link() {
        addingLinkPage.createdLink.click();
        Set<String> tabs = Driver.getDriver().getWindowHandles();
        for (String eachTab : tabs){
            Driver.getDriver().switchTo().window(eachTab);
        }

    }
    @Then("Link should be open in new tab")
    public void link_should_be_open_in_new_tab() {
       String expectedTitle = "Google";
       Assert.assertTrue(expectedTitle.equals(Driver.getDriver().getTitle()));
    }

}
