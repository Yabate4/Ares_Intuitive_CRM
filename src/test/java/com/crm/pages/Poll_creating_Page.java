package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Poll_creating_Page {
    public Poll_creating_Page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(name = "USER_LOGIN")
    public WebElement username;

    @FindBy(name="USER_PASSWORD")
    public  WebElement password;

    @FindBy(className = "login-btn")
    public WebElement loginBtn;


    @FindBy(id= "feed-add-post-form-tab-vote")
    public WebElement pollBtn;
    @FindBy(xpath = "(//span[.='All employees'])[1]")
    public WebElement allEmployeesBtn;

    @FindBy(id="question_0")
    public WebElement questionInputBox;


    @FindBy(xpath = "//input[@id='answer_0__0_']")
    public WebElement answerIputbox1; ////ol[@class='vote-answers']//li[1]

    @FindBy(xpath="//input[@id='question_0']")
    public WebElement answerInputbox2;

    @FindBy(xpath = "//body[@contenteditable='true']")

    public WebElement pollTextArea;

    @FindBy (xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendBtn;

    @FindBy (id = "multi_0")
    public WebElement allowMultipleChoiceCheckBox;


    @FindBy (xpath = "//span[.=\'The message title is not specified\']")
    public WebElement theMessageTitleIsNotSpecified;

    @FindBy (xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement AllEmployessXbtn;


    @FindBy (xpath = "//span[.='Please specify at least one person.']")
    public WebElement pleaseSpecifyAtLeastOnePerson;

    @FindBy (xpath = "//*[@id=\"bx-html-editor-iframe-cnt-idPostFormLHE_blogPostForm\"]/iframe")
    public WebElement iframePollInputBox;

    @FindBy (xpath = "//span[.='The question text is not specified.']")
    public WebElement theQuestionTextIsNotSpecified;

    @FindBy(xpath = "//span[.='The question \"Question1?\" has no answers.']")
    public WebElement theQuestionTextHasNoAnswer;

}



