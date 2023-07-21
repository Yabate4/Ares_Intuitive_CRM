package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProjectPage {
    public ProjectPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//span[@id='pagetitle']")
    public WebElement companyStructure;

    @FindBy (xpath = "//span[@class='main-buttons-item-text-title']")
    public List<WebElement> modulesOnEmployersPage;

    @FindBy(xpath = "(//span[@class='menu-item-link-text'])[10]")
    public WebElement employeeButton;

}

