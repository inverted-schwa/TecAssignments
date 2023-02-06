package day5;

public class PermanentEmployee extends Employee {
	private double salary;
	
	@Override
	public void accept()
	{
		super.accept();
		System.out.println("Enter Salary");
		salary=sc.nextDouble();
	}
	
	@Override
	public void display()
	{
		super.display();
		System.out.println("Salary is "+salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermanentEmployee pemp=new PermanentEmployee();
		pemp.accept();
		pemp.display();
	}
	public void calculateSalary() {
		System.out.println("Writing for permanent employee");
		
	}
}
