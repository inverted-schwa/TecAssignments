package myException;

public class InvalidAmountException extends Exception {
	@Override
	public String getMessage() {
		return "Trying to return an invalid amount less than 1000";
	}
}
