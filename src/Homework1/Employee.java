package Homework1;
import java.util.*;
public abstract class Employee {
	long employeeId;
	String employeeName;
	String employeeAddress;
	Long employeePhone;
	double basicSalary;
	double salary;
	double specialAllowance=250.80;
	double Hra=1000.50;
	public void Employee(long Id, String Name, String address, long phone,double basicSalary)
	{
		this.employeeId=Id;
		this.employeeName=Name;
		this.employeeAddress=address;
		this.employeePhone=phone;
		this.basicSalary=basicSalary;
	}
	public void calculateSalary() {
		double salary = basicSalary*(specialAllowance/100) +(basicSalary*Hra/100);
		this.salary= salary;
		System.out.println("The salary is "+salary);
	}
	
	public abstract double calculateTransportAllowance();
}
