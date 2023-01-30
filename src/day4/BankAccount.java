/*
 * Lets create a bank account. Create a class named 'BankAccount' with the following data members
1 - Name of depositor
2 - Address of depositor
3 - Type of account
4 - Balance in account
5 - Number of transactions
Class 'BankAccount' has a method for each of the following 1 - Generate a unique account number for each depositor
For first depositor, account number will be BA1000, for second depositor it will be BA1001 and so on
2 - Display information and balance of depositor
3 - Deposit more amount in balance of any depositor
4 - Withdraw some amount from balance deposited
5 - Change address of depositor
After creating the class, do the following operations
1 - Enter the information (name, address, type of account, balance) of the depositors. Number of depositors are to be entered by user.
2 - Print the information of any depositor.
3 - Add some amount to the account of any depositor and then display final informaion of that depositor
4 - Remove some amount from the account of any depositor and then display final informaion of that depositor
5 - Change the address of any depositor and then display the final information of that depositor
6 - Randomly repeat these processes for some other bank accounts and after that print the total number of transactions.
5.
Write a program to create a directory that contains the following information.
 */

package day4;
import java.util.*;

public class BankAccount {
	private int accnumcounter=1;
	private String accnum;
	private String accname;
	private String acctype;
	private double accbalance;
	private int numtransactions;
	private BankAccount[] ba=new BankAccount[10];
	public String getAccnum() {
		return accnum;
	}
	public void setAccnum(String accnum) {
		this.accnum = accnum;
	}
	public String getAccname() {
		return accname;
	}
	public void setAccname(String accname) {
		this.accname = accname;
	}
	public String getAcctype() {
		return acctype;
	}
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}
	public double getAccbalance() {
		return accbalance;
	}
	public void setAccbalance(double accbalance) {
		this.accbalance = accbalance;
	}
	public int getNumtransactions() {
		return numtransactions;
	}
	public void setNumtransactions(int numtransactions) {
		this.numtransactions = numtransactions;
	}
	
	private static Scanner sc;
	
	public static void main(String[] args)
	{
		sc=new Scanner(System.in);
		public int choice;
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
	
	public void enterData()
	{
		
	}
	public void display()
	{
		
	}
	public void deposit()
	{
		
	}
	public void withdraw()
	{
		
	}
}
