package com.crm.step_definitions;

import com.crm.pages.EmployeesPage;
import com.crm.pages.LoginPage;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CompanyStructure_StepDefinitions {

    String departmentName;

    LoginPage loginPage = new LoginPage();
    EmployeesPage employeesPage = new EmployeesPage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));

    //AC1
    @Given("user login to CRM application with {string} and {string} credentials")
    public void user_login_to_crm_application_with_and_credentials(String username, String password) {
        loginPage.login_CRM(username, password);
    }

    @When("user click the Employees page button on sidebar")
    public void user_click_the_employees_page_button_on_sidebar() {
        employeesPage.employeesPageButton.click();
        wait.until(ExpectedConditions.titleContains("Company Structure"));
    }

    @When("user should see the title of the page is {string}")
    public void user_should_see_the_title_of_the_page_is(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        System.out.println("expectedTitle = " + expectedTitle);
    }

    //AC2
    @When("user write department name as {string} into department name input box")
    public void user_write_department_name_as_into_department_name_input_box(String departmentName) {
        employeesPage.addDepartment.click();
        employeesPage.departmentNameInputBox.sendKeys(departmentName);

        this.departmentName = departmentName;
    }

    @When("user select the option as {string} from parent department dropdown box")
    public void user_select_the_option_as_from_parent_department_dropdown_box(String parentDepartmentDropdownOptionFromUser) {
        Select select = new Select(employeesPage.parentDepartmentDropDown);
        select.selectByVisibleText(parentDepartmentDropdownOptionFromUser);
    }

    @When("user click the add button")
    public void user_click_the_add_button() {
        employeesPage.addButton.click();
    }

    @Then("user should see created department by itself")
    public void user_should_see_created_department_by_itself() {
        WebElement actualAddedDepartment = employeesPage.addedDepartment(departmentName);
        Assert.assertTrue(actualAddedDepartment.isDisplayed());
    }

    @Then("user should not see the add department button")
    public void user_should_not_see_the_add_department_button() {

        WebElement addDepartment = null;
        try {
            //I want to click the element which is does not exist because I want to get No Such Element Exception
            employeesPage.addDepartment.click();
            addDepartment = employeesPage.addDepartment;
        } catch (NoSuchElementException e) {
            //If I get noSuchElementException it means that web element does not exist!
            addDepartment = null;
        }

        Assert.assertEquals(null, addDepartment);
    }


}
