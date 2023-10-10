package com.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.base.Basetest;
import com.pageobjects.Holidays_Functionality;
import com.pageobjects.LoginPage;

public class Holidays_Functionality_TEST extends Basetest {

	LoginPage Login;
	Holidays_Functionality Holidays;

	public Holidays_Functionality_TEST() {
		super();
	}

	@BeforeMethod
	public void setup() {

		initialization();

		Login = new LoginPage();
		Holidays = new Holidays_Functionality();
	}

	@Test

	public void Holidaysvalidation() throws Throwable {
		Login.verifyLogin();
		Holidays.Holidaysverify();

		String urltest = driver.getCurrentUrl();
		AssertJUnit.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/Master/Holidays");

	}

	@AfterMethod
	public void teardown() {

	}
}
