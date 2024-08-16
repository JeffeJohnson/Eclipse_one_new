package org.emp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserOne {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		
		WebElement element = driver.findElement(By.name("username"));
		element.sendKeys("jeffejohnson");
		
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
		
		WebElement elementone = driver.findElement(By.xpath("//input[@type='password']"));
		elementone.sendKeys("password");
		
		String attribute2 = elementone.getAttribute("value");
		System.out.println(attribute2);
		
		
	}

}
