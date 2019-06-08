package com.amazon.qa.testcases;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.ProductDetailPage;

public class ProductDetailPageTest extends TestBase {
	
	
	public ProductDetailPageTest() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	
	

	
	@Test
	
	public void verifyaddtocartbutton() {
		
		
		
		
		ProductDetailPage pg = new ProductDetailPage();
		boolean addtocartbutton = pg.verifyaddtocart();
		Assert.assertTrue(addtocartbutton);
				
		
	}
	
	
	
	
	
	
}
