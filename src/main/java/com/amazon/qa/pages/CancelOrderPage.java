package com.amazon.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class CancelOrderPage extends TestBase {
	
	
	public CancelOrderPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	

}
