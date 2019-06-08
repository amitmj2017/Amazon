package com.amazon.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class PaymentPage extends TestBase {
	
	
	public PaymentPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	

}
