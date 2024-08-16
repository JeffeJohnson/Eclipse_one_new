package org.emp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Aaleert {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		
		WebElement simple = driver.findElement(By.xpath("//a[text()='Alert with OK ']"));
		simple.click();
		WebElement nxtsimple = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		nxtsimple.click();
		
		Thread.sleep(3000);
		Alert al= driver.switchTo().alert();
		al.accept();
	}
	

}
