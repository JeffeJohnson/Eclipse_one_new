package org.emp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptone {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement element = driver.findElement(By.xpath("//input[@type='text']"));
		js.executeScript("arguments[0].setAttribute('value','greens23')", element);
		Object obj=js.executeScript("return arguments[0].getAttribute('value')", element);
		String user=(String)obj;
		System.out.println(user);
		
		WebElement element2 = driver.findElement(By.xpath("//input[@type='password']"));
		js.executeScript("arguments[0].setAttribute('value','pass')",element2 );
		Object obj2=js.executeScript("return arguments[0].getAttribute('value')", element2);
		String pass=(String)obj2;
		System.out.println(pass);
	}

}
