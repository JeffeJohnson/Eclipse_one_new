package org.mav;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Samplesix {
	public static String excelRead(String sheetName,int rowNo, int cellNo)throws IOException {
		String value=null;
		File f = new File("C:\\Users\\dell\\eclipse-workspace\\MavenTaskOne\\Excel\\Book1.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet sheet = w.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell c = row.getCell(cellNo);
		CellType cellType = c.getCellType();
		switch (cellType) {
		case STRING:
			String s = c.getStringCellValue();
			break;
		case NUMERIC:
			if(DateUtil.isCellDateFormatted(c)) {
				Date date = c.getDateCellValue();
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
				value = sdf.format(date);
			}else
			{
				double d = c.getNumericCellValue();
				long l = (long)d;
				value = String.valueOf(l);
			}

		default:
			break;
		}
		return value;	
		
	}

	

}
