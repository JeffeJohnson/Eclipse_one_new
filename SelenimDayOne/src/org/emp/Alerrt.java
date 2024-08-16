package org.emp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerrt {
	public static void main(String[] args) throws InterruptedException  {
		//doubt
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		WebElement confirmalr = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		confirmalr.click();
		
		WebElement btnconfirm = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		btnconfirm.click();
		
		
		Thread.sleep(3000);
		Alert al= driver.switchTo().alert();
		al.accept();

}}