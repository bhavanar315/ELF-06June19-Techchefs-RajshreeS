package com.techchefs.javaapp.assignment.patternassignment;

public class PatternRightAngleTriangleInverse {
/*
 * 		****
 * 		***
 * 		**
 * 		*
 */
	public static void main(String[] args) {
		for (int i = 4; i >= 0; i--) {
			for (int j = i; j >= 0; j--) {
				System.out.print("*");
			}
			for (int k = i; k <= 4; k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		/////////////		
		
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k < (2 * i); k++) {
				if (k > 1 && k < (2 * i) - 1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		for (int i = 4; i >= 1; i--) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k < (2 * i); k++) {
				if (k > 1 && k < (2 * i) - 1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
	}

}
