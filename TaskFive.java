package Udemy.LoginProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TaskFive extends TaskFour{
		
	public static void main(String[] args) throws Exception {
		TaskFour fourpractice=new TaskFour();
		
		
		String username,password;
		FileInputStream file = new FileInputStream("C:\\UdemySelenium\\New folder\\saucedata.xlsx\\");
	//	HSSFWorkbook wb=new HSSFWorkbook(file);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
	//	sheet=workbook.getSheet("Data");
		System.out.println(sheet.getLastRowNum());
		int totalrows=sheet.getLastRowNum();
//		for(int i=1;i<totalrows+1;i++) {
//			username=sheet.getRow(i).getCell(0).getStringCellValue();
//			System.out.println(username);
//			password=sheet.getRow(i).getCell(1).getStringCellValue();
//			System.out.println(password);
//			fourpractice.sauce("chrome", username, password);
//		}
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		System.out.println(sheet.getRow(0).getCell(0));
		Row row1 = sheet.getRow(0);
		Cell cell1 = row1.getCell(1);
		System.out.println(sheet.getRow(0).getCell(1));
		Row row2 = sheet.getRow(1);
		Cell cell2 = row2.getCell(1);
		System.out.println(sheet.getRow(1).getCell(0));
		Row row3 = sheet.getRow(1);
		Cell cell3 = row3.getCell(1);
		System.out.println(sheet.getRow(2).getCell(0));
	}
//	public void Exceldemo() throws IOException,InvalidFormatException {
//		InputStream inp=new FileInputStream("saucedata.xlsx");
//		Workbook wb=WorkbookFactory.create(inp);
//		
//	}
}
