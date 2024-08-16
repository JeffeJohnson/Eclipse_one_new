package org.emp;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtableone {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.xpath("//table[@class='ws-table-all']"));
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for (int i = 2; i < rows.size(); i++) {
			WebElement each = rows.get(i);
			String text = each.getText();
			System.out.println(text);
		}
		
		
	}

}
