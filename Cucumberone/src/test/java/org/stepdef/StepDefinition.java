package org.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	WebDriver driver;
	@Given("user launch the facebook web application.")
	public void user_launch_the_facebook_web_application() {
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	   
	}

	@When("user enter invalid username and password.")
	public void user_enter_invalid_username_and_password() {
	    driver.findElement(By.id("email")).sendKeys("jeffe@gmail.com");
	    driver.findElement(By.id("pass")).sendKeys("Hello@123");
	}

	@When("user click the login button.")
	public void user_click_the_login_button()  {
		
		driver.findElement(By.name("login")).click();
	    
	}

	@Then("verify whether error message is displayed.")
	public void verify_whether_error_message_is_displayed() throws InterruptedException {
		Thread.sleep(3000);
	   WebElement element = driver.findElement(By.xpath("(//h2[text()='Use your Google account'])[2]"));
	   String text = element.getText();
	   boolean contains = text.contains("Google account");
	   System.out.println(contains);
	   
	}
	@Then("verify whether error message with password wrong is displayed.")
	public void verify_whether_error_message_with_password_wrong_is_displayed() {
	    WebElement eleone = driver.findElement(By.xpath("//span[@class='_akzt']"));
	    String textone = eleone.getText();
	    boolean one = textone.contains("The password");
	    System.out.println(one);
	}
	
	@When("user enter invalid {string} and {string}.")
	public void user_enter_invalid_and(String string, String string2) {
		driver.findElement(By.id("email")).sendKeys(string);
	    driver.findElement(By.id("pass")).sendKeys(string2);
	}



}	
	