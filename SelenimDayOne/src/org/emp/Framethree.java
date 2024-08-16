package org.emp;

import java.util.List;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//to get all values in dropdown 
public class Framethree {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window();
		
		WebElement element = driver.findElement(By.xpath("//a[text()='Create new account']"));
		element.click();
		Thread.sleep(3000);
		
	
		WebElement drpYear = driver.findElement(By.id("year"));
		Select s = new Select(drpYear);
		List<WebElement> options = s.getOptions();
		for(WebElement all:options) {
			System.out.println(all.getAttribute("value"));
		}
		

		
		
	}

}
