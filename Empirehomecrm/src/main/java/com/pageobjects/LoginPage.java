package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class LoginPage extends Basetest {

	@FindBy(name = "emailid")
	WebElement textusername;

	@FindBy(name = "pword")
	WebElement textpassword;

	@FindBy(xpath = "//button[@class='btn green_btn']")
	WebElement Loginbutton;

	public LoginPage() {
		PageFactory.initElements(driver, this);

	}

	public void verifyLogin() {

		textusername.sendKeys(prop.getProperty("username"));
		textpassword.sendKeys(prop.getProperty("password"));
		Loginbutton.click();
	}
}