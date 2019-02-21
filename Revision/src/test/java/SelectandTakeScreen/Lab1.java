package SelectandTakeScreen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Lab1 {

	@Test
	public void selectDropdown() {
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	    WebElement el=driver.findElement(By.id("day"));
	    
	    Select s=new Select(el);
	    
	    s.selectByIndex(0);
	    
	    s.selectByValue("6");
	    
	    s.selectByVisibleText("8");
	    
	    System.out.println(el.isSelected());
	    
	    WebElement el1=driver.findElement(By.name("birthday_month"));
	    
	    Select s1=new Select(el1);
	    
	    s1.selectByIndex(4);
	    
	    s1.selectByValue("7");
	    
	    s1.selectByVisibleText("Sept");
	    
	    WebElement el2=driver.findElement(By.id("year"));
	    
	    Select s2=new Select(el2);
	    
	    s2.selectByIndex(7);
	    
	    s2.selectByValue("2015");
	    
	    s2.selectByVisibleText("1992");
	    
	    
	    
		
	}
}
