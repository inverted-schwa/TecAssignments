package employeeExample.service;
import java.util.*;
import employeeExample.dao.*;
import employeeExample.pojo.*;

public class EmployeeService {
	private Scanner sc;
	private EmployeeDao edao;
	public EmployeeService()
	{
		sc=new Scanner(System.in);
		edao=new EmployeeDao();
	}
	
	public void insertData()
	{
		System.out.println("Enter how many emplyoyees you want ");
		int noofemployee=sc.nextInt();
		for(int x=1;x<=noofemployee;x++)
		{
			Employee e=new Employee();
			System.out.println("Enter Employee id ");
			e.setEmpid(sc.nextInt());
			System.out.println("Enter Employee name ");
			e.setEmpname(sc.next());
			System.out.println("Enter employee salary");
			e.setSalary(sc.nextDouble());
			edao.insert(e);
		}
	}
	public void deleteData() {
		System.out.println("Enter employee id you want to delete");
		int empID=sc.nextInt();
		edao.delete(empID);
	}
	public void updateData() {
		System.out.println("Enter employee id you want to update");
		int empID=sc.nextInt();
		System.out.println("Enter new employee name");
		String empName= sc.next();
		edao.update(empID, empName);
	}
	public void show()
	{
		edao.display();
	}
}