package radiocheck;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleCheckBox {

	
	@Test
	public void verifyCheckbox() {
		
System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		
		List<WebElement> el=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		int count=el.size();
		
		System.out.println(count);
		
		for(int i=0;i<count; i++) {
			
			WebElement check=el.get(i);
			
			String text=check.getAttribute("id");
			
			System.out.println(text);
			
			if(text.equalsIgnoreCase("code")) {
				
				check.click();
				
				break;
			}
			
	
		}
	}
}
