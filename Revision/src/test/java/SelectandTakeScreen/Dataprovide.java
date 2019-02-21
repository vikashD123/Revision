package SelectandTakeScreen;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovide {
	
	WebDriver driver;
	
	@Test(dataProvider="value")
	public void verifyData(String name,String pasword) {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		driver=new ChromeDriver();
		
		driver.get("https://www.freecrm.com/index.html");
		
		driver.findElement(By.name("username")).sendKeys(name);
		
		driver.findElement(By.name("password")).sendKeys(pasword);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		Assert.assertTrue(driver.getTitle().contains("CRMPRO"),"title didn't mtched");
		
		System.out.println("test completed");
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.close();
	}
	
	@DataProvider(name="value")
	public Object[][] verifyData() throws Exception{
		
		File src=new File("/home/manjit/Documents/Excel/TestData.xlsx");
	
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheet("sheet3");
			
		int count=sheet.getPhysicalNumberOfRows();
		
		System.out.println(count);
		
		Object[][]data=new Object[count][2];
		
		for(int i=0;i<count;i++) {
			
			XSSFRow row=sheet.getRow(i);
			
			XSSFCell c1=row.getCell(0);
			
			XSSFCell c2=row.getCell(1);
			
			data[i][0]=c1.getStringCellValue();
			
			data[i][0]=c1.getStringCellValue();
			data[i][1]=c2.getStringCellValue();
			
		}
		
		return data;
		
	}

}
