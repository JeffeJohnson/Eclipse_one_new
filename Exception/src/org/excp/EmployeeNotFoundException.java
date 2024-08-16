package org.excp;

public class EmployeeNotFoundException extends Exception {
	
	@Override
	public String getMessage() {
		String mess="Employee NOT FOUND";
		return mess;
	}

}
