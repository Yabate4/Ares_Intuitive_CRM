package com.crm.step_definitions;

import com.crm.pages.CompanyPage;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class CompanyPage_StepDefinitians {
    CompanyPage company_Page = new CompanyPage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    @Then("click on Company module")
    public void click_on_company_module(List<String> expectedCompanyMenu) {

        wait.until(ExpectedConditions.elementToBeClickable(company_Page.companyModuleLink));
        company_Page.companyModuleLink.click();

        List<String> actualCompanyMenu = new ArrayList<>();

        for (WebElement eachModule : company_Page.companyPageMenu) {
            actualCompanyMenu.add(eachModule.getText());
        }

        System.out.println(actualCompanyMenu);

        Assert.assertEquals(expectedCompanyMenu, actualCompanyMenu);
    }
}
