package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class HomePage extends TestBase {
	
	
	public HomePage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	
	//***********************Page Factory ----OR(Object repo)*******************************************
	
	@FindBy(xpath="//div[@id ='nav-logo']/a[1]") 
	static WebElement Logo;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//******************************************** Page Methods***************************************
	public boolean VerifyHomePageLogo() {
		
		
		boolean amazonlogo = Logo.isDisplayed();
		
		return amazonlogo;
		
		
		
	}

}
