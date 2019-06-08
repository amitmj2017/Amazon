package com.amazon.qa.testcases;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class PaymentPageTest extends TestBase {
	
	
	public PaymentPageTest() {
		super();
		PageFactory.initElements(driver, this);
	}
	

}
