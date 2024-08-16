package org.emp;

public class Employee {
	private void empDetail(int id) {
		System.out.println("Id is..."+id);

	}
	private void empDetail(String name) {
		System.out.println("Name is..."+name);

	}
	private void empDetail(char gender ) {
		System.out.println("Gender..."+gender);
		
	}
	
	
	public static void main(String[] args) {
		Employee a = new Employee();
		a.empDetail(234);
		a.empDetail("Jeffe");
		a.empDetail('F');
		
		
		
	}

}
