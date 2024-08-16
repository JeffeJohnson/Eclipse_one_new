package org.emp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sellect {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("cars"));
		Select s = new Select(element);
		s.selectByValue("volvo");
		s.selectByIndex(1);
		s.selectByVisibleText("Audi");
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		
		for (WebElement output : allSelectedOptions) {
			System.out.println(output.getText());
		}
		s.deselectByIndex(1);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println( firstSelectedOption.getText());
}
}