package com.amazon.qa.testcases;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class ShippingPageTest extends TestBase {
	
	
	public ShippingPageTest() {
		super();
		PageFactory.initElements(driver, this);
	}
	

}