package com.pageobjects;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class Employee_Registration_Functionality extends Basetest {
	
	@FindBy(xpath = "//span[@class='pe-7s-keypad']")
	WebElement clickkeypad;
	
	@FindBy(xpath = "//span[normalize-space()='Staff']")
	WebElement clickstaff;
	
	@FindBy(xpath = "//a[normalize-space()='Add New Staff']")
	WebElement clickAddNewStaff;
	
	@FindBy(xpath = "//input[@placeholder='Name']")
	WebElement clickName;
	
	@FindBy(xpath = "//input[@placeholder='Enter Your Mail']")
	WebElement clickMail;
	
	@FindBy(xpath = "//input[@placeholder='Mobile Number']")
	WebElement clickMobileNumber;
	

	@FindBy(xpath = "//span[@id='select2-UserTypeId-container']")
	WebElement clickbutton;
	
	@FindBy(xpath = "//input[@role='textbox']")
	WebElement clicktextbox;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement clickSave;
	
     public Employee_Registration_Functionality() {
    	 
    	 PageFactory.initElements(driver, this);
     }
     
     public void Employee_Registration_verify() throws Throwable {
    	 Thread.sleep(2000);
    	 clickkeypad.click();
    	 Thread.sleep(2000);
    	 clickstaff.click();
    	 Thread.sleep(2000);
    	 clickAddNewStaff.click();
    	 Thread.sleep(2000);
    	 clickName.sendKeys(prop.getProperty("Name"));
    	 Thread.sleep(2000);
    	 clickMail.sendKeys(prop.getProperty("Mail"));
    	 Thread.sleep(2000);
    	 clickMobileNumber.sendKeys(prop.getProperty("MobileNumber"));
    	 Thread.sleep(2000);
    	 clickbutton.click();
    	 Robot r =new Robot();
    	 Thread.sleep(2000);
    	 clicktextbox.sendKeys(prop.getProperty("textbox")); 
    	 r.keyPress(KeyEvent.VK_ENTER);
    	 r.keyRelease(KeyEvent.VK_ENTER);
    	 Thread.sleep(2000);
    	 clickSave.click();
    	 
    	 
     }
}
