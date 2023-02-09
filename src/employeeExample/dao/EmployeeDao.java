package employeeExample.dao;
import java.util.*;
import employeeExample.pojo.*;

public class EmployeeDao {
	private List<Employee> emplist;
	public EmployeeDao()
	{
		emplist=new ArrayList<Employee>();
	}
	public void insert(Employee e)
	{
		emplist.add(e);
	}
	public void delete(int eid) {
		Employee edelete=null;
		for (Employee e:emplist)
		{
			if(e.getEmpid()==eid)
			{
				edelete = e;
			}
		}
		emplist.remove(edelete);
		System.out.println("Employee "+eid+" removed");
	}
	public void update(int eid, String name)
	{
		for (Employee e:emplist)
		{
			if(e.getEmpid()==eid)
			{
				e.setEmpname(name);;
				System.out.println("Employee "+e.getEmpid()+"'s name changed to "+e.getEmpname());
			}
		}
		System.out.println("Update completed");
	}
	public void display()
	{
		for(Employee e: emplist) {
			System.out.println("Employee name is " +e.getEmpname()+" ane employee salary is "+e.getSalary());
		}
	}
}
