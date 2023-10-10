package com.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.base.Basetest;
import com.pageobjects.Employee_Registration_Functionality;

import com.pageobjects.LoginPage;

public class Employee_Registration_Functionality_Test extends Basetest {

	LoginPage Login;
	 Employee_Registration_Functionality  Employee_Registration;

	public Employee_Registration_Functionality_Test() {
		super();
	}

	@BeforeMethod
	public void setup() {

		initialization();

		Login = new LoginPage();
		Employee_Registration = new Employee_Registration_Functionality();
	}

	@Test

	public void Employee_Registration_verify() throws Throwable {
		Login.verifyLogin();
		Employee_Registration.Employee_Registration_verify();

		String urltest = driver.getCurrentUrl();
		AssertJUnit.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/Staff/NewStaffList");

	}

	@AfterMethod
	public void teardown() {

	}
}
