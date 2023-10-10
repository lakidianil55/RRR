package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class Holidays_Functionality extends Basetest {

	@FindBy(xpath = "//span[@class='pe-7s-keypad']")
	WebElement clickkeypad;

	@FindBy(xpath = "//span[normalize-space()='Masters']")
	WebElement clickMasters;

	@FindBy(xpath = "//a[normalize-space()='Holidays']")
	WebElement clickHolidays;

	@FindBy(xpath = "//a[normalize-space()='Add New']")

	WebElement clickAddNew;

	@FindBy(xpath = "//input[@name='HolidayDate']")
	WebElement HolidayDate;

	@FindBy(xpath = "//input[@id='HolidayName']")
	WebElement HolidayName;

	@FindBy(xpath = "//input[@id='HolidayDesc']")

	WebElement HolidayDesc;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement clickSave;

	@FindBy(xpath = "//tbody/tr[1]/td[5]/a[1]/button[1]")
	WebElement clicEditbutton;
	@FindBy(xpath = "//tbody/tr[1]/td[5]/a[2]/button[1]")
	WebElement clicDelatebutton;

	@FindBy(xpath = "//button[@class='swal-button swal-button--yes']")
	WebElement clicyesbutton;

	public Holidays_Functionality() {
		PageFactory.initElements(driver, this);

	}

	public void Holidaysverify() throws Throwable {
		Thread.sleep(2000);
		clickkeypad.click();
		Thread.sleep(2000);
		clickMasters.click();
		Thread.sleep(2000);
		clickHolidays.click();
		Thread.sleep(2000);
		clickAddNew.click();
		Thread.sleep(2000);
		HolidayDate.sendKeys(prop.getProperty("HolidayDate"));
		Thread.sleep(2000);
		HolidayName.sendKeys(prop.getProperty("HolidayName"));
		Thread.sleep(2000);
		HolidayDesc.sendKeys(prop.getProperty("HolidayDesc"));
		Thread.sleep(2000);
		clickSave.click();
		Thread.sleep(2000);
		clicEditbutton.click();
		Thread.sleep(2000);
		HolidayDate.clear();
		HolidayDate.sendKeys(prop.getProperty("REHolidayDate"));
		Thread.sleep(2000);
		HolidayName.clear();
		HolidayName.sendKeys(prop.getProperty("REHolidayName"));
		Thread.sleep(2000);
		HolidayDesc.clear();
		HolidayDesc.sendKeys(prop.getProperty("REHolidayDesc"));
		Thread.sleep(2000);
		clickSave.click();
		Thread.sleep(2000);
		clicDelatebutton.click();
		Thread.sleep(2000);
		clicyesbutton.click();
	}

}
