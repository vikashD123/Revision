package SelectandTakeScreen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicDropDown {

	WebDriver driver;
	
	@Test
	public void dynamic() {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		driver.findElement(By.id("menu1")).click();
		
		List<WebElement> el=driver.findElements(By.xpath("//ul[contains(@class,'dropdown-menu')]//a"));
		
		int count =el.size();
		
		System.out.println(count);
		
		for(int i=0;i<count;i++) {
		
			WebElement element=el.get(i);
			
			String text=element.getText();
			
			System.out.println(text);
			
			if(text.equalsIgnoreCase("javascript")) {
				
				element.click();
				
				break;
			}
		}
	}
}
