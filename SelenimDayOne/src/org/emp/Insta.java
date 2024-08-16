package org.emp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//input[@type='text']"));
		element.sendKeys("jeffe@23");
		

		
		WebElement element1 = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		element1.sendKeys("pass");
		
		
		
		
	}

}
