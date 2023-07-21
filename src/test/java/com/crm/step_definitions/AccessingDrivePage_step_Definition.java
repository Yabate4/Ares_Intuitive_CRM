package com.crm.step_definitions;

import com.crm.pages.AccessingDriverPage_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AccessingDrivePage_step_Definition {

    AccessingDriverPage_Page accessingDriverPagePage = new AccessingDriverPage_Page();

    @Given("User should be able to login with valid credential")
    public void user_should_be_able_to_login_with_valid_credential() {

    }
    @When("User click Drive module from homepage")
    public void user_click_drive_module_from_homepage() {
        accessingDriverPagePage.DriveModule.click();

    }

    @Then("Driver page should open with six modules displayed")
    public void driver_page_should_open_with_six_modules_displayed(List<String> webModules) {

        System.out.println("webModules = " + webModules);

        List<String> actualModules = new ArrayList<>();

        for (WebElement eachTopModule : accessingDriverPagePage.topModules) {
            if (eachTopModule.getText().equals("More")){
                continue;
            }
            actualModules.add(eachTopModule.getText());
        }
        System.out.println("actualModules = " + actualModules);

        Assert.assertEquals(actualModules,webModules);

    }


}
