package day7;
import java.util.*;

public class MultiExceptions {
	private Scanner sc;
	int arr[];
	public MultiExceptions()
	{
		sc = new Scanner(System.in);
		arr = new int[4];
	}
	public void accept()
	{
		for(int x=0;x<arr.length;x++)
		{System.out.println("enter any number");
		arr[x]=sc.nextInt();
		}
	}
	public void divide()
	{
	System.out.println("Enter index number for first value");
	int index1=sc.nextInt();
	System.out.println("Enter index number for second valuye");
	int index2=sc.nextInt();
	try
	{
	double result=arr[index1]/arr[index2];
	System.out.println("Result is "+result);
	}
	catch(ArithmeticException ex)
	{
		System.out.println("Trying to divide by zero");
	}
	catch(ArrayIndexOutOfBoundsException ex)
	{
		System.out.println("Trying to access beyond limit");
	}
	}

	public static void main(String[] args)
	{
		MultiExceptions me = new MultiExceptions();
		me.accept();
		me.divide();
	}
}
