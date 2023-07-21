package com.crm.step_definitions;

import com.crm.pages.ProjectPage;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.collections.list.PredicatedList;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Project_stepDefinition {

    ProjectPage projectPage = new ProjectPage();
    @Given("user is on the home page of the application.")
    public void user_is_on_the_home_page_of_the_application() {
        Driver.getDriver().get(ConfigurationReader.getProperty("crm_url"));
    }

    @When("User access Employees module.")
    public void user_access_employees_module() {
        projectPage.employeeButton.click();
    }

    @Then("Users sees the following 8 modules in the Employees page")
    public void users_sees_the_following_modules_in_the_employees_page(List <String> modulesExpected ) {
        List <WebElement> modulesWebPage = projectPage.modulesOnEmployersPage;
        List<String> modulesActualString = new ArrayList<String>();

        for(WebElement e : modulesWebPage){
            modulesActualString.add(e.getText());
        }
        Assert.assertTrue(modulesExpected.equals(modulesActualString) );
    }

    @And("user on the employee home page sees {string}")
    public void userOnTheEmployeeHomePageSees(String expectedTitle) {

        Assert.assertEquals(projectPage.companyStructure.getText(), expectedTitle);
    }
}

