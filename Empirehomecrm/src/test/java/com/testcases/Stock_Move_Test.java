package com.testcases;

import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.LoginPage;

import com.pageobjects.Stock_move_Functionality;

public class Stock_Move_Test extends Basetest {

	LoginPage Login;
	Stock_move_Functionality Stock;

	public Stock_Move_Test() {
		super();
	}

	@BeforeMethod
	public void setup() {

		initialization();

		Login = new LoginPage();
		Stock = new Stock_move_Functionality();
	}

	@Test

	public void loginvalidation() throws Throwable {
		Login.verifyLogin();
		Stock.Stockmoveverify();

		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/Inventory/StockMovement");

	}

	@AfterMethod
	public void teardown() {

	}
}
