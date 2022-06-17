package packone;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyExcelOperations {
	@Test
	public void sampleOne() throws IOException {
		FileInputStream file = new FileInputStream(".\\src\\test\\resources\\Book1.xlsx");
		Workbook wrkbk = new XSSFWorkbook(file);
		int sheetcount = wrkbk.getNumberOfSheets();
		System.out.println(sheetcount);
		String sheetname = wrkbk.getSheetName(0);
		System.out.println(sheetname);
		Sheet sheet1 = wrkbk.getSheetAt(0);
		System.out.println(sheet1.getLastRowNum());
		Row row = sheet1.getRow(1);
		Cell cell = row.getCell(0);
		Cell cell2 = row.getCell(1);
		Cell cell3 = row.getCell(2);
		String cellvalue = cell.getStringCellValue();
		String cellvalue2=cell2.getStringCellValue();
		String cellvalue3=cell3.getStringCellValue();
		System.out.println(cellvalue);
		System.out.println(cellvalue2);
		System.out.println(cellvalue3);
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get(cellvalue);
		driver.switchTo().activeElement().sendKeys(cellvalue2,Keys.TAB);
		driver.switchTo().activeElement().sendKeys(cellvalue3,Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		driver.close();
	}
	
}
