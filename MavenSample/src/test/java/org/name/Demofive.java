package org.name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demofive {
	@Parameters({"username","password"})
	@Test
		public void tc1(String s1,String s2) {
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("email")).sendKeys(s1);;
			driver.findElement(By.id("pass")).sendKeys(s2);
		}
	}


