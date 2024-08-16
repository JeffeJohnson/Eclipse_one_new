package org.name;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
public class Demothree {
	
	static WebDriver driver;
	@BeforeClass	
	
	public static void beforeClass() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	@AfterClass
	public static void afterClass() {
		driver.quit();
	}
	
	@Before
	public void before() {
		long timeMillis = System.currentTimeMillis();
		System.out.println(timeMillis);

	}
	@After
	public void after() {
		long timeMillis = System.currentTimeMillis();
		System.out.println(timeMillis);

	}
	@Test
	public void test1() {
		driver.findElement(By.id("email")).sendKeys("Welcome");
		driver.findElement(By.id("pass")).sendKeys("welc@123");
	}
	
}
