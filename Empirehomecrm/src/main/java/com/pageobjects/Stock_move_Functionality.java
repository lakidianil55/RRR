package com.pageobjects;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.Basetest;

public class Stock_move_Functionality extends Basetest {

	@FindBy(xpath = "//span[@class='pe-7s-keypad']")
	WebElement clickkeypad;

	@FindBy(xpath = "//span[normalize-space()='Inventory']")
	WebElement clickInventory;

	@FindBy(xpath = "//a[normalize-space()='Move Stock']")
	WebElement clickMoveStock;

	@FindBy(xpath = "//select[@id='movedFromD']")
	WebElement clicmovedFromD;

	@FindBy(xpath = "//select[@id='movedToD']")
	WebElement clicmovedToD;

	@FindBy(xpath = "//input[@id='MoStNot']")
	WebElement MoStNot;

	@FindBy(xpath = "//span[@id='select2-invId-container']")
	WebElement clickinvIdcontainer;

	@FindBy(xpath = "//input[@role='textbox']")
	WebElement textbox;

	@FindBy(xpath = "//input[@id='qtymoving']")
	WebElement qtymoving;

	@FindBy(xpath = "//input[@id='btnAdd']")
	WebElement btnAdd;

	@FindBy(xpath = "//button[@id='btnSave']")
	WebElement btnSave;

	public Stock_move_Functionality() {
		PageFactory.initElements(driver, this);

	}

	public void Stockmoveverify() throws Throwable {
		Thread.sleep(1000);
		clickkeypad.click();

		Thread.sleep(1000);
		clickInventory.click();

		Thread.sleep(1000);
		clickMoveStock.click();
		Thread.sleep(1000);
		Select Dropdown = new Select(clicmovedFromD);
		Dropdown.selectByIndex(0);

		Thread.sleep(1000);
		Select Dropdown1 = new Select(clicmovedToD);
		Dropdown1.selectByIndex(1);

		Thread.sleep(1000);
		MoStNot.sendKeys(prop.getProperty("References/Notes"));

		Thread.sleep(1000);
		clickinvIdcontainer.click();

		Thread.sleep(2000);
		Robot r = new Robot();
		textbox.sendKeys(prop.getProperty("textbox"));
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);
		qtymoving.sendKeys(prop.getProperty("MovingQty"));
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);
		btnAdd.click();

		Actions a = new Actions(driver);
		Thread.sleep(2000);
		a.moveToElement(btnSave).click().build().perform();

		Thread.sleep(2000);
		driver.navigate().to("http://empirehome.myprojectsonline.co.in/Inventory/MoveStock");

		Thread.sleep(1000);
		Select Dropdown3 = new Select(clicmovedFromD);
		Dropdown3.selectByIndex(1);

		Thread.sleep(1000);
		Select Dropdown4 = new Select(clicmovedToD);
		Dropdown4.selectByIndex(0);

		Thread.sleep(1000);
		MoStNot.sendKeys(prop.getProperty("References/Notes"));

		Thread.sleep(1000);
		clickinvIdcontainer.click();

		Thread.sleep(2000);
		textbox.sendKeys(prop.getProperty("textbox"));
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);
		qtymoving.sendKeys(prop.getProperty("MovingQty"));
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);
		btnAdd.click();

		Thread.sleep(2000);
		a.moveToElement(btnSave).click().build().perform();

	}

}