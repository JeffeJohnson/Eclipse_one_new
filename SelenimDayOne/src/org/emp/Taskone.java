package org.emp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Taskone {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//div[text()='Courses ']"));
		Actions acc = new Actions(driver);
		acc.moveToElement(element).perform();
		
		WebElement elementone = driver.findElement(By.xpath("//span[text()='Oracle (48)']"));
		acc.moveToElement(elementone).perform();
		
		WebElement elementtwo= driver.findElement(By.xpath("//span[text()='Oracle SQL and PLSQL Placement Certification Training']"));
		elementtwo.click();
	}

}
