package org.emp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Framefive {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window();
		
		WebElement element = driver.findElement(By.xpath("//a[text()='Create new account']"));
		element.click();
		Thread.sleep(3000);
		
		WebElement element2 = driver.findElement(By.xpath("//select[@title='Day']"));
		Select s= new Select(element2);
		List<WebElement> options = s.getOptions();
		
		int size = options.size();
		System.out.println("length="+size);
		
				
		for(WebElement all:options) {
			String dayText=all.getText();
			int day=Integer.parseInt(dayText);
			if(day%2==0) {
				System.out.println(dayText);
			}
		}
	}
}


