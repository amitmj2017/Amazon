package com.amazon.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		File file = new File("C:\\Users\\amit.mahajan\\Desktop\\excelpracticesheet.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet ws = wb.getSheetAt(0);
		int rowcount = ws.getLastRowNum();
		rowcount = rowcount + 1;
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\src\\main\\java\\com\\amazon\\qa\\data\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		for (int i=1; i<rowcount;i++ )
			
		{	
			int j=0;
			driver.get("https://www.amazon.com/ap/signin?_encoding=UTF8&ignoreAuthState=1&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_custrec_signin&switch_account=");
			DataFormatter D = new DataFormatter();
			XSSFCell a= ws.getRow(i).getCell(j);
			String username= D.formatCellValue(a);
			driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(username);
			for ( j=1; j<2;j++)	{
			
	
			XSSFCell b= ws.getRow(i).getCell(j);
			String Password= D.formatCellValue(b);
			
	     	
		    driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(Password);
			
		}
		driver.findElement(By.xpath("//input[@id='signInSubmit']"));	
		driver.navigate().refresh();
		}
	}
}