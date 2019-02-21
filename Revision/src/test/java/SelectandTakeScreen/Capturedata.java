package SelectandTakeScreen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Selenium.Revision.Utility;

public class Capturedata {
	
	@Test
	public void facebook() {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("Vikash");
		
		Utility.capture(driver,"Facebook");
		
		driver.close();
	}

}
