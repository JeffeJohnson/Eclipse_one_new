package org.emp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dandd {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement dragelement = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		
		WebElement dropelement = driver.findElement(By.xpath("//li[@class='placeholder']"));
		
		WebElement dragelementone = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		
		WebElement dropelementone = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		WebElement dragelementtwo = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		
		WebElement dropelementtwo = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		
		WebElement dragelementthree = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		
		WebElement dropelementthree = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		
		
		Actions acc = new Actions(driver);
		acc.dragAndDrop(dragelement, dropelement).perform();
		acc.dragAndDrop(dragelementone, dropelementone).perform();
		acc.dragAndDrop(dragelementtwo, dropelementtwo).perform();
		acc.dragAndDrop(dragelementthree, dropelementthree).perform();
	}

}
