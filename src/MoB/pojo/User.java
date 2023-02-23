package MoB.pojo;

import MoB.pojo.*;
import java.util.*;

public class User {
	public String userName;
	public int userID;
	public String email;
	public String password;
	public User(String uname, int uID, String email, String password)
	{
		this.userName = uname;
		this.userID=uID;
		this.email=email;
		this.password=password;
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

	/*
	public void listBooks(Book[] books) {
		for(Book b:books) {
			System.out.println(b.bookName);
			System.out.println(b.authorName);
			System.out.println(b.description);
			
		}
	}
	*/
}
