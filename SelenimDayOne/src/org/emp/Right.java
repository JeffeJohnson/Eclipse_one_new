package org.emp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right {
	
		public static void main(String[] args) throws InterruptedException, AWTException {
			WebDriver driver= new ChromeDriver();
			driver.get("https://greenstech.in/selenium-course-content.html");
			driver.manage().window().maximize();
			
			WebElement element= driver.findElement(By.id("heading201"));
			element.click();
			WebElement elementone= driver.findElement(By.xpath("//a[text()='Resume Model-4 ']"));
			
			Actions acc=new Actions(driver);
			acc.contextClick(elementone).perform();
			
			Robot r = new Robot();
			for(int i=1;i<=4;i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
	}
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
}
}