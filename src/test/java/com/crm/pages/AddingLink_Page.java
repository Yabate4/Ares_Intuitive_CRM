package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddingLink_Page {
    public AddingLink_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement username;
    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement password;
    @FindBy(className = "login-btn")
    public WebElement loginButton;
    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-message']/span")
    public WebElement messageButton;
    @FindBy(xpath = "//span[@title='Link']/i")
    public WebElement linkButton;
    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-text']")
    public WebElement textLink;
    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-href']")
    public WebElement linkURL;
    @FindBy(xpath = "//input[@id='undefined']")
    public WebElement saveButton;
    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;
    @FindBy(xpath = "(//div[@class='feed-item-wrap']/div/div/div/div/div/a)[1]")
    public WebElement createdLink;

}
