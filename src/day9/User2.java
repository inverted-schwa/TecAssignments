package day9;

public class User2 extends Thread{
	private BankAccount ba;
	public User2(BankAccount ba) {
		this.ba=ba;
	}
	public void run() {
		try {
			ba.withdraw(7000);
		} catch (AccountBalanceException abe) {
			System.out.println(abe.getMessage());
		}

	}
}
