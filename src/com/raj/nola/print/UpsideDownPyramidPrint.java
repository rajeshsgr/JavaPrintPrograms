package com.raj.nola.print;

import java.util.Scanner;

public class UpsideDownPyramidPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number of rows in Pyramid:");
		int rows = scanner.nextInt();
		scanner.close();
		
		printUpsideDownPyramid(rows);
		

	}
	
	
	static void printUpsideDownPyramid(int rows) {
		
		// for loop for the rows
				for (int i = rows; i >= 1; i--) {
					
					// white spaces in the front of the numbers
					int numberOfWhiteSpaces = rows - i;
					
					//print leading white spaces
					printPattern(" ", numberOfWhiteSpaces);
					
					
					printPattern("* ", i);

					//move to next line
					System.out.println("");
					
				}
		

	}
	
	private static void printPattern(String pattern, int times) {
		
		for (int i = 0; i < times; i++) {
			System.out.print(pattern);
		}
	}

}
