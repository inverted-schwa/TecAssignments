package day2;
import java.util.*;
/*
 * A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
Ask user for their salary and year of service and print the net bonus amount.


Take 10 integers from keyboard using loop and print their average value on the screen.

Take integer inputs from user until he/she presses q ( Ask to press q to quit after every integer input ). Print average and product of all numbers.
 */
public class Bonus1 {
	double salary;
	int years;
	Scanner sc;
	
	public void accept() {
		sc = new Scanner(System.in);
		System.out.println("What is the salary?");
		salary = sc.nextDouble();
		System.out.println("How many years of service? ");
		years = sc.nextInt();
	}
	
	public static void main(String[] args) {
		Bonus1 b = new Bonus1();
		b.accept();
		if(b.years > 5) {
			System.out.println("The net bonus is "+(b.salary*.05));
		}
		else System.out.println("The net bonus is 0");
	}
	
}
