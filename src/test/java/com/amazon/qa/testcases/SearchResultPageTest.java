package com.amazon.qa.testcases;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.SearchResultPage;
import com.amazon.qa.pages.ProductDetailPage;

public class SearchResultPageTest extends TestBase {
	
	
	
	
	public SearchResultPageTest() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	
	
	//SearchResultPage sp = new SearchResultPage();
	//ProductDetailPage pdp = new ProductDetailPage();
	
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		initialization();
		Thread.sleep(3000);
		 	
	}
	
	
	
	//@Test(priority=1)
	
	public void verifysearchpagesortbyelement() {
		
		
		SearchResultPage sp = new SearchResultPage();
		
		String text = sp.verifyresultspagesortbyelement();
		
		text = text.replace("\"", "");
		
		Assert.assertEquals(text, "Kindle");
		
		
		
	}
	
	
	@Test
	public void verifyresultsautosuggestionoptiontest() throws InterruptedException {
		
		
		SearchResultPage sp = new SearchResultPage();
		
		String text = sp.verifyresultsautosuggestionoption();
		
		text = text.replace("\"", "");
		
		Assert.assertEquals(text, "laptop");
		
		
	}
	
	
	//@Test(priority=2)
	public void verifyproductclick() throws InterruptedException {
		
		
		SearchResultPage sp = new SearchResultPage();
		sp.firstsearchresultclick();
		ProductDetailPage pdp = new ProductDetailPage();
		boolean addtocartbutton = pdp.verifyaddtocart();
		Assert.assertTrue(addtocartbutton);
		
		
		
		
	
	}
	
	
	
@AfterMethod
	
	public void teardown() {
		
		
		driver.quit();
		
		
	}
	
	
	
}
