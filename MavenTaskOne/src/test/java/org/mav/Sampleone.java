package org.mav;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sampleone {
	public static void main(String[] args) throws IOException {
		
		File excelLoc = new File("C:\\Users\\dell\\eclipse-workspace\\MavenTaskOne\\Excel\\Book1.xlsx");
		
		FileInputStream a =new FileInputStream(excelLoc);
		
		Workbook w = new XSSFWorkbook(a);
		
		Sheet s = w.getSheet("Sheet1");
		
		Row row = s.getRow(1);
		
		Cell cell = row.getCell(0);
		System.out.println(cell);
		
	}

}
