package in.ineuron;

import java.util.Scanner;

public class GuesserGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Umpire umpire = new Umpire();
		 umpire.getGuesserNumber();
		 umpire.getPlayersNumbers();
		 umpire.compare();

	}

}
class Guesser
{
	private int guessNumber;
	
	public int guessNumber()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Guesser please enter the number you have guessed.... : ");
		guessNumber=sc.nextInt();
		while(guessNumber<1 ||  guessNumber>10)
		{
			System.out.println("Number is Invalid! Please enter a number between 1 to 10 : ");
			guessNumber=sc.nextInt();
		}
	
	
	return guessNumber;
	}
	
	
}

class Player
{
	private int pGuessNumber;
	
	
	public int guessNumber()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Player , please enter the number you have guessed : ");
		pGuessNumber = sc.nextInt();
		while(pGuessNumber<1 ||  pGuessNumber>10)
		{
			System.out.println("Number is Invalid! Please enter a number between 1 to 10 : ");
			pGuessNumber=sc.nextInt();
		}
		
		
		return pGuessNumber;
	}
}

class Umpire
{
	private int guesserNumber;
	private int player1Number;
	private int player2Number;
	private int player3Number;
	
public int getGuesserNumber()
{
	Guesser guesser = new Guesser();
	guesserNumber = guesser.guessNumber();
	return guesserNumber;
}
public void getPlayersNumbers()
{
	Player player1 = new Player();
	Player player2 = new Player();
	Player player3 = new Player();
	
	player1Number=player1.guessNumber();
	player2Number=player2.guessNumber();
	player3Number=player3.guessNumber();
	
}
public void compare()
{
	if(guesserNumber==player1Number)
	{
		if(guesserNumber==player2Number && guesserNumber==player3Number)
		{
			System.out.println("Hurray..All the three players guessed correctly! Game is tied..");
		}
		else if(guesserNumber==player2Number && guesserNumber!=player3Number)
		{
			System.out.println("Hurray..Player 1 and Player 2 won the game..!!");
		}
		else if(guesserNumber!=player2Number && guesserNumber==player3Number)
		{
			System.out.println("Hurray..Player 1 and Player 3 won the game..!!");
		}
		else
		{
			System.out.println("Hurray..Player 1 won the game..!!");
		}
	}
	else if(guesserNumber==player2Number)
		{
		if(guesserNumber==player3Number)
		{
			System.out.println("Hurray..Player 2 and Player 3 won the game..!!");
		}
		else
		{
			System.out.println("Hurray.. Player 2 won the game..");
		}
		}
	else if(guesserNumber==player3Number)
	{
		System.out.println("Hurray..Player3 won the game..");
	}
	else
	{
		System.out.println("No one won!! Please try again!!");
	}
}
	
	
}
