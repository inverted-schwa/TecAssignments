package magicOfBooks;
import java.util.*;

public class MagicOfBooks {
	static boolean isLoggedIn = false;
	User[] userList=new User[4];
	{
	userList[0] = new User("Jim Jones", 1000, "jim.jones@gmail.com", "pass",null,null,null);
	userList[1] = new User("Jane Jones", 1001, "jane.jones@gmail.com", "pass",null,null,null);
	userList[2] = new User("Jill Jones", 1002, "Jill.jones@gmail.com", "pass",null,null,null);
	userList[3] = new User("Jake Jones", 1003, "Jake.jones@gmail.com", "pass",null,null,null);
	}
	User current;
	Book[] booklist = new Book[5];
	{
	booklist[0] = new Book("Bible", "God", "It's the bible!", 1);
	booklist[1] = new Book("Fight Club", "Chuck Pahlaniuk", "It's Fight Club!", 2);
	booklist[2] = new Book("History 101", "James Smith", "It's history!", 1);
	booklist[3] = new Book("How to Do Stuff", "Edward McGill", "A convenient guide to life!", 1);
	booklist[4] = new Book("How to Win Friends and Influence People", "Dale Carnegie", "The classic self-help book!", 1);
	}
	public Scanner sc;
	
	public static void main(String []args) {
		MagicOfBooks mob = new MagicOfBooks();
		do {
		mob.logIn();
		}while(mob.current==null);
		do {
		mob.menu();
		}while(isLoggedIn);
	}
	
	public void logIn() {
		sc = new Scanner(System.in);
		System.out.println("Please enter the user name: ");
		String uname =  sc.nextLine();
		System.out.println("Please enter the password: ");
		String password = sc.nextLine();
		checkPass(uname, password);
	}
	
	public void checkPass(String username, String password) {
		for(User u:userList)
		{
			if(username.equals(u.userName))
			{
				if(password.equals(u.password))
				{
					isLoggedIn=true;
					this.current=u;
					System.out.println("You are now logged in as "+this.current.userName);
				}
			}
		}
		if(this.current==null) {
			System.out.println("Not a valid login combination");
		}
	}
	
	public void menu()
	{
		do {
		System.out.println("-=Welcome to the Magic of Books=-");
		System.out.println("User: "+ this.current.userName +" Email: " + this.current.email);
		System.out.println("1. Browse books");
		System.out.println("2. Search for a book");
		System.out.println("3. See completed books");
		System.out.println("4. See favorite book");
		System.out.println("5. List Users");
		System.out.println("6. Quit");
		
int choice = sc.nextInt();
		switch(choice) {
		case 1:
			this.listBooks();
			break;
		case 2:
			this.searchBook();
			break;
		case 3:
			this.listCompleted();
			break;
		case 4:
			this.listFave();
			break;
		case 5:
			this.listUsers();
			break;
		case 6:
			current=null;
			isLoggedIn=false;
			logIn();
			break;
		}
	}while(isLoggedIn);
	}
	
	public void listBooks() {
		for(Book b: booklist)
		{
			System.out.println(b.bookName+" by "+b.authorName+"/n "+b.description);
		}
	}
	
	public void searchBook() {
		sc = new Scanner(System.in);
		System.out.println("Enter the book name or author: ");
		String search = sc.next();
		for(Book b: booklist)
		{
			if(b.authorName.equals(search)||b.bookName.equals(search))
			{
				b.printDetails();
			}
		}
	}
	
	public void listUsers() {
		for(User u:userList)
		{
			System.out.println(u.userName);
			System.out.println(u.email);
			System.out.println(u.userID);
		}
	}
	
	public void listCompleted() {
		
	}
	
	public void listFave() {
		
	}
}

