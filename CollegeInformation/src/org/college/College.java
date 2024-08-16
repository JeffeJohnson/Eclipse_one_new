package org.college;

public class College {
	private void collegeName() {
		System.out.println("ABC COLLEGE");
	}
	private void collegeCode() {
		System.out.println("ABC");
	}
	private void collegeRank() {
		System.out.println("5");
	}
	public static void main(String[] args) {
		College a = new College();
		a.collegeName();
		a.collegeCode();
		a.collegeRank();
		
			
		Student b = new Student();
		b.studentName();
		b.studentId();
		b.studentDept();
		
		Hostel c = new Hostel();
		c.hostelName();
		
		Dept d = new Dept();
		d.deptName();
			
			
		}
	}

