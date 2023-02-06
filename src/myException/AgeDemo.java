package myException;
import java.util.*;
public class AgeDemo {
	private Scanner sc;
	int age;
	public AgeDemo()
	{
		sc=new Scanner(System.in);
	}
	//throws defines the list of exceptions which can come in the method
	//but it will not be handled in current method, will be handled in calling method
	
	public void accept() throws AgeException

	{	
		System.out.println("Enter AGe");
		age=sc.nextInt();
		
		if(age<18)
		{
			throw new AgeException();
		}
	
	}
	
	public static void main(String[] args) {
		AgeDemo aged=new AgeDemo();
		try
		{
		aged.accept();
		}
		catch(AgeException ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}