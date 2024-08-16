package org.java;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Trialthree {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\dell\\new\\newone\\java.txt");
		FileUtils.write(f, "java",true);
		FileUtils.write(f, "java selenium",true);
		FileUtils.write(f, "jeffe\n",false);
		FileUtils.write(f, "hello\n",true);
		FileUtils.write(f, "world\n",true);
		List<String> lines = FileUtils.readLines(f);
		for (String a : lines) {
			System.out.println(a);
		}
		File f1=new File("C:\\Users\\dell\\new\\newone\\jeffe.txt");
		boolean newFile = f1.createNewFile();
		System.out.println(newFile);
		FileUtils.copyFile(f, f1);
		List<String> line = FileUtils.readLines(f1);
		for (String a : line) {
			System.out.println(a);
		}
		
	}
}
