package org.emp;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("(//div[@class='YBLJE4'])[6]"));
		element.click();
		
		
		
		
		
//	
//		
		WebElement elementone = driver.findElement(By.xpath("(//span[@class='TSD49J'])[2]"));
		Actions acc = new Actions(driver);
		acc.moveToElement(elementone).perform();
		
		
}
}