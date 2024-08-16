package org.emp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Agecalc {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.calculator.net/age-calculator.html");
		driver.manage().window().maximize();
		WebElement drpmon = driver.findElement(By.id("today_Month_ID"));
		
		Select s=new Select(drpmon);
		s.selectByIndex(4);
		
		WebElement drpday = driver.findElement(By.id("today_Day_ID"));
		Select s1=new Select(drpday);
		s1.selectByVisibleText("25");
		
		WebElement yr = driver.findElement(By.xpath("//input[@class='calendarDateInput']"));
		Actions acc = new Actions(driver);
		acc.doubleClick(yr).perform();
		yr.sendKeys("1998");
		
		WebElement cal = driver.findElement(By.xpath("//input[@type='submit']"));
		cal.click();
	}

}
