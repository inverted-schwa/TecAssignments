package MoB.service;

import java.util.*;
import MoB.dao.*;
import MoB.pojo.*;
public class BookService {
	BookDao bdao = new BookDao();
	public Scanner sc;
	public void viewBookList() {
		for(Book b:bdao.booklist)
		{
			System.out.println(b.bookName+" by "+b.authorName);
		}
	}
	public void addBook() {
		sc = new Scanner(System.in);
		Book b = new Book();
		System.out.println("Enter the name of the book:");
		b.authorName=sc.next();
		System.out.println("Enter the author of the book:");
		b.bookName=sc.next();
		System.out.println("Enter the description of the book:");
		b.description=sc.next();
		bdao.booklist.add(b);
		System.out.println("Book added");
	}
	public void viewFavorites() {
		//for(Book b:)
	}
	public void viewNew() {
		
	}
}
