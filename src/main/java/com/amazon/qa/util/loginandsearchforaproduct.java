package com.amazon.qa.util;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.LoginPage;
import com.amazon.qa.pages.SearchResultPage;


public class loginandsearchforaproduct extends TestBase {
	

		public loginandsearchforaproduct() {
			super();
			PageFactory.initElements(driver, this);
		}
	
	
		

		@BeforeMethod
		public void Setup() throws InterruptedException {
			
			
			initialization();
			Thread.sleep(3000);
			 	
		}
		

public void loginandsearch() throws InterruptedException {
	
	
	
	HomePage hp = new HomePage();
	hp.SignInClick();
	
	LoginPage lp = new LoginPage();
	
	lp.login(prop.getProperty("username"), prop.getProperty("password"));
	SearchResultPage sp = new SearchResultPage();
	sp.firstsearchresultclick();
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
