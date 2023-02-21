package MoB.dao;

import java.util.LinkedList;
import java.util.List;

import MoB.pojo.*;

public class BookDao {
	public List<Book> booklist;
	public List<User> userList;
	public void BookDao() {
	booklist = new LinkedList<Book>();
	Book b1 = new Book("Bible", "God", "It's the bible!", 1);
	booklist.add(b1);
	Book b2 = new Book("Fight Club", "Chuck Pahlaniuk", "It's Fight Club!", 2);
	booklist.add(b2);
	Book b3 = new Book("History 101", "James Smith", "It's history!", 3);
	booklist.add(b3);
	Book b4 = new Book("How to Do Stuff", "Edward McGill", "A convenient guide to life!", 4);
	booklist.add(b4);
	Book b5 = new Book("How to Win Friends and Influence People", "Dale Carnegie", "The classic self-help book!", 5);
	booklist.add(b5);
	
	List<Book> newBooksU1 = new LinkedList<Book>();
		newBooksU1.add(b2);
		newBooksU1.add(b4);
	List<Book> newBooksU2 = new LinkedList<Book>();
		newBooksU2.add(b1);
		newBooksU2.add(b5);
	List<Book> newBooksU3 = new LinkedList<Book>();
		newBooksU2.add(b1);
		newBooksU2.add(b3);
	List<Book> newBooksU4 = new LinkedList<Book>();
		newBooksU2.add(b5);
		newBooksU2.add(b3);
	List<Book> completedBooksU1 = new LinkedList<Book>();
		newBooksU2.add(b2);
		newBooksU2.add(b3);
	List<Book> completedBooksU2 = new LinkedList<Book>();
		newBooksU2.add(b4);
		newBooksU2.add(b2);
	List<Book> completedBooksU3 = new LinkedList<Book>();
		newBooksU2.add(b5);
		newBooksU2.add(b2);
	List<Book> completedBooksU4 = new LinkedList<Book>();
		newBooksU2.add(b4);
		newBooksU2.add(b3);
		
		userList= new LinkedList<User>();
		User u1 = new User("Jim Jones", 1000, "jim.jones@gmail.com", "pass", newBooksU1 , booklist.get(1) ,completedBooksU1);
		User u2 = new User("Jane Jones", 1001, "jane.jones@gmail.com", "pass",newBooksU2,booklist.get(4),completedBooksU2);
		User u3 = new User("Jill Jones", 1002, "Jill.jones@gmail.com", "pass",newBooksU3,booklist.get(3),completedBooksU3);
		User u4 = new User("Jake Jones", 1003, "Jake.jones@gmail.com", "pass",newBooksU4,booklist.get(0),completedBooksU4);
		userList.add(u1);
		userList.add(u2);
		userList.add(u3);
		userList.add(u4);
	}
}
