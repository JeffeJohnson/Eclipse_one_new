package org.emp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("gadgets",Keys.ENTER);
		
		WebElement element2 = driver.findElement(By.xpath("(//a[@class='wjcEIp'])[1]"));
		element2.click();
		
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
		for (String eachwin : windowHandles) {
			if(!windowHandle.equals(eachwin)) {
				driver.switchTo().window(eachwin);
			}
		}
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement element4 = driver.findElement(By.xpath("//div[@class='pu8Q93']"));
		js.executeScript("arguments[0].scrollIntoView(true)", element4);
		WebElement element5 = driver.findElement(By.xpath("//div[@class='WtiB86']"));
		js.executeScript("arguments[0].scrollIntoView(false)", element5);
		WebElement element3 = driver.findElement(By.xpath("//button[text()='Add to cart']"));
		js.executeScript("arguments[0].click()", element3);
		
		
		
	}

}
