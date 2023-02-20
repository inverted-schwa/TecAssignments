package MoB.pojo;

import MoB.pojo.*;

public class User {
	public String userName;
	public int userID;
	public String email;
	public String password;
	public Book[] newBooks;
	public Book favorite;
	public Book[] completed;
	public User(String uname, int uID, String email, String password, Book[] newBooks, Book favorite, Book[] completed)
	{
		this.userName = uname;
		this.userID=uID;
		this.email=email;
		this.password=password;
		this.newBooks = newBooks;
		this.favorite=favorite;
		this.completed=completed;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Book[] getNewBooks() {
		return newBooks;
	}
	public void setNewBooks(Book[] newBooks) {
		this.newBooks = newBooks;
	}
	public Book getFavorite() {
		return favorite;
	}
	public void setFavorite(Book favorite) {
		this.favorite = favorite;
	}
	public Book[] getCompleted() {
		return completed;
	}
	public void setCompleted(Book[] completed) {
		this.completed = completed;
	}
	public void listBooks(Book[] books) {
		for(Book b:books) {
			System.out.println(b.bookName);
			System.out.println(b.authorName);
			System.out.println(b.description);
			
		}
	}
}
