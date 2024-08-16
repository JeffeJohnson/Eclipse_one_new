package org.one;

public class Five {
	public static void main(String[] args) {
		String s="Welcome to Java";
		
		String a= s.replaceAll("Java","sql");
		System.out.println(a);
		
		String s2="Greens Adayar";
		String b= s2.replaceAll("Adayar","omr");
		System.out.println(b);
		
		String s3="Welcome to java class";
		String c=s3.replace(' ', '#');
		System.out.println(c);
	}

}
