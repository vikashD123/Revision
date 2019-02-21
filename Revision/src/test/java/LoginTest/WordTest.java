package LoginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import LoginPage.WordPress;

public class WordTest {

	@Test
 public void test1() {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demosite.center/wordpress/wp-login.php?loggedout");
		
		WordPress login=PageFactory.initElements(driver,WordPress.class);
		
		login.veryUser("demo","admin123");
		
		Assert.assertTrue(driver.getTitle().contains("Dashboard"),"Title didn't matched");
		
		System.out.println("PAge title verified");
		
		
	}
}
