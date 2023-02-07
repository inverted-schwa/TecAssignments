package day9;

public class BankAcctMain {
	public static void main(String[] args)
	{
		BankAccount ba=new BankAccount();
		User1 u1 = new User1(ba);
		User2 u2 = new User2(ba);
		u1.start();
		u2.start();
	}
}
