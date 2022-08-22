package com.juaracoding.appium.pages;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Calculator {

	private AndroidDriver<MobileElement>driver;
	
	public Calculator(AndroidDriver<MobileElement>driver) {
		this.driver= driver;
	}
	
	//Locator
	By btnSatu = By.id("com.coloros.calculator:id/digit_1");
	By btnDua = By.id("com.coloros.calculator:id/digit_2");
	By btnTambah = By.id("com.coloros.calculator:id/op_add");
	By btnSamaDengan = By.id("com.coloros.calculator:id/eq");
	By hasil = By.id("com.coloros.calculator:id/result");
	/* web: xpath = //taghtml[contains(@attr,value)]*/
	
	//method
	public void celcAdd() {
		driver.findElement(btnSatu).click();
		driver.findElement(btnTambah).click();
		driver.findElement(btnDua).click();
		driver.findElement(btnSamaDengan).click();
	}
	
	public String getTxtResult() {
		return driver.findElement(hasil).getText();
	}
	
}

//