package HangmanGame;

import java.util.Scanner;

public class HangmanGame 
{

		public static void main (String[] args)
		{
			Scanner sc = new Scanner(System.in);

		boolean shallWeStart = true;
		while (shallWeStart)
		{
				System.out.println("Welcome Player!");
		String word = "christmas";
		String hint = "The hint is: 'Holly Jolly'";
		char[] christmas = word.toCharArray();
		int amountOfGuesses = christmas.length;
		char[] playerGuesses = new char[amountOfGuesses];
		
		for (int i = 0; i < playerGuesses.length; i++) 
		{
		playerGuesses[i] = '*';
		}
		boolean wordIsGuessed = false;
		int tries = 0;
		while (!wordIsGuessed && tries != amountOfGuesses)
		{
					System.out.println("Current guesses: ");
					System.out.println(playerGuesses);
					System.out.printf("You have %d amount of tries left.  If needed hint, enter '?' or '-' to exit", amountOfGuesses - tries);
					System.out.println(" ");
					System.out.println("Hurry up and pick a letter");
				char input = sc.nextLine().charAt(0);
				tries++;	
				if (input == '-')
				 
				{
				shallWeStart = false;
				wordIsGuessed = true;
				}
				if (input == '?')
				{
						System.out.println(hint);
				}
				else
				{
					for (int i = 0; i < christmas.length; i++)
					{
						if (christmas[i] == input)
						{
							playerGuesses[i] = input;
						}
						if (isTheWordGuessed(playerGuesses))
						{
							wordIsGuessed = true;
							System.out.println("Surprisingly YOU WON");
							
						}
					}
					
				}
		
		}
		if (!wordIsGuessed)
		{
					System.out.println("Game Over");
					System.out.println("Would you like to play again? Yes/No");
					System.out.println("It seems like you've ran out of guesses.");
					String anotherGame = sc.nextLine();
					if (anotherGame.equals("No")) shallWeStart = false;
				}		
			}
		}
	
		public static boolean isTheWordGuessed(char[] array)
		{
			for (int i = 0; i < array.length; i++)
			{
				if (array[i] == '*') return false;
			}
			
			return true; 
			}
}