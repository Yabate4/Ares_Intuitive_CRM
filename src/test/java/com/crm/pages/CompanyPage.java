package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CompanyPage {

    public CompanyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//table/tbody/tr/td//a[@class='main-buttons-item-link']")
    public List<WebElement>companyPageMenu;

    @FindBy(xpath="//span[normalize-space(text())='Company']")
    public WebElement companyModuleLink;
}
