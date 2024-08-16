package org.emp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement element = driver.findElement(By.xpath("//input[@type='text']"));
		js.executeScript("arguments[0].setAttribute('value','greens')", element);
		
		WebElement element2 = driver.findElement(By.xpath("//input[@type='password']"));
		js.executeScript("arguments[0].setAttribute('value','pass')", element2);
		
		WebElement element3 = driver.findElement(By.xpath("//button[@type='submit']"));
		js.executeScript("arguments[0].click()",element3);
		
	}

}
