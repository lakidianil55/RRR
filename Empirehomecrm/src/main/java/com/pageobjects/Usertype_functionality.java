package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class Usertype_functionality extends Basetest {

	@FindBy(xpath = "//span[@class='pe-7s-keypad']")
	WebElement clickkeypad;

	@FindBy(xpath = "//span[normalize-space()='Masters']")
	WebElement clickMasters;

	@FindBy(xpath = "//a[normalize-space()='User Types']")
	WebElement clickUserTypes;

	@FindBy(xpath = "//a[normalize-space()='Add New']")
	WebElement clickAddNew;

	@FindBy(xpath = "//input[@id='TypeName']")
	WebElement TypeName;

	@FindBy(xpath = "//input[@id='TypeCode']")
	WebElement TypeCode;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement clickSave;

	@FindBy(xpath = "//input[@class='form-control form-control-sm']")
	WebElement search;

	@FindBy(xpath = "//tr[@class='odd']//i[@class='fa fa-pencil']")
	WebElement clickedit;

	@FindBy(xpath = "//input[@id='TypeName']")
	WebElement TypeName1;

	@FindBy(xpath = "//input[@id='TypeCode']")
	WebElement TypeCode1;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement clickSave1;

	public Usertype_functionality() {
		PageFactory.initElements(driver, this);

	}

	public void Stockmoveverify() throws Throwable {
		Thread.sleep(2000);
		clickkeypad.click();
		Thread.sleep(2000);
		clickMasters.click();
		Thread.sleep(2000);
		clickUserTypes.click();
		Thread.sleep(2000);
		clickAddNew.click();
		TypeName.sendKeys(prop.getProperty("TypeName"));
		Thread.sleep(2000);
		TypeCode.sendKeys(prop.getProperty("TypeCode"));
		Thread.sleep(2000);
		clickSave.click();
		search.sendKeys(prop.getProperty("search"));

		Actions a = new Actions(driver);
		Thread.sleep(2000);
		a.moveToElement(clickedit).click().build().perform();
		TypeName.clear();
		TypeName.sendKeys(prop.getProperty("RETypeName"));
		Thread.sleep(2000);
		TypeCode.clear();
		TypeCode.sendKeys(prop.getProperty("RETypeCode"));
		Thread.sleep(2000);
		clickSave.click();

	}
}