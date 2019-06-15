package com.amazon.qa.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.amazon.qa.base.TestBase;

public class screenshot extends TestBase {

	
	
	public void takescreenshot() throws IOException {
		
		
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
           FileUtils.copyFile(scrFile, new File("C:\\Users\\amit.mahajan\\java\\Amazon\\Screenshot\\screenshot.png"));
		
	
		
	}
	}