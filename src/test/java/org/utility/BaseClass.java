package org.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static WebDriver driver ;
	static JavascriptExecutor js;
	
	
	public static WebDriver browserLaunch(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			 driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			 driver = new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		
		return driver;
		
	}
	
	
	public static void getUrl(String url) {
		driver.get(url);
	}
	
	
	
	public static String excelReader(String path,String sheetName,int rowNum,int cellNum) throws IOException {
		
       File f = new File(path);
		
		
//		convert file to object 
		FileInputStream stream = new FileInputStream(f);
		
//		get the workbook 
		Workbook wb = new XSSFWorkbook(stream);
		
	
//		get the sheet 
		Sheet sheet = wb.getSheet(sheetName);
	
//		get the row
		Row row = sheet.getRow(rowNum);
		
//		get the cell
		Cell cell = row.getCell(cellNum);
		
//		get the data
		DataFormatter format = new DataFormatter();
		String data = format.formatCellValue(cell);
		
		wb.close();
		
		return  data;
	}
	

public static void elementkeys(WebElement element,String value) {
		
		try {
			element.sendKeys(value);
		}
		catch(Exception e) {
			 js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].setAttribute('value','"+value+"')",element );
		}
			
	}
	
public static void elementClick(WebElement element) {
		
	try {
		element.click();
	}
	catch(Exception e) {
		 js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click()",element );
	}
	}
	
		
	
}
