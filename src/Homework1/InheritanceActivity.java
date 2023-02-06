package Homework1;

public class InheritanceActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long Id=126534;
		long phone=237844;
		Manager m = new Manager(Id,"Peter","Chennai India", phone, 65000.00);
		m.calculateSalary();
		System.out.println("The transport allowance for "+m.employeeName+" is "+m.calculateTransportAllowance());
		long id2=29846;
		long phone2=442085;
		Trainee t = new Trainee(id2, "Jack", "Mumbai, India", phone2, 45000.00);
		t.calculateSalary();
		System.out.println("The transport allowance for "+t.employeeName+" is "+t.calculateTransportAllowance());
	}

}
