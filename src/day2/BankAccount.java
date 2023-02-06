package day2;
import java.util.*;

public class BankAccount {
	static String custname;
	static String address;
	static double balance;
	static double interest;
	static Scanner scobj;
	
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.accept(); 
		b.calculateInterest();
	}
	
	public static void accept() {
		scobj = new Scanner(System.in);
		System.out.println("What is the customer name?");
		custname = scobj.nextLine();
		System.out.println("What is the customers address?");
		address = scobj.nextLine();
		System.out.println("What is the customer's balance?");
		String stringBalance = scobj.next();
		balance = Double.parseDouble(stringBalance);
	}
	
	public static void calculateInterest() {
		interest=balance*0.07;
		System.out.println("The interest is "+interest);
	}
}
