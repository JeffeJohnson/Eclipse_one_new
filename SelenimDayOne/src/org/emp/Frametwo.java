package org.emp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frametwo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window();
		
		WebElement element = driver.findElement(By.xpath("//a[text()='Create new account']"));
		element.click();
		Thread.sleep(3000);
		
		WebElement drpDay = driver.findElement(By.id("day"));
		Select s=new Select(drpDay);
		s.selectByVisibleText("15");
		
		
		WebElement drpMonth = driver.findElement(By.xpath("//select[@title='Month']"));
		Select s1=new Select(drpMonth);
		s1.selectByValue("8");
		
		WebElement drpYear = driver.findElement(By.id("year"));
		Select s2=new Select(drpYear);
		s2.selectByIndex(4);
		
	}

}
