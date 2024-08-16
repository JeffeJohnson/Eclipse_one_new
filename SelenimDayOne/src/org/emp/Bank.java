package org.emp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Bank {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.instagram.com/accounts/login/?hl=en) login page ");
		
		WebElement element = driver.findElement(By.name("username"));
		element.sendKeys("uniquee_le_blessed");
		
	
		WebElement passelement = driver.findElement(By.name("password"));
		passelement.sendKeys("926476636");
		
		
		
	}

}
