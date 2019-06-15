package com.amazon.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
	
	
	public static Actions action = new Actions(driver);
	
	
	
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
	
	@FindBy(xpath="//div[@id='nav-xshop']/a[1]")
	static WebElement Todaysdeallink;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
		
		
		//Actions action = new Actions(driver);
		action.moveToElement(SigninMousehover).build().perform();
		Thread.sleep(3000);
		SigninClick.click();
		
		
	}
	
	
	
	
public void switchtotab() throws AWTException, InterruptedException {
		
		
		
		//this will open a new tab and then open a link there..switch to the new tab...perform
//	some action and 
//will close the tab and then wil lswitch back to the original tab and performa some action
	
//	Set<String> handlesSet = driver.getWindowHandles();
 //   List<String> handlesList = new ArrayList<String>(handlesSet);
	//action.contextClick(Todaysdeallink).build().perform();
	//Thread.sleep(1000);
	//action.sendKeys(Keys.ARROW_DOWN).build().perform();
	//Thread.sleep(1000);
	//action.sendKeys(Keys.ENTER).build().perform();
	//Robot robot = new Robot();
	//robot.keyPress(KeyEvent.VK_DOWN);
	//Thread.sleep(1000);
	//robot.keyPress(KeyEvent.VK_ENTER);
//	driver.switchTo().window(handlesList.get(1));
  //  Todaysdeallink.click();
    //driver.close();
    //driver.switchTo().window(handlesList.get(0));
	//Todaysdeallink.click();
	
	
	Todaysdeallink.sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
	
	//Set<String> handlesSet = driver.getWindowHandles();
	   ArrayList<String> handlesList = new ArrayList<String>(driver.getWindowHandles());
	   driver.switchTo().window(handlesList.get(1));
	   Todaysdeallink.click();
	   driver.close();
	   
	   
	    driver.switchTo().window(handlesList.get(0));
		Todaysdeallink.click();
	
}



public void selectautosuggestoption() throws InterruptedException {
	
	
	
	Searchtextbox.sendKeys("lap");
	Thread.sleep(1000);
	Searchtextbox.sendKeys(Keys.ARROW_DOWN);
	Searchtextbox.sendKeys(Keys.ENTER);
		
}
	
	
	public static void findbrokenlinks() {
		
		
		 

	    
	    	
	        String url ;
	        HttpURLConnection huc = null;
	        int respCode = 200;
	        List<WebElement> link = driver.findElements(By.tagName("a"));
	        System.out.println("Total no. of links are "
					+ link.size());
	       
	        Iterator<WebElement> it = link.iterator();
	        
	        while(it.hasNext()){
	            
	            url = it.next().getAttribute("href");
	            
	            System.out.println(url);
	        
	            if(url == null || url.isEmpty()){
	                System.out.println("URL is either not configured for anchor tag or it is empty");
	                continue;
	            }
	            
	            
	            
	            
	            try {
	                huc = (HttpURLConnection)(new URL(url).openConnection());
	                
	                huc.setRequestMethod("HEAD");
	                
	                huc.connect();
	                
	                respCode = huc.getResponseCode();
	                
	                if(respCode >= 400){
	                    System.out.println(url+" is a broken link");
	                }
	                else{
	                    System.out.println(url+" is a valid link");
	                }
	                    
	            } catch (MalformedURLException e) {
	                e.printStackTrace();
	            } catch (IOException e) {
	   
	                e.printStackTrace();
	            }
	        }
	}
}
	        
	        
	        


