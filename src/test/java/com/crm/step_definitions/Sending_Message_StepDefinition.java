package com.crm.step_definitions;

import com.crm.pages.LoginPage;
import com.crm.pages.SendingMessagePage;
import com.crm.utilities.BrowserUtilities;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Sending_Message_StepDefinition {
    LoginPage loginPage = new LoginPage();
    SendingMessagePage sendingMessagePage=new SendingMessagePage();
    Faker faker = new Faker();
    String name =faker.address().cityName();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    @Given("user is on the Activity Stream page")
    public void user_is_on_the_activity_stream_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("crm_url"));
        loginPage.username.sendKeys(ConfigurationReader.getProperty("hr1_username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginButton.click();

    }
    @When("user click on the message button")
    public void user_click_on_the_message_button() {

        sendingMessagePage.messageButton.click();
    }
    @When("writes his message")
    public void writes_his_message() {
        Driver.getDriver().switchTo().frame(sendingMessagePage.frame);
        sendingMessagePage.messageBoxInput.click();
sendingMessagePage.messageBoxInput.sendKeys(name);
Driver.getDriver().switchTo().defaultContent();
    }
    @When("user remove the All employees")
    public void user_remove_the() {
sendingMessagePage.allEmployeesClosingButton.click();
    }
    @When("user able to select the specific name of employee or All employees")
    public void user_able_to_sellect_the_specific_name_of_emoployee_or_all_employees() {
sendingMessagePage.addPersonsOrGroupButton.click();
sendingMessagePage.recentButton.click();
sendingMessagePage.recentAllEmployeesButton.click();


    }
    @Then("user should see his message is sent and displayed on top")
    public void user_should_see_his_message_is_sent_and_displayed_on_top() {

        sendingMessagePage.sendButton.click();
        //System.out.println("sendingMessagePage.displayOfTheMessage.getText() = " + sendingMessagePage.displayOfTheMessage.getText());
//wait.until(ExpectedConditions.invisibilityOf(sendingMessagePage.displayOfTheMessage));

        System.out.println(name);
        Assert.assertEquals(sendingMessagePage.displayOfTheMessage.getText(),name);
        BrowserUtilities.sleep(1);

    }

    @Then("user should see his message is sent and displayed on top use explicit wait")
    public void user_should_see_his_message_is_sent_and_displayed_on_top_use_explicit_wait() {
        sendingMessagePage.sendButton.click();

        wait.until(ExpectedConditions.invisibilityOf(sendingMessagePage.displayOfTheMessage));

        System.out.println("sendingMessagePage.displayOfTheMessage.getText() = " + sendingMessagePage.displayOfTheMessage.getText());
        Assert.assertEquals(sendingMessagePage.displayOfTheMessage.getText(),name);
        BrowserUtilities.sleep(1);

    }
    @When("user able to select the specific name of employee")
    public void user_able_to_select_the_specific_name_of_employee() {

        sendingMessagePage.addPersonsOrGroupButton.click();
        sendingMessagePage.employeesAndDepartmentButton.click();
        sendingMessagePage.employees.click();
        sendingMessagePage.closeToOptionsWindowBtn.click();
        //sendingMessagePage.messageButton.click();
    }

    @When("user able to select the specific Email of employee")
    public void user_able_to_select_the_specific_email_of_employee() {
        BrowserUtilities.sleep(2);

        sendingMessagePage.addPersonsOrGroupButton.click();
        sendingMessagePage.emailUsersButton.click();
        //sendingMessagePage.email.click();
    }


    //13-==========================
    @Then("user should see that the message is to'All employees' by default.")
    public void user_should_see_that_the_message_is_to_all_employees_by_default() {
        System.out.println("sendingMessagePage.allEmployeesButton.getText() = " + sendingMessagePage.allEmployeesButton.getText());
        Assert.assertTrue(sendingMessagePage.allEmployeesButton.isDisplayed());
    }
    //9+12-==========================
    @Then("user should cancel his message")
    public void user_should_cancel_his_message() {
       sendingMessagePage.cancelButton.click();
       Assert.assertFalse(sendingMessagePage.cancelButton.isDisplayed());
    }
    //7+8-======================
    @Then("user should see Error messages for mandatory reciepient fields:Please specify at least one person.")
    public void user_should_see_error_messages_for_mandatory_reciepient_fields() {
             sendingMessagePage.sendButton.click();


        System.out.println("sendingMessagePage.recipientErrorMessage2.getText() = " + sendingMessagePage.recipientErrorMessage2.getText());

        Assert.assertTrue(sendingMessagePage.recipientErrorMessage.isDisplayed());



    }
    //6+5-======================
    @Then("user should see Error messages for mandatory message fields:The message title is not specified")
    public void user_should_see_error_messages_for_mandatory_message_fields() {
        sendingMessagePage.sendButton.click();
        System.out.println("sendingMessagePage.emptyMessageErrorMessage.getText() = " + sendingMessagePage.emptyMessageErrorMessage.getText());
        Assert.assertTrue(sendingMessagePage.emptyMessageErrorMessage.isDisplayed());
    }
}
