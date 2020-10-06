package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPagePOM {
	
	By txt_email =By.xpath("//input[@name='email']");
	By txt_password=By.xpath("//input[@name='password']");
	By btn_login = By.xpath("//div[text()='Login']");
			
	 WebDriver driver;
	 
	 public LoginPagePOM(WebDriver driver) {
		this.driver=driver;
	 }
	 
	public void userLogins(String email,String password) {
		driver.findElement(txt_email).sendKeys(email);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
	}

	

}
