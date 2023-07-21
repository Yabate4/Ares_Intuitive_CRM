package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeesPage {


    public EmployeesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@title='Employees']")
    public WebElement employeesPageButton;

    @FindBy(xpath = "//a[@class='webform-small-button webform-small-button-blue webform-small-button-add']")
    public WebElement addDepartment;

    @FindBy(xpath = "//input[@name='NAME']")
    public WebElement departmentNameInputBox;

    @FindBy(xpath = "//select[@id='IBLOCK_SECTION_ID']")
    public WebElement parentDepartmentDropDown;

    @FindBy(xpath = "//span[text()='Add']")
    public WebElement addButton;


    //TODO create method that create new company department and assign to stepdef!

    public WebElement addedDepartment(String departmentName) {

        //I did not locate web-element using additional string I need additional string to locate because before creating new department it does not exist

        // Find to added department using department name which comes from department name input box!
        return Driver.getDriver().findElement(By.xpath("//a[@title='" + departmentName + "']"));
    }
}
