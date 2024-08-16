package org.emp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windamazon {
	public static void main(String[] args) throws InterruptedException {
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
		
		
		for (String each : windowHandles) {
			if(!windowHandle.equals(each)) {
				driver.switchTo().window(each);
				String currentUrl = driver.getCurrentUrl();
				System.out.println(currentUrl);
			}
		}
		
		WebElement element3 = driver.findElement(By.xpath("(//span[@class='a-list-item'])[1]"));
	    String text = element3.getText();
	    System.out.println(text);
}
}
