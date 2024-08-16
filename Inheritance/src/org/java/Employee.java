package org.java;

import com.java.Client;
public class Employee extends Company {//child2
	private void empName() {
		System.out.println("Jeffe");

	}
	private void empPho() {
		System.out.println("98563241615");

	}
	public static void main(String[] args) {
		Employee a = new Employee();
		a.empName();
		a.empPho();
		a.cmpId();
		a.cmpName();
		
		Client b = new Client();
		b.cliId();
		
		
		
	}

}
