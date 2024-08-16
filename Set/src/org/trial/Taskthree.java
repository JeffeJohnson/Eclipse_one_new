package org.trial;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Taskthree {
	public static void main(String[] args) {
		
		Set<Object[]> s=new HashSet<>();{
		Scanner a=new Scanner(System.in);
		
		System.out.print("Enter employee ID: ");
		int empId = a.nextInt();
		System.out.println("Employee Id"+empId);
		
		System.out.print("Enter employee name: ");
		String name =a.next();
		System.out.println("Employee name"+name);
		
		System.out.print("Enter employee salary: ");
		double salary= a.nextDouble();
		System.out.println("Employee name"+salary);
		
		
		Object[] employeeDetails = {empId, name,salary};
		s.add(employeeDetails);
		
	
		System.out.println("\nEmployee Details:");
		for(Object[] emp:s) {
			System.out.println("Employee Id"+emp[0]);
			System.out.println("Employee Name"+emp[1]);
			System.out.println("Employee salary"+emp[2]);
			
			
			
		}	
		a.close();

	}
}
}

