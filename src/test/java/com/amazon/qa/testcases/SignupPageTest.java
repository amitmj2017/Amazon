package com.amazon.qa.testcases;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class SignupPageTest extends TestBase {
	
	public SignupPageTest() {
		super();
		PageFactory.initElements(driver, this);
	}
	

}
