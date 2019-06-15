package com.amazon.qa.testcases;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.util.loginandsearchforaproduct;
import com.amazon.qa.pages.ProductDetailPage;
import com.amazon.qa.pages.CartPage;
import com.amazon.qa.pages.ShippingPage;


public class CartPageTest extends TestBase {
	
	
	public CartPageTest() {
		super();
		PageFactory.initElements(driver, this);
	}
	
 public static CartPage cp;
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		initialization();
		Thread.sleep(3000);
		
		 	
	}
	
	
	@Test
	public void verifyitemaddedtocart() throws InterruptedException {
		
		
		cp = new CartPage();
		cp.addtocart();
		String CartTest = cp.cartitemaddedverify();
		Assert.assertEquals(CartTest, "Added to Cart ");
			
		
	}
	
	@Test
	public void verifyemptycarTestt() throws InterruptedException {
		
		
		boolean text = cp.verifyemptycar();
		Assert.assertTrue(text);
		
		
	}
	
	
	
@AfterMethod
	
	public void teardown() {
		
		
		driver.close();
		
		
	}
	
	
	
}
