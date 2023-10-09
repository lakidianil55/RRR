package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class Customer_functionality extends Basetest {

	@FindBy(xpath = "//span[@class='pe-7s-keypad']")
	WebElement clickkeypad;

	@FindBy(xpath = "//span[normalize-space()='Customers']")
	WebElement clickCustomers;

	@FindBy(xpath = "//a[normalize-space()='Add Customer']")
	WebElement clickAddCustomer;

	@FindBy(xpath = "//input[@placeholder='Enter Customer Name']")
	WebElement EnterCustomerName;
	
	@FindBy(xpath = "//input[@placeholder='Enter Mobile Number']")
	WebElement EnterMobileNumber;
	//input[@placeholder='Enter Mobile Number']
	@FindBy(xpath = "//input[@placeholder='Enter Email Id']")
	WebElement EnterEmailId;

	@FindBy(xpath = "//input[@placeholder='Enter Whatsapp Number']")
	WebElement EnterWhatsappNumber;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement clickSave;
	

	@FindBy(xpath = "//input[@class='form-control form-control-sm']")
	WebElement clicksearch;
	

	public Customer_functionality() {
		PageFactory.initElements(driver, this);

	}

	public void verifyCustomer() throws Throwable {
		Thread.sleep(1000);
		clickkeypad.click();
		Thread.sleep(1000);
		clickCustomers.click();
		Thread.sleep(1000);
		clickAddCustomer.click();
		Thread.sleep(1000);
		EnterCustomerName.sendKeys(prop.getProperty("CustomerName"));
		Thread.sleep(1000);
		EnterMobileNumber.sendKeys(prop.getProperty("EnterMobileNumber"));
		Thread.sleep(1000);
		EnterEmailId.sendKeys(prop.getProperty("EnterEmailId"));
		Thread.sleep(1000);
		EnterWhatsappNumber.sendKeys(prop.getProperty("EnterWhatsappNumber"));
		Thread.sleep(1000);
		clickSave.click();
		clicksearch.sendKeys(prop.getProperty("Customersearch"));
	}
}
