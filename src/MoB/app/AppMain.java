package MoB.app;

import java.util.Scanner;

import MoB.app.AppMain;
import MoB.service.*;

public class AppMain {
	BookService bserv = new BookService();
	UserService userv = new UserService();

	Scanner sc;
	boolean loggedin=false;
	
	public static void main(String[]args)
	{
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
			System.out.println("1. View Book List");
			System.out.println("2. Add a book");
			System.out.println("3. View my favorites");
			System.out.println("4. View my new books");
			System.out.println("5. Log Out");
			option = sc.nextInt();
			switch(option)
			{
			case 1:
				bserv.viewBookList();
				break;
			case 2:
				bserv.addBook();
				break;
			case 3:
				bserv.viewFavorites();
				break;
			case 4:
				bserv.viewNew();
				break;
			case 5:
				loggedin=false;
				userv.logout();
				login();
			}
		}
	}
}
