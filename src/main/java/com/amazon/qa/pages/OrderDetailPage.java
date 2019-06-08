package com.amazon.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class OrderDetailPage extends TestBase {
	
	
	public OrderDetailPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	

}
