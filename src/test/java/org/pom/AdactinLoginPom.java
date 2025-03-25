package org.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class AdactinLoginPom  extends BaseClass{

//page factory	
//	
////	constructor 
//	public AdactinLoginPom() {
//		PageFactory.initElements(driver, this);
//	}
//	
////webelement 
//	@FindBy(xpath="//input[@id='username']")
//	private WebElement username;
//	
//	@FindBy(xpath = "//input[@id='password']")
//	private WebElement password;
//	
//
//	@FindBy(xpath = "//input[@id='login']")
//	private WebElement  login;
//
////methods
//	
//	public WebElement  getUsername() {
//		return username;
//	}
//	
////	getusername() //username   send
//	
//	public void  setUsername( String username) {
//		this.username.sendKeys(username);
//	}
//	
//	//setUsername(selenium)
//	
//	public WebElement  getPassword() {
//		return password;
//	}
//	
//	
//	public void  setPassword( String password) {
//		this.password.sendKeys(password);
//	}
//	
//	
//	public WebElement  getLogin() {
//		return login;
//	}

	
//	by locators
	
//	constructor
	WebDriver driver;
	public AdactinLoginPom(WebDriver driver) {
		this.driver=driver;
	}
	
	private By username=By.xpath("//input[@id='username']");
	
	private By password=By.xpath("//input[@id='password']");
	
	private By login=By.xpath("//input[@id='login']");
	
	
	public void  setUsername( String username) {
	driver.findElement(this.username).sendKeys(username);
}

//setUsername(selenium)
public WebElement  getPassword() {
	return driver.findElement(password);
}


public void  setPassword( String password) {
	driver.findElement(this.password).sendKeys(password);
}


public WebElement  getLogin() {
	return driver.findElement(login);
}

	
}
