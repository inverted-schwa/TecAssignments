package day13;

import java.util.Scanner;

public class CurrentAccountCustomer implements AccountInterface {
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
		CurrentAccountCustomer cac= new CurrentAccountCustomer();
		cac.acceptPersonalDetails();
	}
}
