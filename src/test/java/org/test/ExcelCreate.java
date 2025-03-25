package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCreate {

	public static void main(String[] args) throws IOException {
		
		
		File f = new File(System.getProperty("user.dir")+"\\ExcelSheet\\testData.xlsx");
		
		FileInputStream stream = new FileInputStream(f);
		
		Workbook  wb = new XSSFWorkbook(stream);
		
		Sheet sheet = wb.createSheet("demo");
		
		Row row = sheet.createRow(0);
		
		Cell cell = row.createCell(0);
		
		cell.setCellValue("world");
		
		FileOutputStream  fo = new FileOutputStream(f);
		
		wb.write(fo);
		
		wb.close();
		
		System.out.println("-- Ending --");
		
	}
}
