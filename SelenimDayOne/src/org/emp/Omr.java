package org.emp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Omr {
public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get(" http://greenstech.in/selenium-course-content.html");
		
		WebElement element = driver.findElement(By.xpath("(//p[@class='mail-info'])[3]"));
		
		String text = element.getText();
		System.out.println(text);

}
}