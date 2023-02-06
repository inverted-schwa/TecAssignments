package Homework1;
import java.util.*;

public class TaxCalculator {
	public String empname;
	public boolean isIndian;
	public double empSal;
	public Scanner sc;
	
	public double calculateTax (String empname, boolean isIndian, double empSal) throws InvalidAmountException {
		double taxAmount=0;
		if((empSal>50000)||(empSal<0))
		{
			throw new InvalidAmountException();
		}
		
		if((empSal>0)&&(empSal<10000)&&isIndian)
		{
			taxAmount = empSal*8/100;
		}
		else if((empSal>10000)&&(empSal<30000)&&isIndian)
		{
			taxAmount = empSal*6/100;
		}
		else if((empSal>30000)&&(empSal<50000)&&isIndian)
		{
			taxAmount = empSal*4/100;
		}
		return taxAmount;
	}
	
	public void accept() throws CountryNotValidException,NameEmptyException{
		String nationality="";
		System.out.println("Please enter the employee name");
		
		sc=new Scanner(System.in);
		this.empname=sc.next();
		if(this.empname.equals("null"))
		{
			throw new NameEmptyException();
		}
		System.out.println("Please enter the employee nationality");
		nationality=sc.next();
		if(nationality.matches("Indian")) {
			this.isIndian = true;
		} else {
			this.isIndian = false;
			throw new CountryNotValidException();
		}
		System.out.println("Please enter the employee salary");
		this.empSal=sc.nextDouble();
		
	}
	
	public static void main (String[] args)
	{
		double taxAmount=0;
		TaxCalculator tc= new TaxCalculator();
		try {
		tc.accept();
		}catch(CountryNotValidException cnve) {
			System.out.println(cnve.getMessage());
		}
		catch(NameEmptyException nee)
		{
			System.out.println(nee.getMessage());
		}
		try {
		taxAmount=tc.calculateTax(tc.empname, tc.isIndian, tc.empSal);
		}catch(InvalidAmountException iae) {
			System.out.println(iae.getMessage());
		}
		
		System.out.println("The tax amount is "+taxAmount);
	}
}
