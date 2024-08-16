package org.one;

public class One {
public static void main (String[]args) {
	
	String s="Welcome";
	
			
	System.out.println(s);
	
	int a = s.length();
	System.out.println(a);
	
	 boolean b= s.startsWith("We");
	 System.out.println(b);
	 
	 boolean c = s.endsWith("de");
	 System.out.println(c);
	 
	 String d = s.toUpperCase();
	 System.out.println(d);
	 
	 String e = s.toLowerCase();
	 System.out.println(e);
	 
	 int f = s.indexOf('e');
	 System.out.println(f);
	 
	 int g = s.lastIndexOf('e');
	 System.out.println(g);
	
	 char h = s.charAt(5);
	 System.out.println(h);
	
	 boolean i = s.isEmpty();
	 System.out.println(i);
	 
	 boolean j= s.contains("el");
	 System.out.println(j);
	 
	 String s1="welcome";
	 
	 boolean k = s.equals(s1);
	 System.out.println(k);
	 
	 boolean l = s.equalsIgnoreCase(s1);
	 System.out.println(l);
	 
	 String m = s.replace('e','@');
	 System.out.println(m);
	 
	 String n= s.concat(s1);
	 System.out.println(n);
	 
	 String s2="Java Application";
	 
	 String p = s2.trim();
	 System.out.println(p);
	 
	 String q = s2.substring(2);
	 System.out.println(q);
	 
	 String r = s2.substring(7,12);
	 System.out.println(r);
	 
	 String t= s2.replaceAll(s2,"hello");
	 System.out.println(t);
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
}
