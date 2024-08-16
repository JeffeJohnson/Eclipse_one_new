package org.mav;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Employee extends Samplesix {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(excelRead("Sheet1",2,) );
		driver.findElement(By.id("password")).sendKeys(excelRead("Sheet1",2,1) );
		driver.findElement(By.id("login")).click();
		
	}

}
