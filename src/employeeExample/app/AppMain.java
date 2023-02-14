package employeeExample.app;
import java.util.Scanner;

import employeeExample.service.*;
public class AppMain {
	EmployeeService eserv = new EmployeeService();
	UserService userv = new UserService();
	Scanner sc;
	boolean loggedin=false;
	public static void main(String[]args)
	{
		/*eserv = new EmployeeService();
		eserv.insertData();
		eserv.show();
		eserv.deleteData();
		eserv.show();
		eserv.updateData();
		eserv.show();*/
		AppMain am = new AppMain();
			do {
				am.login();
			}while(am.loggedin==false);
		am.menu();
	}
	
	public void login() {
		sc=new Scanner(System.in);
		System.out.println("Please enter your user name:");
		String uname= sc.next();
		System.out.println("Please enter your pass word:");
		String pass= sc.next();
		loggedin=userv.checkLogin(uname, pass);
	}
	
	public void menu() {
		sc=new Scanner(System.in);
		int option=1;
		while(option!=5) {
			System.out.println("Enter your selection ");
			System.out.println("1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. Update");
			System.out.println("4. View");
			System.out.println("5. Exit");
			option = sc.nextInt();
			switch(option)
			{
			case 1:
				eserv.insertData();
				break;
			case 2:
				eserv.deleteData();
				break;
			case 3:
				eserv.updateData();
				break;
			case 4:
				eserv.show();
				break;
			case 5:
				System.exit(0);
				System.out.println("Exiting");
			}
		}
	}
}
