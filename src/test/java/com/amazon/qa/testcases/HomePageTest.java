package com.amazon.qa.testcases;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HomePage;

public class HomePageTest extends TestBase {
	
	
	public HomePageTest() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public static HomePage hp;
	
	@BeforeMethod
	public void Setup() {
		
		initialization();
		 hp = new HomePage();	
	}
	
	//**********************************************Page Test******************
	@Test
	
	public void VerifyLogoTest() {
		
		boolean hplogo = hp.VerifyHomePageLogo();
		
		Assert.assertTrue(hplogo);
		
	}
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	
	public void teardown() {
		
		
		driver.close();
		
	}
	
	
	

}
