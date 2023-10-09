package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import com.base.Basetest;


public class Loginfunctionality extends Basetest {

   @FindBy (xpath="//input[@placeholder='example@gmail.com']")   
   WebElement userid;
	
   @FindBy (name="pword")
   WebElement pass;
  
   
   @FindBy (xpath="//button[text()='Login']")
   WebElement loginbutton;
   
   public Loginfunctionality() {
		super();
	}

	

   
   public void verifylogin() {
	   
	  userid.sendKeys(("username")); 
	   pass.sendKeys(("password"));
	   loginbutton.click();
   }
   
	
}
