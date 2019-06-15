package com.amazon.qa.testcases;
import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.util.screenshot;

public class HomePageTest extends TestBase {
	
	
	public HomePageTest() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public static HomePage hp ;
	public static screenshot ss;
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		initialization();
		Thread.sleep(3000);
		 hp = new HomePage();	
	}
	
	//**********************************************Page Test******************
	//@Test
	
	public void VerifyLogoTest() {
		
		boolean hplogo = hp.VerifyHomePageLogo();
		
		Assert.assertTrue(hplogo);
		
	}
	
	//@Test
	public void VerifySelectedOptionSearch() throws InterruptedException, IOException {
		
		
		
		String CatVal = hp.Selectcategory();
		try {
			Assert.assertEquals(CatVal, "Kindle Store");
			ss.takescreenshot();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			
		}
		
		
	}
	
	
	
	//@Test
	
	public void verifybrokenlinkstest() {
		
		
		hp.findbrokenlinks();
		
		
	}
	
	
	@Test
	public void switchtotabtest() throws AWTException, InterruptedException, IOException {
		
		
		ss = new screenshot();
		hp.switchtotab();
		ss.takescreenshot();
		
		
		
		//this will test the point 35 in questions text document
		
	
		
	}
	
	
	
	@AfterMethod
	
	public void teardown() {
		
		
		driver.close();
		
		
	}
	
	
	

}
