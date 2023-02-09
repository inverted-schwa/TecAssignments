package employeeExample.app;
import employeeExample.service.EmployeeService;

public class AppMain {
	public static void main(String[]args)
	{
		EmployeeService eserv = new EmployeeService();
		eserv.insertData();
		eserv.show();
		eserv.deleteData();
		eserv.show();
		eserv.updateData();
		eserv.show();
	}
}
