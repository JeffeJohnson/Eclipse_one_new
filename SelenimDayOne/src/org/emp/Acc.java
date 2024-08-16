package org.emp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Acc {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//div[@title='Courses']"));
		Actions acc = new Actions(driver);
		acc.moveToElement(element).perform();
		
		WebElement java = driver.findElement(By.xpath("//div[@title='Java']"));
		acc.moveToElement(java).perform();
		
		WebElement javaone = driver.findElement(By.xpath("//span[text()='Core Java Certification Training']"));
		acc.moveToElement(javaone).perform();
		javaone.click();
		
		
		
		
	}

}


