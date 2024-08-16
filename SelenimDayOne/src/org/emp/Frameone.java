package org.emp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameone {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		//driver to frame using id or name
//		driver.switchTo().frame("a077aa5e");
//		WebElement element = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
//		element.click();
		
		//by web element
//		WebElement frame = driver.findElement(By.xpath("//iframe[@src='ads.html']"));
//		driver.switchTo().frame(frame);
//		WebElement element = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
//		element.click();

		//to find the count of iframes by findElementss..
//		List<WebElement> elements = driver.findElements(By.tagName("iframe"));
//		System.out.println(elements);
//		int count = elements.size();
//		System.out.println(count);
		
		//by using index
		driver.switchTo().frame(4);
		WebElement element = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		element.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
