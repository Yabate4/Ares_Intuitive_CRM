package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-message']")
    public WebElement messageBtn;

    @FindBy(xpath ="//span[@id='bx-b-uploadfile-blogPostForm']")
    public WebElement uploadFilesIcon;

    @FindBy(xpath = "//table/tbody//input[@name='bxu_files[]']")
    public WebElement uploadFilesAndImagesBtn;

    @FindBy(xpath = "//table/tbody//span[@class='insert-btn']")
    public WebElement insertInTextBtnInMessageArea;

    @FindBy(xpath = "//table/tbody//span[@class='del-but']")
    public WebElement deleteFileBtnInMessageArea;

    @FindBy(xpath = "//table/tbody/tr[contains(@id,'disk-edit-attachn')]")
    public List<WebElement>uploadedFileInfo;



    @FindBy(xpath = "(//span[.='All employees'])[1]")
    public WebElement allEmployeesButton;

    @FindBy(xpath = "(//a[.='helpdesk1@cybertekschool.com'])")
    public WebElement myEmail;

    @FindBy(xpath = "//span[.='Please specify at least one person.']")
    public WebElement recipientErrorMessage;
    @FindBy(xpath = "//span[@class='feed-add-info-text']")
    public WebElement recipientErrorMessage2;


    @FindBy(css = "span[class='feed-add-info-text']")
    public WebElement emptyMessageErrorMessage;

    @FindBy(xpath = "(//div[@class='feed-post-text-block-inner-inner'])")
    public WebElement displayOfTheMessage;

    @FindBy(xpath = "//body[@style='min-height: 184px;']")
    public WebElement messageBoxInput;
    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement frame;

    @FindBy(xpath ="(//span[.='Message'])[1]" )
    public WebElement messageButton;

    @FindBy(css ="span[class=feed-add-post-del-but]" )
    public WebElement allEmployeesClosingButton;

    @FindBy(id = "#bx-destination-tag")
    public WebElement addMoreButton;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(xpath = "//button[@id='blog-submit-button-cancel']")
    public WebElement cancelButton;

    @FindBy(css = "a[id='bx-destination-tag']")
    public WebElement addPersonsOrGroupButton;

    @FindBy(xpath = "(//div[.='All employees'])[1]")
    public WebElement recentAllEmployeesButton;

    @FindBy(xpath = "//a[@class='bx-finder-box-tab bx-lm-tab-last bx-finder-box-tab-selected']")
    public WebElement recentButton;

    @FindBy(xpath = "//a[@class='bx-finder-box-tab bx-lm-tab-department']")
    public WebElement employeesAndDepartmentButton;
    @FindBy(css = "div[class='bx-finder-company-department-employee-name']")
    public WebElement employees;

    @FindBy(xpath = "//a[@class='bx-finder-box-tab bx-lm-tab-email']")
    public WebElement emailUsersButton;
 @FindBy(css = "span[class='popup-window-close-icon']")
    public WebElement closeIcone;
    @FindBy(xpath = "//span[@class='popup-window-close-icon']")
    public WebElement closeToOptionsWindowBtn;

}
