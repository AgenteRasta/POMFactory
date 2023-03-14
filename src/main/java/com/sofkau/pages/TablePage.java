package com.sofkau.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TablePage extends CommonActionOnPages{
    @CacheLookup
    @FindBy(xpath = "//div[@class='card mt-4 top-card'][1]")
    private WebElement iconoElement;
    @CacheLookup
    @FindBy(xpath = "//*[text()='Web Tables']")
    private WebElement iconoWebTables;
    @CacheLookup
    @FindBy(id = "addNewRecordButton")
    private WebElement iconoAdd;
    @CacheLookup
    @FindBy(id = "firstName")
    private WebElement name;
    @CacheLookup
    @FindBy(id = "lastName")
    private WebElement lastName;
    @CacheLookup
    @FindBy(id = "userEmail")
    private WebElement email;
    @CacheLookup
    @FindBy(id = "age")
    private WebElement age;
    @CacheLookup
    @FindBy(id = "salary")
    private WebElement salary;
    @CacheLookup
    @FindBy(id = "department")
    private WebElement department;
    @CacheLookup
    @FindBy(id = "submit")
    private WebElement submit;
    public TablePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void navigatePage(){
        click(iconoElement);
        click(iconoWebTables);
        click(iconoAdd);
    }

    public void fillMandatoryFields(String nombre, String apellido, String edad, String correo, String salario, String departamento){
        typeInto(name,nombre);
        typeInto(lastName,apellido);
        typeInto(email,correo);
        typeInto(age,edad);
        typeInto(salary,salario);
        typeInto(department,departamento);
        click(submit);

    }
}
