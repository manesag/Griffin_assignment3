package griffin_problem1;
import java.security.SecureRandom;
import java.util.Scanner;

public class CAI1 
{
	private static final Scanner scanny = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		quiz();
	}

	public static void quiz()
	{
		SecureRandom rand = new SecureRandom();
		
		int rand1 = rand.nextInt(10);
		int rand2 = rand.nextInt(10);
		askQuestion(rand1, rand2);
	}
	
	public static void askQuestion(int a, int b)
	{
		System.out.println("How much is " + a + " times " + b);
		int c = a*b;
		readResponse(c);
	}
	
	public static void readResponse(int d)
	{
		int scanned = scanny.nextInt();
		isAnswerCorrect(d, scanned);
	}
	
	public static void isAnswerCorrect(int ans, int res)
	{
		if(ans==res)
			displayCorrectResponse();
		else
			displayIncorrectResponse();
	}
	
	public static void displayCorrectResponse()
	{
		System.out.println("Very good!");
	}
	
	public static void displayIncorrectResponse()
	{
		System.out.println("No. Please try again.");
	}
}
