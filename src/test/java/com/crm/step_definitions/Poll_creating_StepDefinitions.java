package com.crm.step_definitions;

import com.crm.pages.Poll_creating_Page;
import com.crm.utilities.BrowserUtilities;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Poll_creating_StepDefinitions {

    Poll_creating_Page pollPage = new Poll_creating_Page();
    @Given("User is on the crm home page.")
    public void user_is_on_the_crm_home_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("crmUrl"));
        pollPage.username.sendKeys(ConfigurationReader.getProperty("hr1_username"));
        pollPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        pollPage.loginBtn.click();
    }

    @Then("User should click the POLL option")
    public void user_should_click_the_poll_option() {
        pollPage.pollBtn.click();
    }

    @Then("User should see All employees should be displayed as a default")
    public void user_should_see_all_employees_should_be_displayed_as_a_default() {
        Assert.assertTrue(pollPage.allEmployeesBtn.isDisplayed());

    }


    @Then("User type question in Question input box")
    public void user_type_question_in_question_input_box() {
        try {
            pollPage.questionInputBox.sendKeys("what is the best programming language?");
        }catch (TimeoutException e){
            Driver.getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        }

    }

    @Then("User type answer in the Answer input box")
    public void user_type_answer_in_the_answer_input_box() {
        pollPage.answerIputbox1.sendKeys("Java");

    }

    @Then("User type another answer in the second Question input box")
    public void user_type_another_answer_in_the_second_question_input_box() {
        pollPage.answerInputbox2.sendKeys("C++");
    }



    @Then("User type text in the poll text area a message")
    public void user_type_text_in_the_poll_text_area_a_message() {

        WebElement iframe = Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']"));
        Driver.getDriver().switchTo().frame(iframe);
        pollPage.pollTextArea.sendKeys("Please take the Poll");

        Driver.getDriver().switchTo().defaultContent();
    }

    @Then("User click send option")
    public void user_click_send_option() {
        pollPage.sendBtn.click();
    }


    @Then("User should click Allow multiple choice box.")
    public void user_should_click_allow_multiple_choice_box() {
        pollPage.allowMultipleChoiceCheckBox.click();
    }


    @Then("User clicks send")
    public void user_clicks_send() {
        pollPage.sendBtn.click();

    }

    @Then("User should see  Error message The message title is not specified should appear.")
    public void user_should_see_error_message_the_message_title_is_not_specified_should_appear() {

        Assert.assertTrue(pollPage.theMessageTitleIsNotSpecified.isDisplayed());
    }

    @Then("User type question in the Question input box")

    public void user_type_question_in_the_question_input_box() {
        pollPage.questionInputBox.sendKeys("aa");
    }
    @Then("User type answer in the input box")
    public void user_type_answer_in_the_input_box() {
        pollPage.answerIputbox1.sendKeys("a");
    }
    @Then("User type message in the poll input box area and select an employee")
    public void user_type_message_in_the_poll_input_box_area_and_select_an_employee() {
        WebElement frame = Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']"));
        Driver.getDriver().switchTo().frame(frame);
        pollPage.pollTextArea.sendKeys("aa");
        Driver.getDriver().switchTo().defaultContent();
    }
    @Then("User click All employees button to unselect employees")
    public void user_click_all_employees_button_to_unselect_employees() {
        pollPage.AllEmployessXbtn.click();
    }
    @Then("User click send button")
    public void user_click_send_button() {
        pollPage.sendBtn.click();
    }
    @Then("User should see  Error message Please specify at least one person should appear.")
    public void user_should_see_error_message_please_specify_at_least_one_person_should_appear() {

        Assert.assertTrue(pollPage.pleaseSpecifyAtLeastOnePerson.isDisplayed());
    }
    @Then("User type in the poll input box a message")
    public void user_type_in_the_poll_input_box_a_message() {
        Driver.getDriver().switchTo().frame(pollPage.iframePollInputBox);
        pollPage.pollTextArea.sendKeys("Answer here please!");
        Driver.getDriver().switchTo().defaultContent();
    }
    @Then("User fill in an answer in the Answer input box")
    public void user_fill_in_an_answer_in_the_answer_input_box() {
        pollPage.answerIputbox1.sendKeys("python");
    }
    @Then("User should see  Error message The question text is not specified. should appear")
    public void user_should_see_error_message_the_question_text_is_not_specified_should_appear() {
        Assert.assertTrue(pollPage.theQuestionTextIsNotSpecified.isDisplayed());
    }
    @Then("User type a question in the Question input box")
    public void user_type_a_question_in_the_question_input_box() {
        BrowserUtilities.sleep(10);
        pollPage.questionInputBox.sendKeys("Question1?");

    }
    @Then("User type in the message poll input box")
    public void user_type_in_the_message_poll_input_box() {
        Driver.getDriver().switchTo().frame(pollPage.iframePollInputBox);
        pollPage.pollTextArea.sendKeys("Here is the Poll");
        Driver.getDriver().switchTo().defaultContent();

    }
    @Then("User clicks send button")
    public void user_clicks_send_button() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(pollPage.sendBtn)).click();



    }
    @Then("User should see  Error message  The question {string} has no answers. should appear.")
    public void user_should_see_error_message_the_question_has_no_answers_should_appear(String Question1) {

        Assert.assertTrue(pollPage.theQuestionTextHasNoAnswer.isDisplayed());
    }


}
