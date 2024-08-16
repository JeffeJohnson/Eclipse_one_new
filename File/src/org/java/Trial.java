package org.java;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Trial {
	

	public static void main(String[] args) throws IOException   {
		
		File f = new File("C:\\Users\\dell\\Documents\\JAVA.txt");
		File f1= new File("C:\\Users\\dell\\Documents\\PYTHON.txt");
		
		FileUtils.write(f, "Jeffe\n");
		FileUtils.write(f, "Johnson\n",true);
		FileUtils.write(f, "Here", true);
		
		
		
		FileUtils.copyFile(f, f1);
		List<String> l = FileUtils.readLines(f1);
		for(String x:l) {
			System.out.println(x);
		}
		
	}
	
	
	
	

}
