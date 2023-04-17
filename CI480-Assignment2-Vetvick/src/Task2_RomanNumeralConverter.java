//Lindsey Vetvick - Solution to Assignment #2: Task 2
//Write a program which will convert a Roman Numeral input (I-X)
//into its integer form as well as recognize an invalid input.

import java.util.Scanner;

public class Task2_RomanNumeralConverter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// prompt user for an input
		System.out.println("Enter a Roman Numeral: ");

		// store response as a String
		String input = scan.nextLine();

		// normalize user response
		String inputNormalized = input.toUpperCase();

		//use the .equals method to compare user response to each Roman Numeral
		//in the range defined for this program (I-X)
		if (inputNormalized.equals("I")) {
			System.out.println("");
			System.out.println(inputNormalized + " is equal to 1.");
		} else if (inputNormalized.equals("II")) {
			System.out.println("");
			System.out.println(inputNormalized + " is equal to 2.");
		} else if (inputNormalized.equals("III")) {
			System.out.println("");
			System.out.println(inputNormalized + " is equal to 3.");
		} else if (inputNormalized.equals("IV")) {
			System.out.println("");
			System.out.println(inputNormalized + " is equal to 4.");
		} else if (inputNormalized.equals("V")) {
			System.out.println("");
			System.out.println(inputNormalized + " is equal to 5.");
		} else if (inputNormalized.equals("VI")) {
			System.out.println("");
			System.out.println(inputNormalized + " is equal to 6.");
		} else if (inputNormalized.equals("VII")) {
			System.out.println("");
			System.out.println(inputNormalized + " is equal to 7.");
		} else if (inputNormalized.equals("VIII")) {
			System.out.println("");
			System.out.println(inputNormalized + " is equal to 8.");
		} else if (inputNormalized.equals("IX")) {
			System.out.println("");
			System.out.println(inputNormalized + " is equal to 9.");
		} else if (inputNormalized.equals("X")) {
			System.out.println("");
			System.out.println(inputNormalized + " is equal to 10.");
		} else {
			System.out.println("");
			System.out.println("Invalid Response.");
		}

	}

}
