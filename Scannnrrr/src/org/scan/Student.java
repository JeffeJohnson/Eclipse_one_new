package org.scan;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);{

        System.out.println("Enter student ID:");
        int studentId = s.nextInt();
        s.nextLine(); 
        System.out.println("Enter student name:");
        String studentName = s.nextLine();
        System.out.println("Enter marks for 5 subjects:");

        int[] marks = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Mark " + (i+1) + ": ");
            marks[i] = s.nextInt();
        }

        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        double averageMarks = (double) totalMarks / marks.length;
        
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);

        }
    }
}
