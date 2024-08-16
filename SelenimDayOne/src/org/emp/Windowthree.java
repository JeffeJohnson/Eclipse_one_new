package org.emp;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowthree {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys("oneplus phone",Keys.ENTER);
		
		WebElement element2 = driver.findElement(By.xpath("//span[text()='OnePlus 11R 5G (Sonic Black, 8GB RAM, 128GB Storage)']"));
		element2.click();
		
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
		List<String> each=new ArrayList<>();
		each.addAll(windowHandles);
		
		String childwin = each.get(1);
		driver.switchTo().window(childwin);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement element3 = driver.findElement(By.id("add-to-cart-button"));
		js.executeScript("arguments[0].click()", element3);
		
	}
}
		
		
		
		
		
		
		
		
		
		


