package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement username;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement password;

    @FindBy(css = ".login-btn")
    public WebElement loginButton;

    public void login_CRM(String username, String password){
        // we are using this.username because we need to call the instance variable from the class, if we do not use the this. keyword, the method will think that we are referring to the local username String from the method parameters
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        loginButton.click();
    }


}
