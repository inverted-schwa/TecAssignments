package employeeExample.dao;
import java.util.*;
import employeeExample.pojo.*;

public class EmployeeDao {
	//private List<Employee> emplist;
	private Set<Employee> empset;
	public EmployeeDao()
	{
		//empset=new ArrayList<Employee>();
		empset=new HashSet<Employee>();
	}
	public void insert(Employee e)
	{
		empset.add(e);
	}
	public void delete(int eid) {
		Employee edelete=null;
		for (Employee e:empset)
		{
			if(e.getEmpid()==eid)
			{
				edelete = e;
			}
		}
		empset.remove(edelete);
		System.out.println("Employee "+eid+" removed");
	}
	public void update(int eid, String name)
	{
		for (Employee e:empset)
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
		for(Employee e: empset) {
			System.out.println("Employee name is " +e.getEmpname()+" ane employee salary is "+e.getSalary());
		}
	}
}
