package com.frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab2 {

	@Test
	public void test1() {
		
System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///home/manjit/Documents/myframe.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		int count=driver.findElements(By.tagName("iframe")).size();
		
		System.out.println("Total frames----"+count);
		
		driver.switchTo().frame("//iframe[@type='selenium_news']");
		
		driver.findElement(By.xpath("//*[text()='Selenium Projects']")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//*[text()='Click here for Selenium tutorial']")).click();
		
		driver.close();
		
	}
}
