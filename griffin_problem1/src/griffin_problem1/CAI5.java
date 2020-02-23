package griffin_problem1;
import java.security.SecureRandom;
import java.util.Scanner;

public class CAI5 
{
	private static final Scanner scanny = new Scanner(System.in);
		
	public static void main(String[] args) 
	{
		int i = 0;
		int x = 0;
		int grade = 0;
		int diff;
		
		System.out.println("Please enter a difficulty number between 1 and 4: ");
		diff = scanny.nextInt();
		System.out.println("Press 1 for addition, 2 for multiplication, 3 for subtraction");
		System.out.println("4 for division and 5 for a mix of the above");
		int type = scanny.nextInt();
		type = readProblemType(type);
		while(i!=-1)
		{
			for(int j = 0; j < 10; j++)
			{
				x = quiz(diff, type);
				if(x==1)
				{
					grade++;
					x = 0;
				}
			}
			displayCompletionMessage(grade);
			System.out.println("Input any number to go again or -1 to exit");
			grade = 0;
			diff = 0;
			if(!scanny.hasNextInt())
			{
				System.out.println("Not a number!");
				scanny.hasNext();
			}
			i = scanny.nextInt();
			if(diff==0)
			{
				System.out.println("Please enter a difficulty number between 1 and 4: ");
				diff = scanny.nextInt();
			}	
		}
	}

	public static int readProblemType(int type)
	{
		return type;
	}
	
	public static int quiz(int diff, int type)
	{
		SecureRandom rand = new SecureRandom();
		
		int rand1 = 0;
		int rand2 = 0;
		
		switch(diff)
		{
			case 1:
				rand1 = rand.nextInt(10);
				rand2 = rand.nextInt(10);
				break;
			case 2:
				rand1 = rand.nextInt(100);
				rand2 = rand.nextInt(100);
				break;
			case 3:
				rand1 = rand.nextInt(1000);
				rand2 = rand.nextInt(1000);
				break;
			case 4:
				rand1 = rand.nextInt(10000);
				rand2 = rand.nextInt(10000);
				break;
		}
		if(rand2==0 && type == 4)
			rand2++;
		return askQuestion(rand1, rand2, type);
	}
	
	public static int askQuestion(int a, int b, int type)
	{
		SecureRandom rand = new SecureRandom();
		double c= 0;
		if(type==5)
		{
			int randy = rand.nextInt(5);
			type = randy;
		}
		switch(type)
		{
		case 1:
			System.out.println("How much is " + a + " plus " + b);
			c = a+b;
			break;
		case 2:
			System.out.println("How much is " + a + " times " + b);
			c = a*b;
			break;
		case 3:
			System.out.println("How much is " + a + " minus " + b);
			c = a-b;
			break;
		case 4:
			System.out.println("How much is " + a + " divided " + b);
			c = (double)a/(double)b;
			c = (double)Math.round(c * 1000d) / 1000d;
			break;
		}
		return readResponse(c);
	}
	
	public static int readResponse(double d)
	{
		double scanned = scanny.nextDouble();
		return isAnswerCorrect(d, scanned);
	}
	
	public static int isAnswerCorrect(double ans, double res)
	{
		if(ans==res)
		{
			displayCorrectResponse();
			return 1;
		}
		else
			displayIncorrectResponse();
		return 0;
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
	
	public static void displayCompletionMessage(int g)
	{
		int percent;
		percent = g * 10;
		
		if(percent > 75)
		{
			System.out.println("You received a: " + percent + "%");
			System.out.println("Congratulations, you are ready to go to the next level!");
		}
		else
		{
			System.out.println("You received a: " + percent + "%");
			System.out.println("Please ask your teacher for extra help.");
		}
		percent = 0;
	}
}

