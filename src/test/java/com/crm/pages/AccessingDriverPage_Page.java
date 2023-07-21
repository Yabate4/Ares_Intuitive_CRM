package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccessingDriverPage_Page {

    public AccessingDriverPage_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@Title='Drive']")
    public WebElement DriveModule;

    @FindBy(xpath = "//div[@id='top_menu_id_docs']//div")
    public List<WebElement> topModules;


}
