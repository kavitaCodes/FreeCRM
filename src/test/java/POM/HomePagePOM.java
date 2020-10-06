package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePagePOM {
	
	By link_free=By.linkText("Free account");
	WebDriver driver;
	
	public HomePagePOM (WebDriver driver) {
		this.driver=driver;
	}
	 public void homepage() {
		System.out.println( driver.findElement(link_free).isDisplayed());
	 }
	

}
