package org.types;

public class Types {
	public static void main(String[] args) {
		//Literal/Immutable
		String s="Java";
		String s1="Java";
		String s2="spl";
		String a=s.concat(s1);
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(a);
		System.out.println(System.identityHashCode(a));
	
		
		
		//Non-Literal
		String s3=new String("Java");
		String s4=new String("Java");
		String s5=new String("sql");
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		System.out.println(System.identityHashCode(s5));
		
		//Mutable
		StringBuffer c  =new StringBuffer("Java");
		StringBuffer c1 =new StringBuffer("Java");
		StringBuffer c2 =new StringBuffer("sql");
		StringBuffer d=c.append(c1);
		System.out.println("##Mutable Strings##");
		System.out.println(System.identityHashCode(c));
		System.out.println(System.identityHashCode(c1));
		System.out.println(System.identityHashCode(c2));
		System.out.println(d);
		System.out.println(System.identityHashCode(d));
		
		
		
		
	}
	

}
