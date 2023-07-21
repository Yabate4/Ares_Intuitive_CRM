package com.crm.step_definitions;

import com.crm.pages.EmployeesPage;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class Project_stepDefinition {

    EmployeesPage employeesPage = new EmployeesPage();
    @Given("user is on the home page of the application.")
    public void user_is_on_the_home_page_of_the_application() {
        Driver.getDriver().get(ConfigurationReader.getProperty("crm_url"));
    }

    @When("User access Employees module.")
    public void user_access_employees_module() {
        employeesPage.employeeButton.click();
    }

    @Then("Users sees the following 8 modules in the Employees page")
    public void
    users_sees_the_following_modules_in_the_employees_page(List <String> modulesExpected ) throws AWTException {
        Robot robot = new Robot();
        for (int i = 0; i < 4; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_CONTROL);
        }

        List <String> modulesWebPage = new ArrayList<>();
        for (WebElement each : employeesPage.modulesOnEmployersPage) {
            modulesWebPage.add(each.getText());
        }
        System.out.println(modulesWebPage);
        Assert.assertEquals(modulesExpected, modulesWebPage);

    }

    @And("user on the employee home page sees {string}")
    public void userOnTheEmployeeHomePageSees(String expectedTitle) {

        Assert.assertEquals(expectedTitle, employeesPage.companyStructure.getText());
    }
}

