package radiocheck;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleRadioButton {

	
	@Test
	public void verifyRadio() {
		
System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		
		List<WebElement>radio=driver.findElements(By.xpath("//*[@type='radio' and @name='lang']"));
		
		int count=radio.size();
		
		System.out.println(count);
		
		for(int i=0;i<count;i++) {
			
			WebElement el=radio.get(i);
			
			String text=el.getAttribute("value");
			
			System.out.println(text);
			
			if(text.equalsIgnoreCase("python")) {
				
				el.click();
				
				break;
			}
		}
	}
}
