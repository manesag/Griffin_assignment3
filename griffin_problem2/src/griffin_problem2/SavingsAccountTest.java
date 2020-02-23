package griffin_problem2;

public class SavingsAccountTest 
{
	public static void main(String[] args)
	{
		SavingsAccount.modifyInterestRate(4);
		SavingsAccount saver1 = new SavingsAccount(2000);
		System.out.println("============================");
		SavingsAccount saver2 = new SavingsAccount(3000);
		SavingsAccount.modifyInterestRate(5);
		System.out.println("============================");
		saver1 = new SavingsAccount(2000);
		System.out.println("============================");
		saver2 = new SavingsAccount(3000);
	}
}
