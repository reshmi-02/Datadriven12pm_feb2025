package org.test;

import org.openqa.selenium.WebElement;
import org.pom.AdactinLoginPom;
import org.utility.BaseClass;

public class AdactinTest   extends BaseClass{

	public static void main(String[] args) {
		
//		login
		AdactinTest.browserLaunch("chrome");
		AdactinTest.getUrl("https://adactinhotelapp.com/index.php");
		
		
//		AdactinLoginPom obj = new AdactinLoginPom();
//		WebElement username = obj.getUsername();
//		username.sendKeys("reshmi1234");
		
		
//		WebElement password = obj.getPassword();
//		password.sendKeys("Oranium");
		
//		obj.setUsername("reshmi1234");
//		obj.setPassword("Oranium");
//		
//		WebElement login = obj.getLogin();
//		login.click();
		
		
//		search hotel 
		
//		By locator
		AdactinLoginPom obj = new AdactinLoginPom(driver);
		
		obj.setUsername("reshmi1234");
		obj.setPassword("Oranium");
		obj.getLogin().click();
		
	}
	
}
