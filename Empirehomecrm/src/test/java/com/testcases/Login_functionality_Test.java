package com.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Login_Functionality_page;
import com.utils.*;

public class Login_functionality_Test extends Basetest {
	
	Login_Functionality_page lf;
	private final String sheetname = "login";

	public Login_functionality_Test() {
		super();   //invokes the parent class constructor
	}
	
	@DataProvider

	public String[][] dataload() throws Throwable {
		return  Login_dataprovider.Customerdata(sheetname);
	}

	@BeforeMethod
	public void setup() {

		initialization();

		lf = new Login_Functionality_page();

	}

	@Test(dataProvider = "dataload",dataProviderClass = Login_functionality_Test.class)

	public void loginvalidation(String username,String pass) {
		
		lf.verifylogin(username, pass);
		String urltest = driver.getCurrentUrl();
		AssertJUnit.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/EmpireHome/Dashboard");
		

	}

	@AfterMethod
	public void teardown() {
		 // extentreports.flush();
		//driver.close();

	}

}
