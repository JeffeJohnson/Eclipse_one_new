package org.emp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class User {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.facebook.com/ ");
		
		WebElement element = driver.findElement(By.xpath("//input[@autofocus='1']"));
		element.sendKeys("jeffe23@gmail");
		
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
		

		WebElement elementone= driver.findElement(By.name("pass"));
		elementone.sendKeys("password");
		
		String attribute2 = elementone.getAttribute("value");
		System.out.println(attribute2 );
	}
	

}
