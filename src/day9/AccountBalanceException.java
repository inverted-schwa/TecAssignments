package day9;

public class AccountBalanceException extends Exception{
	@Override
	public String getMessage() {
		return "The Account Balance is Insufficient";
	}
}
