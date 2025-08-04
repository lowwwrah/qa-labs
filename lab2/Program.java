package lab2;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		Random rand = new Random();
		int mark = rand.nextInt(102);
		System.out.println("Mark: " + mark);
		
		if (mark < 50)
		{
			System.out.println("You failed!");
		}
		else if (mark <= 59)
		{
			System.out.println("You passed!");
		}
		else if (mark <= 69)
		{
			System.out.println("You passed with merit!");
		}
		else if (mark <= 99)
		{
			System.out.println("You passed with distinction!");
		}
		else if (mark == 100)
		{
			System.out.println("Well done, you aced it!");
		}
		else 
		{
			System.out.println("Error: marks must be between 1 and 100.");
		}
	}

}
