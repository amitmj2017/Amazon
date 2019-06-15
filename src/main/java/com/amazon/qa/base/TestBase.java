package com.amazon.qa.base;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBase {
	
	
	
	public static WebDriver driver;
	public static Properties prop;
	public static Logger log = Logger.getLogger(TestBase.class);
	
	public TestBase() {
		
		
		
			
			try {
				prop= new Properties();
				FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\com\\amazon\\qa\\config\\config.properties");
				prop.load(ip);
				
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	
	public static void initialization() {
		
		
		String BrowserName = prop.getProperty("browser");
		
		
		DesiredCapabilities ch =  DesiredCapabilities.chrome();
		
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		ChromeOptions c= new ChromeOptions();
		c.merge(ch);
		
		
		
		
		
		if (BrowserName.equals("chrome")) {
			
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\src\\main\\java\\com\\amazon\\qa\\data\\chromedriver.exe");
			driver = new ChromeDriver(c);
			// ChromeOptions options = new ChromeOptions();
             //options.addArguments("--disable-impl-side-painting"); //To fix no such session exception when problem which appears when running tests for a prolonged period : https://github.com/Chatie/wechaty/issues/756
             //driver = new ChromeDriver(options);
			
		}
		
		else {
			
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "\\src\\main\\java\\com\\amazon\\qa\\data\\geckodriver.exe");
			driver = new FirefoxDriver();
					
		}
		
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
		
	}
	
	
	
	

}
