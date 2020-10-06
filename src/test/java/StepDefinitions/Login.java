package StepDefinitions;

import java.util.concurrent.TimeUnit;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Login {
	
//	
//	 WebDriver driver;
//	@Given("The browser is open")
//	public void the_browser_is_open() {
//	    System.setProperty("webdriver.chrome.driver","C:\\Users\\gunja\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
//	    driver= new ChromeDriver();
//	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//	    driver.manage().window().maximize();
//	   
//	   	}
//
//	@And("The user is on login page")
//	public void the_user_is_on_login_page() {
//	    driver.get("https://ui.freecrm.com/");
//	    String title=driver.getTitle();
//	    System.out.println("Title of Login page is " +title);
//	    
//	}
//
//	
//	//====================for a single input =======================
////	@Then("^The user enters \"(.*)\" and \"(.*)\"$")
////	public void the_user_enters_email_and_password(String email,String password) {
////		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
////		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
////	    
////	}
////	
////
////
////	@And("The user clicks on login button")
////	public void the_user_clicks_on_login_button() {
////		driver.findElement(By.xpath("//div[text()='Login']")).click();
////	    
////} //// ================================================================================
//	
//	
//	@Then ("^The user enters (.*) and (.*) and clicks on login button$")
//	 public void  the_user_enters_email_and_password_and_clicks_on_login_button (String email ,String password) {
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
//	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
//	driver.findElement(By.xpath("//div[text()='Login']")).click();
//		
//	}
//	
//	
//	
//	
//	@Then("The user is navigated to home page")
//	public void the_user_is_navigated_to_home_page() {
////		String title=driver.getTitle();
////		Assert.assertEquals(title, "Cogmento CRM");
////		System.out.println("Title of Home Page is "+title);
//		
//		//System.out.println("Free Account is displayed "+driver.findElement(By.linkText("Free account")).isDisplayed());
//		boolean link=driver.findElement(By.linkText("Free account")).isDisplayed();
//		Assert.assertEquals(true, link);
//		driver.close();
//	}




}
