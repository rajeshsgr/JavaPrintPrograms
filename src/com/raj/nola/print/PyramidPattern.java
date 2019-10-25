package com.raj.nola.print;

import java.util.Scanner;

public class PyramidPattern {

	private static void printPattern1(int rows) {
		
		// for loop for the rows
		for (int i = 1; i <= rows; i++) {
			// white spaces in the front of the numbers
			int numberOfWhiteSpaces = rows - i;

			//print leading white spaces
			printString(" ", numberOfWhiteSpaces);

			//print *
			printString("* ", i);

			//move to next line
			System.out.println("");
			
		}
	}

	//utility function to print string given times
	private static void printString(String s, int times) {
		for (int j = 0; j < times; j++) {
			System.out.print(s);
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number of rows to print:");
		int rows = scanner.nextInt();
		scanner.close();

		System.out.println("Printing Pyramid Pattern");
		printPattern1(rows);

	}

}