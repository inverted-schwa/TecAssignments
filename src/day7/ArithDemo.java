package day7;
import java.util.*;

public class ArithDemo {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int number1;
	int number2;
	System.out.println("Enter number 1");
	number1=sc.nextInt();
	System.out.println("Enter number 2");
	number2=sc.nextInt();
	try {
	double result=number1/number2;
	System.out.println("Result is "+result);
	}
	catch(ArithmeticException ex)
	
	{
		System.out.println("Trying to divide number bty zero");
		
	}
	}
}
