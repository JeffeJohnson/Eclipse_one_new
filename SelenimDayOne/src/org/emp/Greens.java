package org.emp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com");
		
		WebElement element = driver.findElement(By.xpath("//u[text()='Greens Technologys Software Training Centers in Chennai']"));
		
		String text = element.getText();
		System.out.println(text);
			
	}

}
