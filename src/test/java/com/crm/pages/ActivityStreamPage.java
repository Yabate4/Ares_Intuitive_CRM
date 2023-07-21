package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ActivityStreamPage {
    public ActivityStreamPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//li[@id=\'bx_left_menu_menu_live_feed\']/a/span[1]")
    public WebElement activityStream;

    @FindBy(xpath = "//div[@id='feed-add-post-form-tab']/span")

    public List<WebElement> ActivityOptions;

    @FindBy(xpath = "//div[@id='left-menu-resizer-button']")
    public WebElement resizerLeftMenuBtn;

    @FindBy(xpath = "//span[@id='feed-add-post-form-link-more']")
    public WebElement moreBtn;

    @FindBy(xpath = "//div[@class='menu-popup-items']/span/span[2]")
    public List<WebElement> moreOptions;
}
