//Lindsey Vetvick - Solution to Assignment #2: Task 3
//Write a program which can run through a single round
//of Rock, Paper, Scissors. 

import java.util.Random;
import java.util.Scanner;

public class Task3_RPS {

	public static void main(String[] args) {

		// We will learn how to do this later as a class
		// For now, we'll provide you with the code that makes
		// the computer's choice!

		// Make an array of the computer's options - you may
		// have seen arrays in the reading
		String choices[] = { "Rock", "Paper", "Scissors" };

		// Make a Random object - we can use Random to
		// generate Random numbers!
		// This is another Object type given to us by Java,
		// like Scanner
		Random ran = new Random();

		// Use the ran object's nextInt method to get a choice
		// By passing it choices.length, we will get 0, 1, or 2
		// nextInt is defined to give us from 0 up to, but
		// not including, the number we give it as an 'argument'
		int cChoice = ran.nextInt(choices.length);

		// Use the generated number to pick the computer's choice
		// This operation is called 'indexing' -
		// and is like String's charAt
		String computerChoice = choices[cChoice];

		//code written by JLVetvick
		Scanner scan = new Scanner(System.in);

		// prompt user for select game choice
		System.out.println("Let's play Rock, Paper, Scissors!");
		System.out.println("Make your choice by selecting 0 for Rock, 1 for Paper, or 2 for Scissors: ");

		//store user input as variable
		int pChoice = scan.nextInt();

		//initiate test for valid input choice
		if (pChoice <= 2) {

			// this step was a stretch for me--I haven't yet worked with arrays, but using
			// the Debugger, I was able to figure out the purpose of Line 35, then
			// I applied that technique to the playerChoice variable
			String playerChoice = choices[pChoice];

			// make comparisons of player and computer choices
			if (pChoice == cChoice) {
				System.out.println("It's a tie! You selected " + playerChoice + ", and the computer selected "
						+ computerChoice + ".");
			} else if (pChoice == 0 && cChoice == 1) {
				System.out.println("You lose! You selected " + playerChoice + ", and the computer selected "
						+ computerChoice + ".");
			} else if (pChoice == 0 && cChoice == 2) {
				System.out.println("You win! You selected " + playerChoice + ", and the computer selected "
						+ computerChoice + ".");
			} else if (pChoice == 1 && cChoice == 0) {
				System.out.println("You win! You selected " + playerChoice + ", and the computer selected "
						+ computerChoice + ".");
			} else if (pChoice == 1 && cChoice == 2) {
				System.out.println("You lose! You selected " + playerChoice + ", and the computer selected "
						+ computerChoice + ".");
			} else if (pChoice == 2 && cChoice == 0) {
				System.out.println("You lose! You selected " + playerChoice + ", and the computer selected "
						+ computerChoice + ".");
			} else if (pChoice == 2 && cChoice == 1) {
				System.out.println("You win! You selected " + playerChoice + ", and the computer selected "
						+ computerChoice + ".");
			}

		} else {
			System.out.println("Your selection is invalid. You must choose 0 for Rock, 1 for Paper, or 2 for Scissors.");
		}
	}
}
