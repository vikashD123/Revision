package SelectandTakeScreen;

import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel {

	@Test
	public void verifydata() throws IOException {
		
		FileInputStream fis =new FileInputStream("/home/manjit/Documents/Excel/TestData.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheet("sheet3");
		
		String value=sheet.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(value);
	}
}
