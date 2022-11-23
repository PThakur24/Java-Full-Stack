package in.inueron.main;
import java.util.Scanner;

class Guesser
{
	int num;
	
	int Guessing()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Guesser guess the number: ");
		num=sc.nextInt();
		return num;
	}
}

class Players
{
	int num;
	
	int PlayerGuessing()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Player guess the number: ");
		num=sc.nextInt();
		return num;
	}
}

class Umpire
{
	int guesserNum;
	int playerNum1;
	int playerNum2;
	int playerNum3;
	
	void NumFromGuesser()
	{
		Guesser g=new Guesser();
		guesserNum=g.Guessing();
	}
	
	void NumFRomPlayer()
	{
		Players p1=new Players();
		Players p2=new Players();
		Players p3=new Players();
		playerNum1=p1.PlayerGuessing();
		playerNum2=p2.PlayerGuessing();
		playerNum3=p3.PlayerGuessing();
		
	}
	
	void Check()
	{
		if(guesserNum == playerNum1)
		{
			if(guesserNum == playerNum2 && guesserNum == playerNum3)
			{
				System.out.println("All players won");
			}
			else if(guesserNum == playerNum2)
			{
				System.out.println("Player 1 and 2 won");
			}
			else if(guesserNum == playerNum3)
			{
				System.out.println("Player 1 and 3 won");
			}
			else
			{
				System.out.println("Player 1 won");
			}
			
		}
		else if(guesserNum == playerNum2)
		{
			if(guesserNum == playerNum3)
			{
				System.out.println("Player 2 and 3 won");
			}
			else
			{
				System.out.println("Player 2 won");
			}
		}
		else if(guesserNum == playerNum3)
		{
			
		}
		else
		{
			System.out.println("All Players are out");
		}
	}
}

public class GusserGame {

	public static void main(String[] args) {
		
		Umpire u=new Umpire();
		u.NumFromGuesser();
		u.NumFRomPlayer();
		u.Check();
	}

}
