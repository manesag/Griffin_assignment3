package griffin_problem1;
import java.security.SecureRandom;
import java.util.Scanner;

public class CAI2 
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
		SecureRandom randie = new SecureRandom();
		int rand3 = randie.nextInt(4);
		switch(rand3)
		{
			case 0:
				System.out.println("Keep up the good work!");
				break;
			case 1:
				System.out.println("Very good!");
				break;
			case 2:
				System.out.println("Excellent!");
				break;
			case 3:
				System.out.println("Nice work!");
				break;
		}
	}
	
	public static void displayIncorrectResponse()
	{
		SecureRandom randy = new SecureRandom();
		int rand4 = randy.nextInt(4);
		switch(rand4)
		{
			case 0:
				System.out.println("No. Keep trying.");
				break;
			case 1:
				System.out.println("No. Please try again.");
				break;
			case 2:
				System.out.println("Wrong. Try once more.");
				break;
			case 3:
				System.out.println("Don't give up!");
				break;
		}
	}
}
