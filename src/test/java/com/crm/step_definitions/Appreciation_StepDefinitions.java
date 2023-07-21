package com.crm.step_definitions;

import com.crm.pages.HomePage;
import com.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Appreciation_StepDefinitions {

    HomePage crmHomePage = new HomePage();

    @When("user clicks the MORE tab")
    public void user_clicks_the_more_tab() {
        crmHomePage.moreOption.click();

    }

    @When("user clicks on the Appreciation option")
    public void user_clicks_on_the_appreciation_option() {
        crmHomePage.appreciationOption.click();

    }

    @When("user types text into the Message Content field")
    public void user_types_text_into_the_message_content_field() {
        Driver.getDriver().switchTo().frame(crmHomePage.MessageContextBoxIFrame);
        crmHomePage.messageContentBox.sendKeys("ARES is the Best Team Ever!");
        Driver.getDriver().switchTo().defaultContent();
    }

    @When("user sees that the All employees option is selected in the To field")
    public void user_sees_that_the_all_employees_option_is_selected_in_the_to_field() {
        crmHomePage.allEmployeesSelection.isDisplayed();
    }

    @When("user clicks the SEND button")
    public void user_clicks_the_send_button() {
        crmHomePage.sendBtn.click();

    }

    @Then("user sees the appreciation message displayed on message board")
    public void user_sees_the_appreciation_message_displayed_on_message_board() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(crmHomePage.displayedMessage));
        String expectedDisplayedMessage = "ARES is the Best Team Ever!";
        String actualDisplayedMessage = crmHomePage.displayedMessage.getText();
        Assert.assertEquals(expectedDisplayedMessage, actualDisplayedMessage);
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Then("user clicks the Add more option in the To field")
    public void user_clicks_the_add_more_option_in_the_to_field() {
        crmHomePage.addMoreSelection.click();
    }


    @Then("user clicks on the GoodGuys option")
    public void user_clicks_on_the_good_guys_option() {
        crmHomePage.employeesAndDepartments.click();

    }


    @Then("user closes the Add more option window")
    public void user_closes_the_add_more_option_window() {
        crmHomePage.closeToOptionsWindowBtn.click();
    }

    @Then("user clicks on the marketing1@cybertekschool.com option")
    public void user_clicks_on_the_marketing1_cybertekschool_com_option() {
        crmHomePage.emailUsersSelection.click();
    }

    @Then("user clicks on x to cancel the All employees selection")
    public void user_clicks_on_x_to_cancel_the_all_employees_selection() {
        crmHomePage.allEmployeesCancelBtn.click();

    }

    @Then("user clicks on the To field")
    public void user_clicks_on_the_to_field() {
        crmHomePage.toInputBox.click();
    }


    @Then("user sees an error message for title field {string}")
    public void userSeesAnErrorMessageForTitleField(String expectedErrorMessage) {
        String actualErrorMessage = crmHomePage.errorMessageForTitleField.getText();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Then("user sees an error message for to field {string}")
    public void userSeesAnErrorMessageForToField(String expectedErrorMessage) {
        String actualErrorMessage = crmHomePage.errorMessageForToField.getText();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Then("user sees that the To field has the {string} option selected by default")
    public void userSeesThatTheToFieldHasTheOptionSelectedByDefault(String defaultToFieldSelection) {
        Assert.assertTrue(crmHomePage.allEmployeesSelection.isDisplayed());
    }

    @And("user click on the CANCEL button")
    public void userClickOnTheCANCELButton() {
        crmHomePage.cancelBtn.click();
    }

    @Then("user can see that the MORE tab is now displayed")
    public void userCanSeeThatTheMORETabIsNowDisplayed() {
        Assert.assertTrue(crmHomePage.moreOption.isDisplayed());
    }

    @And("user clicks on the employees and departments option")
    public void userClicksOnTheEmployeesAndDepartmentsOption() {
        crmHomePage.employeesAndDepartments.click();
    }

    @And("user clicks on the first available group")
    public void userClicksOnTheFirstAvailableGroup() {
        crmHomePage.firstAvailableGroup.click();
    }

    @And("user clicks on the first available option")
    public void userClicksOnTheFirstAvailableOption() {
        crmHomePage.firstAvailableOption.click();
    }
}
