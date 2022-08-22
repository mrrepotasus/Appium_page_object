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
	By btnTiga = By.id("com.coloros.calculator:id/digit_3");
	By btnEmpat = By.id("com.coloros.calculator:id/digit_4");
	By btnLima = By.id("com.coloros.calculator:id/digit_5");
	By btnEnam = By.id("com.coloros.calculator:id/digit_6");
	By btnTujuh = By.id("com.coloros.calculator:id/digit_7");
	By btnDelapan = By.id("com.coloros.calculator:id/digit_8");
	By btnSembilan = By.id("com.coloros.calculator:id/digit_9");
	By btnEnol = By.id("com.coloros.calculator:id/digit_0");
	By btnTambah = By.id("com.coloros.calculator:id/op_add");
	By btnKali = By.id("com.coloros.calculator:id/op_mul");
	By btnBagi = By.id("com.coloros.calculator:id/op_div");
	By btnKurang = By.id("com.coloros.calculator:id/op_sub");
	By btnSamaDengan = By.id("com.coloros.calculator:id/eq");
	By hasil = By.id("com.coloros.calculator:id/result");
	By Clear = By.id("com.coloros.calculator:id/clr");
	/* web: xpath = //taghtml[contains(@attr,value)]*/
	
//post test 20
	public void calcAdd() {
		driver.findElement(btnSatu).click();
		driver.findElement(btnTambah).click();
		driver.findElement(btnDua).click();
		driver.findElement(btnSamaDengan).click();
	}
	
	public void calcSub() {
		driver.findElement(btnSatu).click();
		driver.findElement(btnEnam).click();
		driver.findElement(btnKurang).click();
		driver.findElement(btnSembilan).click();
		driver.findElement(btnSamaDengan).click();
	}
	
	public void calcMul() {
		driver.findElement(btnDelapan).click();
		driver.findElement(btnKali).click();
		driver.findElement(btnTiga).click();
		driver.findElement(btnSamaDengan).click();
	}
	
	public void calDiv() {
		driver.findElement(btnEmpat).click();
		driver.findElement(btnDelapan).click();
		driver.findElement(btnBagi).click();
		driver.findElement(btnDelapan).click();
		driver.findElement(btnSamaDengan).click();
	}
	
	public String getTxtResult() {
		return driver.findElement(hasil).getText();
	}
	
	public void Clear() {
		driver.findElement(Clear).click();
	}
}

//