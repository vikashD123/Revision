package com.frame;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {

	@Test
	public void drag() {
		
System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://jqueryui.com/droppable/");
		
		int count =driver.findElements(By.tagName("iframe")).size();
		
		System.out.println(count);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		Actions act=new Actions(driver);
		
		WebElement source=driver.findElement(By.id("draggable"));
		
		WebElement target=driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(source, target).build().perform();
	}
}
