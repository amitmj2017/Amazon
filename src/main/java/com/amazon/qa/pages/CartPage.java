package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.util.loginandsearchforaproduct;
import com.amazon.qa.pages.ProductDetailPage;

public class CartPage extends TestBase {
	
	
	public CartPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='a-popover-inner']//span[@class='a-button-inner']//input[@aria-labelledby='a-autoid-18-announce']")
	static WebElement clickcontinue;
	
	@FindBy(xpath = "//h1[@class= 'a-size-medium a-text-bold']")
	static WebElement cartitemaddedtext;
	
	
	@FindBy(xpath = "//a[@id='hlb-ptc-btn-native']")
	static WebElement checkoutbutton;
	
	
	public void addtocart() throws InterruptedException {
		
		

		loginandsearchforaproduct logsearch = new loginandsearchforaproduct();
		ProductDetailPage pdp = new ProductDetailPage();
		logsearch.loginandsearch();
		Thread.sleep(5000);
		pdp.clickaddtocart();
		Thread.sleep(5000);
		
	}
	
	
	
	public String cartitemaddedverify() throws InterruptedException {
		
		
		clickcontinue.click();
		Thread.sleep(5000);
		String carttext = cartitemaddedtext.getText();
		return carttext;
		
		
	}
	
	
	
	public void checkoutcart() throws InterruptedException {
		
		clickcontinue.click();
		Thread.sleep(1000);
		checkoutbutton.click();
		Thread.sleep(2000);
		
		
		
		
	}
	
	public static boolean verifyemptycar() throws InterruptedException {
		ShippingPage shp = new ShippingPage();
		CartPage cp = new CartPage();
		cp.addtocart();
		Thread.sleep(5000);
		cp.checkoutcart();
		Thread.sleep(5000);
		Boolean text = shp.clickaddressandemptycart();
		return text;
		
		
		
		
	}
	
}
