package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.LoginPage;
import com.pageobjects.Loginfunctionality;
import com.utils.Dataprovider;

public class Logintest extends Basetest {
	
	 LoginPage Login;

	public Logintest() {
		super();   
	}
	
	@BeforeMethod
	public void setup() {

		initialization();

		Login= new LoginPage();

	}

	@Test

	public void verifyLogin() {
		Login.verifyLogin();
		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/EmpireHome/Dashboard");
		

	}

	@AfterMethod
	public void teardown() {
		//  extentreports.flush();
		//driver.close();

	}
}
