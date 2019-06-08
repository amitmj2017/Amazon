package com.amazon.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class OrderConfirmationPage extends TestBase {
	
	
	public OrderConfirmationPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	

}
