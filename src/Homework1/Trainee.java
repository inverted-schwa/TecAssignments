package Homework1;

public class Trainee extends Employee {
	public Trainee(long Id,String Name, String Address, long Phone, double basicSalary)
	{
		super.employeeId=Id;
		super.employeeName=Name;
		super.employeeAddress=Address;
		super.employeePhone=Phone;
		super.basicSalary=basicSalary;
	}

	@Override
	public double calculateTransportAllowance() {
		// TODO Auto-generated method stub
		double transportAllowance = 10.0/100*this.basicSalary;
		return transportAllowance;
	}
}
