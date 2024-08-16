package org.emp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allert {
	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		WebElement promptele = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		promptele.click();
		
		WebElement btnpromptele = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		btnpromptele.click();
		
		Alert al = driver.switchTo().alert();
		String text = al.getText();
		System.out.println(text);
		
		Thread.sleep(3000);
		al.sendKeys("greens");
		al.accept();
		
	}

}
