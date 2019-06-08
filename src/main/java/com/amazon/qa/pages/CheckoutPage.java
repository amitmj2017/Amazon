package com.amazon.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class CheckoutPage extends TestBase {
	
	
	public CheckoutPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	

}
