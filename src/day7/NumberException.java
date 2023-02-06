package day7;
import java.util.*;

public class NumberException {
	private Scanner sc;
	int num1;
	int num2;
	
	public void accept() {
		sc=new Scanner(System.in);
		System.out.println("Enter a number");
		String data = sc.next();
		try
		{
		num1 = Integer.parseInt(data);
		}catch(NumberFormatException ex)
		{
			System.out.println("Number Format Exception");
		}
	}
	public static void main(String[] args)
	{
		NumberException ne = new NumberException();
		ne.accept();		
	}
}
