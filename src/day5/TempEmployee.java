package day5;

public class TempEmployee extends Employee{
	double contractAmount;
	int contractDuration;
	
	@Override
	public void accept()
	{
		super.accept();
		System.out.println("Enter Contract Amount");
		contractAmount=sc.nextDouble();
		System.out.println("Enter Contract Duration in months");
		contractDuration=sc.nextInt();
	}
	
	@Override
	public void display()
	{
		super.display();
		System.out.println("Contract Amount is "+contractAmount+".");
		System.out.println("Contract Duration is "+contractDuration+" months.");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TempEmployee temp=new TempEmployee();
		//temp.accept();
		//temp.display();
		Employee empobj;
		System.out.println("Want to call for permanent employee");
		empobj=new PermanentEmployee();
		empobj.accept();
		empobj.display();
		empobj.calculateSalary();
		System.out.println("Want to call for temp employee");
		empobj=new TempEmployee();
		empobj.calculateSalary();
	}
	@Override
	public void calculateSalary() {
		System.out.println("Writing for temp employee");
		
	}
}
