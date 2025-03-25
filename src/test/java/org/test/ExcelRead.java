package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		
//		1.path of the excel sheet
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\DtaDriven_12pm_Feb11\\ExcelSheet\\testData.xlsx");
		
		
//		convert file to object 
		FileInputStream stream = new FileInputStream(f);
		
//		get the workbook 
		Workbook wb = new XSSFWorkbook(stream);
		
	
//		get the sheet 
		Sheet sheet = wb.getSheet("data");
		
		for(int i=1;i<sheet.getPhysicalNumberOfRows();i++) {   //i=2   2<3
			Row row = sheet.getRow(i);     //(2)
			
			for(int j =0;j<row.getPhysicalNumberOfCells();j++) {    //j=0  0<2
				
				Cell cell = row.getCell(j);   //(0)    
				
				
				DataFormatter formatter = new DataFormatter();
				String formatCellValue = formatter.formatCellValue(cell);  //data
				System.out.println(formatCellValue);
				
				if(j==0) {      
					username.sendKeys(formatCellValue);
				}
				else if(j==1) {
					password.sendKeys(formatCellValue);
				}
//				username(data) 1
//				password   2
				
//				String stringCellValue = cell.getStringCellValue();   //data  
//				System.out.println(stringCellValue);
			}
			
			username.clear();
			password.clear();
			
		}
		
		wb.close();
		
//		get the row
//		Row row = sheet.getRow(1);
		
//		get the cell
//		Cell cell = row.getCell(0);
		
//		get the data
//		String stringCellValue = cell.getStringCellValue();
		
		
//		System.out.println(stringCellValue);
		
//	close the workbook	
//		wb.close();
		
		
		
		
	}
	
}
