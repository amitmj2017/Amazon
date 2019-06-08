package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import com.amazon.qa.base.TestBase;

/**
 * @author amit.mahajan
 *
 */
public class HomePage extends TestBase {
	
	
	public HomePage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	
	//***********************Page Factory ----OR(Object repo)*******************************************
	
	@FindBy(xpath="//div[@id ='nav-logo']/a[1]") 
	static WebElement Logo;
	
	
	@FindBy(xpath="//select[@id='searchDropdownBox']")
	static WebElement SearchDropdown;
	
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	static WebElement Searchtextbox;
	
	@FindBy(xpath="//input[@ value = 'Go']")
	static WebElement ClickSearch;
	
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	static WebElement SigninMousehover;
	
	
	@FindBy(xpath="//*[@id=\"nav-flyout-ya-signin\"]/a/span")
	static WebElement SigninClick;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//******************************************** Page Methods***************************************
	public boolean VerifyHomePageLogo() {
		
		
		boolean amazonlogo = Logo.isDisplayed();
		
		return amazonlogo;
		
		
	}
	
	
	
	public void Search() {
		
		
		Searchtextbox.sendKeys("Kindle");
		ClickSearch.click();
			
	}
	
	

	public static String Selectcategory() throws InterruptedException {
		
		
		Select Category = new Select(SearchDropdown);
		Category.selectByVisibleText("Kindle Store");
		Thread.sleep(2000);
		String CatVal = Category.getFirstSelectedOption().getText();
		return CatVal;
		
	}
	
	
	
	public static void SignInClick() throws InterruptedException {
		
		
		Actions action = new Actions(driver);
		action.moveToElement(SigninMousehover).build().perform();
		Thread.sleep(3000);
		SigninClick.click();
		
		
	}
	
	
	
		
		
		
		
		
	
	

}
