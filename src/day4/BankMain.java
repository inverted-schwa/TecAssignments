package day4;
import java.util.*;

public class BankMain {
	static Scanner sc;
	public static BankAccount[] ba;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ba = new BankAccount[5];
		ba[0] = new BankAccount("BA1000", "JohnSmith", "Checking", 900, 3);
		ba[1] = new BankAccount("BA1001", "JaneSmith", "Saving", 1000.50, 6);
		ba[2] = new BankAccount("BA1002", "AdamSmith", "Saving", 876.44, 10);
		ba[3] = new BankAccount("BA1003", "RitaJohnson", "Checking", 3546.87, 4);
		ba[4] = new BankAccount("BA1004", "EdwinMeadows", "Saving", 11000.50, 2);
		sc =new Scanner(System.in);
		int choice;
		do {
			System.out.println("Welcome to the Banking App");
			System.out.println("Please make a selection:");
			System.out.println("1. Enter Account Information");
			System.out.println("2. Display Information about a Customer");
			System.out.println("3. Deposit");
			System.out.println("4. Withdraw");
			System.out.println("5. Exit");
			choice = sc.nextInt();
			switch(choice) {
			case 1: 
				enterData();
				break;
			case 2:
				display();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				break;
			}
			
		}while(choice!=5);
		
	}

	public static void enterData()
	{
		System.out.println("Please enter the data: ");
	}
	public static void display()
	{
		System.out.println("Data: ");
		for(BankAccount b:ba) {
			System.out.println("Customer account number: "+b.accnum);
			System.out.println("Customer name: "+b.accname);
			System.out.println("Customer Balance: "+b.accbalance);
			System.out.println("Number of Transactions: "+b.numtransactions);
		}

	}
	public static void deposit()
	{	
		sc = new Scanner(System.in);
		System.out.println("Deposit ");
		System.out.println("Enter Customer Account Number or Name");
		String info = sc.nextLine();
		for(BankAccount b:ba) {
			System.out.println("variable="+info);
			System.out.println(b.accname+"=="+info+(b.accname==info));
			System.out.println(b.accnum+"=="+info+(b.accnum==info));
			if((info==b.accname)||(info==b.accnum))
			{
				System.out.println("Enter amount to deposit: ");
				double amount = sc.nextDouble();
				b.accbalance+=amount;
				System.out.println("The customer "+b.accname+"'s balance is: "+b.accbalance);
			}
			else {System.out.println("Trying Next");}
		}
	}
	public static void withdraw()
	{
		System.out.println("Withdraw ");
	}
}
