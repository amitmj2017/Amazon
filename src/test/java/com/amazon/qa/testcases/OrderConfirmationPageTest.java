package com.amazon.qa.testcases;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class OrderConfirmationPageTest extends TestBase {
	
	
	
	public OrderConfirmationPageTest() {
		super();
		PageFactory.initElements(driver, this);
	}
	

}
