package day5;
import java.util.*;
public abstract class Employee {
	protected Scanner sc;
	private int empid;
	private String empname;
	
	public Employee()
	{
		sc=new Scanner(System.in);
	}
	
	public void accept() {
		System.out.println("Enter employee ID ");
		empid = sc.nextInt();
		System.out.println("Enter Employee Name ");
		empname = sc.next();
	}
	
	public void display() {
		System.out.println("Employee ID is "+empid);
		System.out.println("Employee Name is "+empname);

	}
public abstract void calculateSalary();
}
