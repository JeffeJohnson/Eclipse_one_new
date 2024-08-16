package org.emp;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facecopy {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement userelement = driver.findElement(By.xpath("//input[@type='text']"));
		userelement.sendKeys("jeffe");
		
		Actions acc = new Actions(driver);

		acc.keyDown(userelement,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		acc.keyDown(userelement,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		
		WebElement passelement = driver.findElement(By.xpath("//input[@type='password']"));

		acc.keyDown(passelement, Keys.TAB).perform();
		
		acc.keyDown(passelement,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		
		
	}

}
