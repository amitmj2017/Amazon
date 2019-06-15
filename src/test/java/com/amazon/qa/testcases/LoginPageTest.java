package com.amazon.qa.testcases;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.LoginPage;
import com.amazon.qa.util.excelpractice;

public class LoginPageTest extends TestBase {
	
	
	
	public LoginPageTest() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		initialization();
		Thread.sleep(3000);
		 	
	}
	
	
	//@Test
	
	
/*	public static void VerifySignin() throws InterruptedException {
		
		
		HomePage hp = new HomePage();
		
		hp.SignInClick();
		
		LoginPage lp = new LoginPage();
		
		lp.login(prop.getProperty("username"), prop.getProperty("password"));
		
		Boolean result = lp.signedintext();
		
		Assert.assertTrue(result);
		
		
	}*/
	
	@DataProvider(name="Login")
	public Object Signin() throws IOException {
		
		excelpractice ep = new excelpractice();
		
		Object Signindata = ep.excelcellvalue();
	
		return Signindata;
		
		
		
		
	}
	
	
	
	
	@Test(dataProvider = "Login")
	public static void VerifyLogin(String Username, String Password) throws InterruptedException {
		
		HomePage hp = new HomePage();
		
		hp.SignInClick();
		
		LoginPage lp = new LoginPage();
		
		lp.Login(Username,Password);
		
		Boolean result = lp.signedintext();
		
		Assert.assertTrue(result);
		
		
		
	}
	
	
	
@AfterMethod
	
	public void teardown() {
		
		
		driver.close();
		
		
	}
	

}
