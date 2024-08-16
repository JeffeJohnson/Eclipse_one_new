package org.java;

import java.io.File;
import java.io.IOException;

public class Trialtwo {
	public static void main(String[] args) throws IOException {
		File dir =new File("C:\\Users\\dell\\new\\newone");
		
		boolean nwdir = dir.mkdirs();
		System.out.println(nwdir);
		
		File f = new File(dir,"java.txt");
		boolean newFile = f.createNewFile();
		System.out.println(newFile);
		
		boolean canRead = f.canRead();
		System.out.println(canRead);
		
		boolean canWrite = f.canWrite();
		System.out.println(canWrite);
		
		String[] list = dir.list();
		for(String x:list) {
			System.out.println(x);
		}
		File[] listFiles = dir.listFiles();
		for(File a:listFiles) {
			System.out.println(a);
		}
		
		
	}
	
}
