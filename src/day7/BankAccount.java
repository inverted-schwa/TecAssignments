package day7;

public class BankAccount {
	public void show()
	{
		double balance=10000;
		if(balance<30000)
		{
			throw new ArithmeticException();
		}
		
	}
	
	public static void main(String[] args)
	{
		BankAccount ba = new BankAccount();
		ba.show();
	}
}
