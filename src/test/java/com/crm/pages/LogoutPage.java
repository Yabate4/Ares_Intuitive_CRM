package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LogoutPage {

    public LogoutPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@id='user-block']")
    public WebElement profileName;

    @FindBy(xpath = "//span[.='Log out']")
    public WebElement logoutBtn;

    @FindBy(xpath = "//div[.='Authorization']")
    public WebElement loginPage;

    @FindBy(xpath = "//span[@class='menu-popup-item-text']")
    public List<WebElement> optionsUnderProfileName;
}
