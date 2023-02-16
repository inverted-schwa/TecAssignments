package day13;
import java.util.*;
public class AccountCustomer implements AccountInterface{
	String name;
	String address;
	Scanner sc;
	@Override
	public void acceptPersonalDetails() {
		sc=new Scanner(System.in);
		System.out.println("Enter the name of the customer");
		this.name=sc.next();
		System.out.println("Enter the address of the customer");
		this.address=sc.next();
		
	}
	
	public static void main(String [] args) {
		AccountCustomer ac= new AccountCustomer();
		ac.acceptPersonalDetails();
	}
}
