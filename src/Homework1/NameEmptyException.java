package Homework1;

public class NameEmptyException extends Exception {
	public String getMessage() {
		return "The employee name should not be empty";
	}
}
