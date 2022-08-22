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
//post test 20
	@Test
	public void testAdd() {
		calculator.calcAdd();
		System.out.println("hasil pertambahan = "+calculator.getTxtResult());
		assertEquals(calculator.getTxtResult(), "3");
		delay(2);
		calculator.Clear();
	}
	
	@Test
	public void testSub() {
		calculator.calcSub();
		System.out.println("hasil pengurangan = "+calculator.getTxtResult());
		assertEquals(calculator.getTxtResult(), "7");
		delay(2);
		calculator.Clear();
	}
	
	@Test
	public void testMul() {
		calculator.calcMul();
		System.out.println("hasil perkalian = "+calculator.getTxtResult());
		assertEquals(calculator.getTxtResult(), "24");
		delay(2);
		calculator.Clear();
	}
	
	@Test
	public void testDiv() {
		calculator.calDiv();
		System.out.println("hasil pembagian = "+calculator.getTxtResult());
		assertEquals(calculator.getTxtResult(), "6");
		delay(2);
		calculator.Clear();
	}
	
	@AfterClass
	public void closeApp() {
		driver.quit();
	}
	
	static void delay(int detik) {
		try {
			Thread.sleep(1000 * detik);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
	
}
