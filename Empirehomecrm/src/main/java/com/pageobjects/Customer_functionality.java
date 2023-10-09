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

	@FindBy(xpath = "//input[@placeholder='Enter Email Id']")
	WebElement EnterEmailId;

	@FindBy(xpath = "//input[@placeholder='Enter Whatsapp Number']")
	WebElement EnterWhatsappNumber;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement clickSave;

	@FindBy(xpath = "//input[@class='form-control form-control-sm']")
	WebElement search;

	@FindBy(xpath = "//tbody/tr[1]/td[11]/a[1]/button[1]")
	WebElement Edit;

	@FindBy(xpath = "//tbody/tr[1]/td[11]/a[3]/button[1]/i[1]")
	WebElement Delate;

	@FindBy(xpath = "//button[@class='swal-button swal-button--yes']")
	WebElement clickyes;

	public Customer_functionality() {
		PageFactory.initElements(driver, this);

	}

	public void Customervalidation() throws Throwable {
		Thread.sleep(2000);
		clickkeypad.click();
		Thread.sleep(2000);
		clickCustomers.click();
		Thread.sleep(2000);
		clickAddCustomer.click();
		Thread.sleep(2000);
		EnterCustomerName.sendKeys(prop.getProperty("EnterCustomerName"));
		Thread.sleep(2000);
		EnterMobileNumber.sendKeys(prop.getProperty("EnterMobileNumber"));
		Thread.sleep(2000);
		EnterEmailId.sendKeys(prop.getProperty("EnterEmailId"));
		EnterWhatsappNumber.sendKeys(prop.getProperty("EnterWhatsappNumber"));
		Thread.sleep(2000);
		clickSave.click();
		Thread.sleep(2000);
		search.sendKeys(prop.getProperty("CustomerSearch"));
		Edit.click();
		EnterCustomerName.clear();
		EnterCustomerName.sendKeys(prop.getProperty("REEnterCustomerName"));
		EnterMobileNumber.clear();
		EnterMobileNumber.sendKeys(prop.getProperty("REEnterMobileNumber"));
		EnterEmailId.clear();
		EnterEmailId.sendKeys(prop.getProperty("REEnterEmailId"));
		EnterWhatsappNumber.clear();
		EnterWhatsappNumber.sendKeys(prop.getProperty("REEnterWhatsappNumber"));
		Thread.sleep(2000);
		clickSave.click();
		Thread.sleep(2000);
		Delate.click();
		Thread.sleep(2000);
		clickyes.click();
	}

}
