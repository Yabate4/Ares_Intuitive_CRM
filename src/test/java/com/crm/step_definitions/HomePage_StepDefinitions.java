package com.crm.step_definitions;

import com.crm.pages.HomePage;

import com.crm.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class HomePage_StepDefinitions {
    HomePage homePage = new HomePage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    @Then("click on message button")
    public void click_on_message_button() {
        homePage.messageBtn.click();

    }

    @Then("Click on Upload files icon")
    public void click_on_upload_files_icon() {
        homePage.uploadFilesIcon.click();
    }

    @Then("Click to Upload files and images option")
    public void click_to_upload_files_and_images_option() {
        try {
            homePage.uploadFilesAndImagesBtn.sendKeys("/Users/andriyhlushko/Downloads/R.png");
        } catch (org.openqa.selenium.StaleElementReferenceException ex) {
            homePage.uploadFilesAndImagesBtn.sendKeys("/Users/andriyhlushko/Downloads/R.png");
        }

        try {
            homePage.uploadFilesAndImagesBtn.sendKeys("/Users/andriyhlushko/Downloads/some-file.txt");
        } catch (org.openqa.selenium.StaleElementReferenceException ex) {
            homePage.uploadFilesAndImagesBtn.sendKeys("/Users/andriyhlushko/Downloads/some-file.txt");
        }

        try {
            homePage.uploadFilesAndImagesBtn.sendKeys("/Users/andriyhlushko/Downloads/GitFlow.pdf");
        } catch (org.openqa.selenium.StaleElementReferenceException ex) {
            homePage.uploadFilesAndImagesBtn.sendKeys("/Users/andriyhlushko/Downloads/GitFlow.pdf");
        }

        wait.until(ExpectedConditions.elementToBeClickable(homePage.insertInTextBtnInMessageArea));
        Assert.assertFalse(homePage.uploadedFileInfo.isEmpty());
    }

    @Then("Click on Insert in text button")
    public void click_on_insert_in_text_button() {
        wait.until(ExpectedConditions.elementToBeClickable(homePage.insertInTextBtnInMessageArea));
        try {
            homePage.insertInTextBtnInMessageArea.click();
        } catch (org.openqa.selenium.StaleElementReferenceException ex) {
            homePage.insertInTextBtnInMessageArea.click();
        }
    }

    @Then("Click x\\(delete) button")
    public void click_x_delete_button() {

        int size = homePage.uploadedFileInfo.size();

        try {
            homePage.deleteFileBtnInMessageArea.click();
        } catch (org.openqa.selenium.StaleElementReferenceException ex) {
            homePage.deleteFileBtnInMessageArea.click();
        }

        int newSize = homePage.uploadedFileInfo.size();

//        if (newSize < size) {
//            System.out.println("You are deleted your file successfully");
//        } else {
//            System.out.println("Your file wasn't deleted");
//        }

        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        boolean isDeleted = size > newSize;
        Assert.assertTrue("Your file wasn't deleted", isDeleted);
    }

    }

