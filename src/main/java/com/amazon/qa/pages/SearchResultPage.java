package com.amazon.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HomePage;

public class SearchResultPage extends TestBase {

	

	public SearchResultPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public static HomePage hp = new HomePage();
	
	

	@FindBy(xpath = "//div[@data-asin='B07NZZ1XZP']//div[@class=\"sg-row\"][2]//h2//a")
	static WebElement Searchtextclick;
	
	
	@FindBy(xpath = "//h1/descendant::span[contains(text(),'Kindle')]")
	static WebElement Searchtext;
	
	
	@FindBy(xpath = "//h1/descendant::span[contains(text(),'laptop')]")
	static WebElement Searchtextlaptop;
	
	
	
	public String verifyresultspagesortbyelement() {

		hp.Search();
		
		String SrchTxt = Searchtext.getText();
		return SrchTxt;

	}
	
	
	public String verifyresultsautosuggestionoption() throws InterruptedException {
		
		
		
		hp.selectautosuggestoption();
		String SrchTxt = Searchtextlaptop.getText();
		return SrchTxt;
		
		
		
		
	}
	
	
	
	
	
	public void firstsearchresultclick() throws InterruptedException {
		
		
		hp.Search();
		Thread.sleep(3000);
		Searchtextclick.click();
		
		
		
	
	}
	

}
