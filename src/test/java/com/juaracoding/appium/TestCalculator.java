package com.juaracoding.appium;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.juaracoding.appium.pages.Calculator;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TestCalculator {

	private static AndroidDriver<MobileElement>driver;
	private Calculator calculator;
	
	@BeforeClass
	public void setup() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "realme 6 pro");
		capabilities.setCapability("uuid", "e169530e");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "11.0");
		capabilities.setCapability("AppPackage", "com.android.calculator2");
		capabilities.setCapability("AppActivity", "com.android.calculator2.Calculator");
		
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
	}
	
	@BeforeMethod
	public void pageObject() {
		calculator = new Calculator(driver);
	}
	
	@Test
	public void testAdd() {
		calculator.celcAdd();
		System.out.println("hasil = "+calculator.getTxtResult());
		assertEquals(calculator.getTxtResult(), "3");
	}
	
	@AfterClass
	public void closeApp() {
		driver.quit();
	}
}
