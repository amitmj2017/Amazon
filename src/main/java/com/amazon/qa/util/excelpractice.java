package com.amazon.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.amazon.qa.base.TestBase;

public class excelpractice extends TestBase {

	
		
		public String excelcellvalue() throws IOException {
			
			
		
		String data= null;
		File file = new File("C:\\Users\\amit.mahajan\\Desktop\\excelpracticesheet.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet ws = wb.getSheetAt(0);
		int rowcount = ws.getLastRowNum();
		rowcount = rowcount + 1;
		
		for (int i=1; i<rowcount;i++ )
			
		{	
			
			
		for ( int j=0; j<=1;j++)
			
		{
			DataFormatter D = new DataFormatter();
			XSSFCell a= ws.getRow(i).getCell(j);
			data= D.formatCellValue(a);	
			
		}
		
		}
		return data;
		
		
		}
		
		
		
		
	

}
