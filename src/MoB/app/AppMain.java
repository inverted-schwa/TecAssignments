package MoB.app;

import java.util.Scanner;

import MoB.app.AppMain;
import MoB.service.*;

public class AppMain {
	public BookService bserv = new BookService();
	public static UserService userv = new UserService();

	Scanner sc;
	boolean loggedin=false;
	
	public static void main(String[]args)
	{
		AppMain am = new AppMain();
		am.login();
	}
	
	public void login() {
		sc=new Scanner(System.in);
		do {
		System.out.println("Please enter your user name:");
		String uname= sc.nextLine();
		System.out.println("Please enter your pass word:");
		String pass= sc.nextLine();
		loggedin = userv.checkLogin(uname, pass);
		}while(loggedin==false);
		menu();
	}
	
	public void menu() {
		sc=new Scanner(System.in);
		int option=1;
		while(option!=5) {
			System.out.println("--------------------------");
			System.out.println("|Logged in as "+userv.udao.login.getUserName()+"|");
			System.out.println("--------------------------");
			System.out.println("Enter your selection ");
			System.out.println("1. View Book List");
			System.out.println("2. View a Book description");
			System.out.println("3. Add a book");
			System.out.println("4. View my favorites");
			System.out.println("5. View my new books");
			System.out.println("6. Log Out");
			option = sc.nextInt();
			switch(option)
			{
			case 1:
				bserv.viewBookList();
				break;
			case 2:
				bserv.viewBookDescription();
				break;
			case 3:
				bserv.addBook();
				break;
			case 4:
				userv.viewFavorites();
				break;
			case 5:
				userv.viewNew();
				break;
			case 6:
				loggedin=false;
				userv.logout();
				login();
			}
		}
	}
}
