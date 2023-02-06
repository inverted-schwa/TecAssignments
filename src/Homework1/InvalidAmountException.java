package Homework1;

public class InvalidAmountException extends Exception {
	@Override
	public String getMessage() {
		return "Trying to return an invalid amount greater than 50000";
	}
}
