package org.emp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowfour {
	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=877048246502441702&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9148642&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone x");
		
		WebElement searchclick = driver.findElement(By.id("nav-search-submit-text"));
		searchclick.click();
		WebElement element = driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Starlight']"));
		element.click();
		
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
		List<String> each =new ArrayList<String>();
		each.addAll(windowHandles);
		
		String childwin = each.get(1);
		driver.switchTo().window(childwin);
		
		Actions acc=new Actions(driver);
		WebElement element2 = driver.findElement(By.id("productTitle"));
		acc.contextClick(element2).perform();
		
		Robot r =new Robot();
		for(int i=1;i<=2;i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
}
}