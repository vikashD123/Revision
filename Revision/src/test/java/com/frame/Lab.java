package com.frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab {

	@Test
	public void frameHandling() {
		

		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///home/manjit/Documents/myframe.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
	int total_frame =driver.findElements(By.tagName("iframe")).size();
	
	System.out.println(total_frame);
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='jqueryui']")));
	
	driver.findElement(By.xpath("//*[@type='text']")).sendKeys("Vikash");
	
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	
	driver.switchTo().defaultContent();
	
	driver.findElement(By.xpath("//a[text()='Click here for Selenium tutorial']")).click();
	
				
				
	}
}
