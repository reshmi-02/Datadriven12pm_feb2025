package org.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitTest {
	static WebDriver driver ;
	

	
	@BeforeClass
	public  static void beforeClass() {
		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
//		System.out.println("Before class");
	}
	
	
	@AfterClass
	public static void afterClass() {
		
		driver.close();
		
//		System.out.println("After class");
	}
	
	@Before
	public void before() {
		driver.navigate().refresh();
//		System.out.println("Before");
	}
	
	@After
	public void after() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		driver.navigate().back();
//		System.out.println("After");
	}
	
	
	
	@Test
	public void test2() {
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("oranium");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
//		System.out.println("Test 2");
	}
	
	@Test
	public void test1() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("priya");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	
}
