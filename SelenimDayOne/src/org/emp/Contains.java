package org.emp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains {
public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get(" http://www.greenstechnologys.com");
		
		WebElement element = driver.findElement(By.xpath("//p[contains(text(),'is a leading Training ')]"));
		
		String text = element.getText();
		System.out.println(text);

}
}
