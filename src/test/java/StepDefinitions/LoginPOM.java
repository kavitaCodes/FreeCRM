package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.HomePagePOM;
import POM.LoginPagePOM;
import io.cucumber.java.en.*;

public class LoginPOM {


	 WebDriver driver;
	 LoginPagePOM login;
	 HomePagePOM home;
	 
	@Given("The browser is open")
		public void the_browser_is_open() {
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\gunja\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		    driver= new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		    driver.manage().window().maximize();
		   
		   	}
	
		@And("The user is on login page")
		public void the_user_is_on_login_page() {
		    driver.get("https://ui.freecrm.com/");
		    String title=driver.getTitle();
		    System.out.println("Title of Login page is " +title);
		    
		}
	
		
		
		@Then("^The user enters \"(.*)\" and \"(.*)\" and clicks on login button$")
		public void the_user_enters_email_and_password_and_clicks_on_login_button(String email,String password) {
			login=new LoginPagePOM(driver);
			login.userLogins(email, password);
		    
		}
		
	
	
		@Then("The user is navigated to home page") 
			public void the_user_is_navigated_to_home_page (){
			home=new HomePagePOM(driver);
			home.homepage();
				
			}
		}
	


