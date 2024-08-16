package org.mav;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sampletwo {
	public static void main(String[] args) throws Throwable {
		//to get number of rows and cells
		
		File f=new File("C:\\Users\\dell\\eclipse-workspace\\MavenTaskOne\\Excel\\Book1.xlsx");
		
		FileInputStream n = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(n);
		
		Sheet s = w.getSheet("Sheet1");
		int rows = s.getPhysicalNumberOfRows();
		System.out.println(rows);
		
		
		Row r = s.getRow(0);
		int cells = r.getPhysicalNumberOfCells();
		System.out.println(cells);
		
		
			
		}	
		
		
	}

