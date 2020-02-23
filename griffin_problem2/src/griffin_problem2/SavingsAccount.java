package griffin_problem2;

import java.text.DecimalFormat;

public class SavingsAccount 
{
	private static float annualInterestRate;
	private float savingsBalance;
	private static DecimalFormat df = new DecimalFormat("#.##");
	
	public SavingsAccount()
	{
		System.out.println("Please add money to savings");
	}
	
	public SavingsAccount(int mon) 
	{
		setBal(mon);
		calculateMonthlyInterest();
	}

	public void calculateMonthlyInterest()
	{
		float bal;
		float rate;
		
		bal = returnBalance();
		rate = returnIR()/100;
		for(int i = 1; i < 13; i++)
		{
			System.out.println("Month: " + i + " $" + df.format(bal));
			bal += bal * rate / 12;
		}
		
	}
	
	public static void modifyInterestRate(int n)
	{
		int rate = n;
		setNewIr(rate);
	}
	
	private float returnBalance()
	{
		return this.savingsBalance;
	}
	
	private float returnIR()
	{
		return this.annualInterestRate;
	}
	
	private static void setNewIr(int n)
	{
		annualInterestRate = (n);
	}
	
	private void setBal(int m)
	{
		this.savingsBalance = m;
	}
}

