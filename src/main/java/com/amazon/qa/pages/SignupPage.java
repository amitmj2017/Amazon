package com.amazon.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class SignupPage extends TestBase {
	
	
	public SignupPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	

}
