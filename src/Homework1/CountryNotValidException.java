package Homework1;

public class CountryNotValidException extends Exception{
	public String getMessage() {
		return "The employee should be an Indian citizen for calculating tax";
	}
}
