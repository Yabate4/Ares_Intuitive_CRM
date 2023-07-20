package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@id='feed-add-post-form-link-text']")
    public WebElement moreOption;

    @FindBy(xpath = "(//span[.='Appreciation'])[2]")
    public WebElement appreciationOption;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement MessageContextBoxIFrame;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement messageContentBox;

    @FindBy(xpath = "//span[@data-id='UA']")
    public WebElement allEmployeesSelection;

    @FindBy(xpath = "//a[.='Add more']")
    public WebElement addMoreSelection;


    @FindBy(xpath = "//a//div[.='GoodGuys']/div")
    public WebElement groupSelectionOption;


    @FindBy(xpath = "(//div[@class='bx-finder-box-item-t7-name'])[2]")
    public WebElement emailUsersSelection;


    @FindBy(xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement allEmployeesCancelBtn;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendBtn;

    @FindBy(xpath = "//button[@id='blog-submit-button-cancel']")
    public WebElement cancelBtn;

    @FindBy(xpath = "//span[@class='popup-window-close-icon']")
    public WebElement closeToOptionsWindowBtn;

    @FindBy(xpath = "//span[.='The message title is not specified']")
    public WebElement errorMessageForTitleField;

    @FindBy(xpath = "//span[.='Please specify at least one person.']")
    public WebElement errorMessageForToField;

    @FindBy(xpath = "(//div[@class='feed-post-text-block-inner-inner'])[1]")
    public WebElement displayedMessage;

    @FindBy(xpath = "//div[@id='feed-add-post-destination-container']")
    public WebElement toInputBox;

    @FindBy(xpath = "//div[@id='popup-window-content-BXSocNetLogDestination']//a[.='Employees and departments']")
    public WebElement employeesAndDepartments;

    @FindBy(xpath = "(//div[@class='bx-finder-company-department'])//div[.='GoodGuys']")
    public WebElement firstAvailableGroup;

    @FindBy(xpath = "//a[@href='#DR135']//div[.='All department and subdepartment employees']")
    public WebElement firstAvailableOption;



}
