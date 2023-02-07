package day9;
import java.util.*;
public class BankAccount {
	public Scanner sc;
	public double balance=10000;
	public synchronized void withdraw(double amount) throws AccountBalanceException {
		sc = new Scanner(System.in);
		if(amount>this.balance)
		{
			throw new AccountBalanceException();
		}
		balance -= amount;
		System.out.println("The remaining balance is "+ balance);

	}
	
}
