package com.facebook.loginTests;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.facebook.base.BaseTest;
import com.facebook.loginPages.LoginPage;
import com.facebook.utilities.PropertiesReader;

public class LoginTest extends BaseTest{
	LoginPage loginPage;
	PropertiesReader propertiesReader;
	//propertiesReader=variable name
	
	@BeforeTest
	public void openfacebook() {
		openApp();
	}
	@Test
	public void loginTest() {
		propertiesReader=new PropertiesReader();
		loginPage=new LoginPage(driver);//here driver because there is a constructor //instance variable
		loginPage.userNameMethod(propertiesReader.getUserName());
		loginPage.passWordMethod(propertiesReader.gotPassword());
		loginPage.loginButton();
	
	
	
	}
	@AfterTest
	public void closeApp() {
		if (driver != null) {
			driver.quit();
		
		}
	

	}}
