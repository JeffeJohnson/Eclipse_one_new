package org.emp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.xpath("//table[@class='ws-table-all']"));
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for (WebElement each : rows) {
			List<WebElement> heading = each.findElements(By.tagName("th"));
			for (WebElement headeach : heading) {
				String text = headeach.getText();
				System.out.println(text);
			}
		}
		
		
	}

}
