package org.mav;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Samplefive {
	public static void main(String[] args) throws Throwable {
		
		File f = new File("C:\\Users\\dell\\eclipse-workspace\\MavenTaskOne\\Excel\\Book1.xlsx");
		FileInputStream f1= new FileInputStream(f);
		Workbook w = new XSSFWorkbook(f1);
		Sheet s = w.getSheet("Sheet1");
		
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
		
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				
				CellType ct = c.getCellType();
				System.out.println(ct);
				
				switch (ct) {
				case STRING:
					String s1=c.getStringCellValue();
					System.out.println(s1);
					break;
					
				case NUMERIC:
					if(DateUtil.isCellDateFormatted(c)) {
						Date d = c.getDateCellValue();
						SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
						String dvalue = sdf.format(d);
						System.out.println(dvalue);	
					}
					
					else {
						double value = c.getNumericCellValue();
						long l =(long)value;
						System.out.println(l);	
					}
					break;
				default:
					break;
					}
					
					
					
					
					
				}
		}}
}
