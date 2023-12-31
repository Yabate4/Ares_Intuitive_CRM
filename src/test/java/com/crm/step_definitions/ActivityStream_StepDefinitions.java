package com.crm.step_definitions;

import com.crm.pages.HomePage;
import com.crm.utilities.BrowserUtilities;
import com.crm.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.List;

public class ActivityStream_StepDefinitions {

    HomePage homePage = new HomePage();

    @When(": user should be able to click on Activity Button")
    public void user_should_be_able_to_click_on_activity_button() {
        if(homePage.resizerLeftMenuBtn.getAttribute("style") == "opacity: 0;"){
            //System.out.println("\"it is not displayed\" = " + "it is not displayed");
            homePage.resizerLeftMenuBtn.click();
        }
        homePage.activityStream.click();
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://qa.intuitivecrm.io/stream/");

    }
    @Then(": user should be able to see activity page options")
    public void user_should_be_able_to_see_activity_page(List<String> options) {

        List<String> actualOptions = BrowserUtilities.getElementsText(homePage.ActivityOptions);
        Assert.assertTrue(BrowserUtilities.CompareLists(actualOptions,options));
        //System.out.println("BrowserUtilities.CompareLists(options,actualOptions) = " + BrowserUtilities.CompareLists(options, actualOptions));
    }

    @When(": user click on more tab")
    public void user_click_on_more_tab() {
       homePage.moreBtn.click();
    }
    @Then(": user should be able to see more options")
    public void user_should_be_able_to_see_more_options(List<String> actualMoreOptions) {
        List<String> expectedMoreOptions = BrowserUtilities.getElementsText(homePage.moreOptions);
        Assert.assertTrue(BrowserUtilities.CompareLists(expectedMoreOptions,actualMoreOptions));
    }

}
