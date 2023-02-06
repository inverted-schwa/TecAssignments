package Homework1;

public class Manager extends Employee{
	public Manager(long Id,String Name, String Address, long Phone, double basicSalary)
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
		double transportAllowance = 15.0/100*this.basicSalary;
		return transportAllowance;
	}
}
