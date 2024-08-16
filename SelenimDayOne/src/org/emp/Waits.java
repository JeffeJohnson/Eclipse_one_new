package org.emp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebElement table = driver.findElement(By.xpath("//table[@class='ws-table-all']"));
		
		//explicit wait
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(50));
		WebElement element = w.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		element.sendKeys("greens");
		
		//fluentwait
//		Wait w=new FluentWait(driver).withTimeout(Duration.ofSeconds(100))
//				.pollingEvery(Duration.ofSeconds(5))
//				.ignoring(Throwable.class);
//		Object obj= w.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
//		//downcasting
//		WebElement ele=(WebElement)obj;
//		ele.sendKeys("helo");
		
	}

}
