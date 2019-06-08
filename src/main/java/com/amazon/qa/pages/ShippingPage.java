package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class ShippingPage extends TestBase {
	
	
	public ShippingPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	

	
	@FindBy(xpath = "//div[@class= 'ship-to-this-address a-button a-button-primary a-button-span12 a-spacing-medium  ']//span[@class='a-button-inner']/a")
	static WebElement addressbutton;
	
	@FindBy(xpath="//input[@name='delete.1']")
	static WebElement deleteitem;
	
	@FindBy(xpath="//div[@class='sc-empty-cart sc-java-remote-feature']")
	static WebElement emptycarttext;
	
	public Boolean clickaddressandemptycart() {
		
		
		addressbutton.click();
		deleteitem.click();
		String text =  emptycarttext.getText();
		
		
		if(text.contains("empty"))
		{
			
			return true;
			
			
		}
		
		else 
			
			return false;
		
		
		
	}
	
}
