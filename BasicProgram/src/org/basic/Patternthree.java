package org.basic;

public class Patternthree {
	
	    public static void main(String[] args) {
	        int n = 5; // Number of lines

	        for (int i = 1; i <= n; i++) {
	            // Print leading spaces
	            for (int j = i; j < n; j++) {
	                System.out.print("  "); // Two spaces for alignment
	            }
	            // Print stars with spaces
	            for (int k = 1; k <= i; k++) {
	                System.out.print("*   "); // Asterisk followed by three spaces
	            }
	            System.out.println(); // Move to the next line
	        }
	    }
	}

