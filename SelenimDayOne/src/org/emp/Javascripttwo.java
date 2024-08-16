package org.emp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascripttwo {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//h1[text()='Selenium Certification Training in Chennai']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		
		WebElement element1 = driver.findElement(By.xpath("//button[text()='View more']"));
		js.executeScript("arguments[0].scrollIntoView(false)", element1);
		
	}

}
