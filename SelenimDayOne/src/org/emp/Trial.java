package org.emp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial {
	
	public static void main(String[] args) {
		
	
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement userelement = driver.findElement(By.xpath("//input[@type='text']"));
		userelement.sendKeys("jeffe23@gmail.com");
		
		WebElement passelement = driver.findElement(By.xpath("//input[@type='password']"));
		passelement.sendKeys("12345");
		
		WebElement createlement = driver.findElement(By.xpath("(//a[@role='button'])[3]"));
		createlement.click();
		
		
	
	
	
	
	
	}
	

}
