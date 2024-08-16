package org.emp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Emp {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get( "https://www.redbus.in/");
		
		WebElement fromtxt= driver.findElement(By.id("src"));
		fromtxt.sendKeys("Thoothukudi");
		
		WebElement totxt = driver.findElement(By.id("dest"));
		totxt.sendKeys("Chennai");
	}

}
