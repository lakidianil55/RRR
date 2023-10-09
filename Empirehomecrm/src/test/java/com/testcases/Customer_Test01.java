package com.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Customer_functionality;
import com.pageobjects.LoginPage;


public class Customer_Test01 extends Basetest {

	LoginPage Login;
	Customer_functionality Customer;

	public Customer_Test01() {
		super();
	}

	@BeforeMethod
	public void setup() {

		initialization();

		Login = new LoginPage();
		Customer = new Customer_functionality();
	}

	@Test

	public void Customervalidation() throws Throwable {
		Login.verifyLogin();
		Customer.Customervalidation();

		String urltest = driver.getCurrentUrl();
		AssertJUnit.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/User/CustomerList");

	}

	@AfterMethod
	public void teardown() {

	}
}

