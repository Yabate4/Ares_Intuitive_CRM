package com.crm.step_definitions;

import com.crm.pages.LoginPage;
import com.crm.pages.HomePage;
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

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class Sending_Message_StepDefinition {
    LoginPage loginPage = new LoginPage();
    HomePage homePage =new HomePage();
    Faker face = new Faker();
    String old=face.chuckNorris().fact();
    String name =old.replaceAll("Chuck Norris","Mehmet Microsoft Developer");




    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
    @Given("user is on the Activity Stream page")
    public void user_is_on_the_activity_stream_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("crm_url"));
        loginPage.username.sendKeys("hr37@cybertekschool.com");
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginButton.click();

    }
    @When("user click on the message button")
    public void user_click_on_the_message_button() {

        homePage.messageButton.click();
    }
    @When("writes his message")
    public void writes_his_message() throws AWTException {
        // this is method to maximise
       /* Robot robot= new Robot();
        for (int i = 0; i < 4; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_CONTROL);
        }*/
        Driver.getDriver().switchTo().frame(homePage.frame);
        homePage.messageBoxInput.click();
homePage.messageBoxInput.sendKeys(name);
Driver.getDriver().switchTo().defaultContent();
    }
    @When("user remove the All employees")
    public void user_remove_the() {
homePage.allEmployeesClosingButton.click();
    }
    @When("user able to select the specific name of employee or All employees")
    public void user_able_to_sellect_the_specific_name_of_emoployee_or_all_employees() {
homePage.addPersonsOrGroupButton.click();
homePage.recentButton.click();
homePage.recentAllEmployeesButton.click();


    }
    @Then("user should see his message is sent and displayed on top")
    public void user_should_see_his_message_is_sent_and_displayed_on_top() {

        homePage.sendButton.click();
        //System.out.println("sendingMessagePage.displayOfTheMessage.getText() = " + sendingMessagePage.displayOfTheMessage.getText());
//wait.until(ExpectedConditions.invisibilityOf(sendingMessagePage.displayOfTheMessage));

        System.out.println(name);
        Assert.assertEquals(homePage.displayOfTheMessage.getText(),name);
        BrowserUtilities.sleep(1);


    }

    @Then("user should see his message is sent and displayed on top use explicit wait")
    public void user_should_see_his_message_is_sent_and_displayed_on_top_use_explicit_wait() {
        homePage.sendButton.click();

        wait.until(ExpectedConditions.invisibilityOf(homePage.displayOfTheMessage));

        System.out.println("sendingMessagePage.displayOfTheMessage.getText() = " + homePage.displayOfTheMessage.getText());
        Assert.assertEquals(homePage.displayOfTheMessage.getText(),name);
        BrowserUtilities.sleep(1);

    }
    @When("user able to select the specific name of employee")
    public void user_able_to_select_the_specific_name_of_employee() {

        homePage.addPersonsOrGroupButton.click();
        homePage.employeesAndDepartmentButton.click();
        homePage.employees.click();
        homePage.closeToOptionsWindowBtn.click();
        //sendingMessagePage.messageButton.click();
    }

    @When("user able to select the specific Email of employee")
    public void user_able_to_select_the_specific_email_of_employee() {
        BrowserUtilities.sleep(2);

        homePage.addPersonsOrGroupButton.click();
        homePage.emailUsersButton.click();
        //sendingMessagePage.email.click();
    }


    //13-==========================
    @Then("user should see that the message is to'All employees' by default.")
    public void user_should_see_that_the_message_is_to_all_employees_by_default() {
        System.out.println("sendingMessagePage.allEmployeesButton.getText() = " + homePage.allEmployeesButton.getText());
        Assert.assertTrue(homePage.allEmployeesButton.isDisplayed());
    }
    //9+12-==========================
    @Then("user should cancel his message")
    public void user_should_cancel_his_message() {
       homePage.cancelButton.click();
       Assert.assertFalse(homePage.cancelButton.isDisplayed());
    }
    //7+8-======================
    @Then("user should see Error messages for mandatory reciepient fields:Please specify at least one person.")
    public void user_should_see_error_messages_for_mandatory_reciepient_fields() {
             homePage.sendButton.click();


        System.out.println("sendingMessagePage.recipientErrorMessage2.getText() = " + homePage.recipientErrorMessage2.getText());

        Assert.assertTrue(homePage.recipientErrorMessage.isDisplayed());



    }
    //6+5-======================
    @Then("user should see Error messages for mandatory message fields:The message title is not specified")
    public void user_should_see_error_messages_for_mandatory_message_fields() {
        homePage.sendButton.click();
        System.out.println("sendingMessagePage.emptyMessageErrorMessage.getText() = " + homePage.emptyMessageErrorMessage.getText());
        Assert.assertTrue(homePage.emptyMessageErrorMessage.isDisplayed());
    }
}
