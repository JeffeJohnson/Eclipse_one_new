package org.mav;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Samplefour {
	public static void main(String[] args) throws Throwable {
		
		File f=new File("C:\\Users\\dell\\eclipse-workspace\\MavenTaskOne\\Excel\\Book1.xlsx");
		
		FileInputStream n = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(n);
		
		Sheet s = w.getSheet("Sheet1");
		
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row row = s.getRow(i);

			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell c = row.getCell(j);
				CellType ct=c.getCellType();
				
				switch (ct) {
				case STRING:
					String value = c.getStringCellValue();
					System.out.println(value);
					break;

				default:
					break;
				}

}
}}}