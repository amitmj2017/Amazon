package com.amazon.qa.testcases;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class OrderDetailsPageTest extends TestBase {
	
	
	public OrderDetailsPageTest() {
		super();
		PageFactory.initElements(driver, this);
	}
	

}
