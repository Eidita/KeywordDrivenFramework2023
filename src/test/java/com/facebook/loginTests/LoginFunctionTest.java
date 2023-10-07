package com.facebook.loginTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.facebook.base.BaseTest;
import com.facebook.loginPages.LoginPage;
import com.facebook.utilities.PropertiesReader;
	
public class LoginFunctionTest extends BaseTest{
	LoginPage lp;
	PropertiesReader rp;
	
	@BeforeMethod
	public void openfacebook() {
		openApp();
	}
	@Test(priority=0)
	public void userNameTest() {
		lp=new LoginPage(driver);
		rp=new PropertiesReader();
		lp.userNameMethod(rp.getUserName());
	}@Test(priority=1)
	public void passwordTest() {
		lp.passWordMethod(rp.gotPassword());
	}
	@Test(priority=2)
	public void loginButtonTest() {
		lp.loginButton();
		
	}

	@AfterMethod
	public void closeTest() {
		closeApp();
	}
}
