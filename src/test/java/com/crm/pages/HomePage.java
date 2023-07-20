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
}
