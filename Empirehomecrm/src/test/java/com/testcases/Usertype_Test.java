package com.testcases;

	import org.testng.Assert;

	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import com.base.Basetest;
	import com.pageobjects.LoginPage;


import com.pageobjects.Usertype_functionality;

	public class Usertype_Test extends Basetest{

		LoginPage Login;
		Usertype_functionality  Usertype;

		public Usertype_Test() {
			super();
		}

		@BeforeMethod
		public void setup() {

			initialization();

			Login = new LoginPage();
			Usertype = new 	Usertype_functionality();
		}

		@Test

		public void loginvalidation() throws Throwable {
			Login.verifyLogin();
			Usertype.Stockmoveverify();

			String urltest = driver.getCurrentUrl();
			Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/Master/Usertypes");

		}

		@AfterMethod
		public void teardown() {

		}
	}

