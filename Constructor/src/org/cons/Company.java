package org.cons;

public class Company {
	public Company() {
		this(111);
		System.out.println("Def IS....");
	}
	public Company(int id) {
		
		this("test");
		System.out.println("NAME IS...."+id);
	}
	public Company(String name) {
		
		
		System.out.println("NUmber IS...."+name);
	}
	public static void main(String[] args) {
		Company c = new Company();
		
	}
	
	

}
