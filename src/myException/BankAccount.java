package myException;

import java.util.Scanner;

public class BankAccount {
	private Scanner sc;
	double balance;
	public BankAccount()
	{
		sc = new Scanner(System.in);
		
	}
	public void accept()
	{
		try 
		{
		System.out.println("Enter Amount greater than 1000" );
		balance=sc.nextDouble();
		if(balance<1000)
			{
				throw new InvalidAmountException();
			}
		}
		catch(InvalidAmountException ex)
			{
				System.out.println(ex.getMessage());
			}
	}
	public static void main(String[] args) {
		BankAccount bankd=new BankAccount();
		bankd.accept();
	}

}
