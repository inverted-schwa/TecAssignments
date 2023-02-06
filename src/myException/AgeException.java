package myException;

public class AgeException extends Exception {
	@Override
	public String getMessage() {
		return "Trying to return an invalid age";
	}
}
