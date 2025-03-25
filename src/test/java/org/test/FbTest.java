package org.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pom.AdactinLoginPom;
import org.utility.BaseClass;

public class FbTest  extends BaseClass{

	public static void main(String[] args) throws IOException {
		
	
		
		
//		FBLOGIN
		String username = FbTest.excelReader("C:\\Users\\Admin\\eclipse-workspace\\DtaDriven_12pm_Feb11\\ExcelSheet\\testData.xlsx","data" , 1, 0);
		String password = FbTest.excelReader("C:\\Users\\Admin\\eclipse-workspace\\DtaDriven_12pm_Feb11\\ExcelSheet\\testData.xlsx","data" , 1, 1);
	
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
	}
}
