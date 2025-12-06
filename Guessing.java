// Keep a secret number between 20 and 30 in your program. Ask the user to
// predict a number between 20 and 30. Use a do-while loop until the user predicts
// your secret number and display the count of attempts.

// @JIYO P V   Roll No:33
// 06 December 2025

import java.util.*;

class Guessing
{	
    int attempts;  // To store number of attempts made by the user

    // Method to take user's guess and return it
	public int guess()
	{
		Scanner sc = new Scanner(System.in);

		// Display attempt number and ask for input
		System.out.println("Guess the number: XX (hint: it's between 20 and 30)");
		System.out.println("Attempt " + attempts);
		System.out.print("Enter your guess: ");

		int g = sc.nextInt();  // Read user's guess
		return g;
	}
	
	// Method to play one full game round
	public void play()
	{
		attempts = 1;  // Reset attempts for each round

		Random rn = new Random();
		int n = rn.nextInt(10) + 20;  
		// Random number between 20 and 29 (inclusive)

		// Loop until the guessed number matches the secret number
		while (guess() != n)
		{
			attempts++;  // Increase attempt count after each wrong guess
		}

		// When correct guess is made, show result
		System.out.println("The number was " + n + "\nNumber of attempts: " + attempts);
	}

	// Main method to run the game
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s;
		Guessing g = new Guessing();

		while (true)
		{
			g.play();  // Play a full round

			// Ask if user wants to play again
			System.out.print("Play again? <y/n>: ");
			s = sc.nextLine();

			if (s.equals("n"))
			{	
				break;  // Exit loop if user enters 'n'
			}
		}
	}
}
