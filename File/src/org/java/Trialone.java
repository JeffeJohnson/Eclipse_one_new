package org.java;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Trialone {
	public static void main(String[] args) throws IOException {
		

	File f=new File("C:\\trial\\java.txt");
	
	boolean a = f.createNewFile();
	System.out.println(a);
	
	FileUtils.write(f, "hello \n");
	FileUtils.write(f, "I am \n",true);
	FileUtils.write(f, "my name is jeffe\n",true);
	
	
	

	}
}
