package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;


public class LoginPage extends TestBase {
	
	
	public LoginPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//input[@id='ap_email']")
	static WebElement stringusername;
	
	@FindBy(xpath = "//input[@id='ap_password']")
	static WebElement stringpassword;
	
	@FindBy(xpath = "//input[@id='signInSubmit']")
	static WebElement Submit;
	
	@FindBy(xpath = "//a[@data-nav-role = 'signin']/span[@class='nav-line-1']")
	static WebElement Signedin;
	
	

public void login(String Username, String Password ) throws InterruptedException {
	

	
	stringusername.sendKeys(String.valueOf(Username));
	Thread.sleep(1000);
	stringpassword.sendKeys(String.valueOf(Password));
	Thread.sleep(2000);
	Submit.click();
	
	}


public Boolean signedintext() {
	
	
	String signedintxt = Signedin.getText();
	
	if(signedintxt.contains("Hello"))
	{
		
		return true;
		
		
	}
	
	else 
		
		return false;
	
	
}


	
}
