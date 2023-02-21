package MoB.service;

import java.util.*;
import MoB.dao.*;
import MoB.pojo.*;
public class BookService {
	BookDao bdao = new BookDao();
	public Scanner sc;
	public void viewBookList() {
		int x = 1;
		for(Book b:bdao.booklist)
		{
			System.out.println(x+". " + b.bookName+" by "+b.authorName);
			x++;
		}
	}
	
	public void viewBookDescription() {
		sc=new Scanner(System.in);
		System.out.println("Please enter the book that you would like to read the description: ");
		int selection = sc.nextInt();
		bdao.getBookDesc(selection);
		
	}
	
	public void addBook() {
		sc = new Scanner(System.in);
		Book b = new Book();
		System.out.println("Enter the name of the book:");
		b.bookName=sc.nextLine();
		System.out.println("Enter the author of the book:");
		b.authorName=sc.nextLine();
		System.out.println("Enter the description of the book:");
		b.description=sc.nextLine();
		bdao.booklist.add(b);
		System.out.println("Book added");
	}
}
