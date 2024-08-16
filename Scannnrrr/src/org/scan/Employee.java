package org.scan;


import java.util.Scanner;
public class Employee {
	public static void main(String[] args) {
	
			Scanner s=new Scanner(System.in);{
			
			int id =s.nextInt();
			System.out.println("Employee id...."+id);
			
			String name = s.next();
			System.out.println("Employee name...."+name);
			
			String email= s.next();
			System.out.println("Employee email...."+email);
			
			long phno= s.nextLong();
			System.out.println("Employee phone....."+phno);
			
			double salary = s.nextDouble();
			System.out.println("Employee salary...."+salary);
			
			String gender = s.next();
			System.out.println("Employee gender...."+gender);
			
			
	}
	}
}

