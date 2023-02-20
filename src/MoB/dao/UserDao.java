package MoB.dao;

import MoB.pojo.*;

public class UserDao {
	Book[] booklist = new Book[5];
	{
	booklist[0] = new Book("Bible", "God", "It's the bible!", 1);
	booklist[1] = new Book("Fight Club", "Chuck Pahlaniuk", "It's Fight Club!", 2);
	booklist[2] = new Book("History 101", "James Smith", "It's history!", 3);
	booklist[3] = new Book("How to Do Stuff", "Edward McGill", "A convenient guide to life!", 4);
	booklist[4] = new Book("How to Win Friends and Influence People", "Dale Carnegie", "The classic self-help book!", 5);
	}
	Book[] newBooksU1 = new Book[2];{
	newBooksU1[0] = booklist[2];
	newBooksU1[1] = booklist[3];
	}
	Book[] newBooksU2 = new Book[2];{
		newBooksU2[0] = booklist[0];
		newBooksU2[1] = booklist[4];
	}
	Book[] newBooksU3 = new Book[2];
	{
		newBooksU3[0] = booklist[1];
		newBooksU3[1] = booklist[3];
	}
	Book[] newBooksU4 = new Book[2];
	{
		newBooksU4[0] = booklist[2];
		newBooksU4[1] = booklist[4];
	}
	Book[] completedBooksU1 = new Book[2];
	{
		completedBooksU1[0] = booklist[1];
		completedBooksU1[1] = booklist[2];
	}
	Book[] completedBooksU2 = new Book[2];
	{
		completedBooksU2[0] = booklist[3];
		completedBooksU2[1] = booklist[1];
	}
	Book[] completedBooksU3 = new Book[2];
	{
		completedBooksU3[0] = booklist[4];
		completedBooksU3[1] = booklist[1];
	}
	Book[] completedBooksU4 = new Book[2];
	{
		completedBooksU4[0] = booklist[3];
		completedBooksU4[1] = booklist[2];
	}
	User[] userList=new User[4];
	{
	userList[0] = new User("Jim Jones", 1000, "jim.jones@gmail.com", "pass",newBooksU1,booklist[2],completedBooksU1);
	userList[1] = new User("Jane Jones", 1001, "jane.jones@gmail.com", "pass",newBooksU2,booklist[4],completedBooksU2);
	userList[2] = new User("Jill Jones", 1002, "Jill.jones@gmail.com", "pass",newBooksU3,booklist[3],completedBooksU3);
	userList[3] = new User("Jake Jones", 1003, "Jake.jones@gmail.com", "pass",newBooksU4,booklist[0],completedBooksU4);
	}
	
	public boolean checkLogin(String uname, String pass) {
		for(User user:userList) {
			if((user.getUserName().equals(uname))&&(user.getPassword().equals(pass))) {
				return true;
			}
		}
		return false;
	}
}
