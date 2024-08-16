package org.emp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrialOne {
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		
		WebElement from =driver.findElement(By.xpath(("(//input[@class='autocomplete required keyValue span span24 ui-autocomplete-input selflabel'])[1]")));
		from.sendKeys("thoothukudi");
		
		WebElement to =driver.findElement(By.xpath(("(//input[@class='autocomplete required keyValue span span24 ui-autocomplete-input selflabel'])[2]")));
		to.sendKeys("chennai");
		
		
	}

}
