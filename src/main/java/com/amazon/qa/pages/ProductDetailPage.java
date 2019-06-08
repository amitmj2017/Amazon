package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class ProductDetailPage extends TestBase {
	
	
	public ProductDetailPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	static WebElement addtocartbutton;
	
	
	
	
	public boolean verifyaddtocart() {
		
		
		
		
		boolean addtocart = addtocartbutton.isDisplayed();
		
		return addtocart;
			
	}
	
	
	
public void clickaddtocart() throws InterruptedException {
		
		
		addtocartbutton.click();
		Thread.sleep(3000);
		
	}
	
	
}
