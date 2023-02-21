package MoB.dao;

import MoB.pojo.*;

public class UserDao {
	public BookDao bd = new BookDao();
	public User login;
	public UserDao() {
		}

	public boolean checkLogin(String uname, String pass) {
		for(User user:bd.userList) {
			if((user.getUserName().equals(uname))&&(user.getPassword().equals(pass))) {
				login = user;
				System.out.println("The login is:" + user);
				return true;
			}
		}
		System.out.println("Incorrect credentials");
		System.out.println("The correct logins are: ");
		for(User u:bd.userList) {
			System.out.println("Username: "+u.userName+" Password: "+u.password);
		}
		System.out.println("");
		return false;
	}
	
	public void viewFavorites() {
		System.out.println(login.getFavorite());
	}
	public void viewNew() {
		System.out.println(login.getNewBooks());
	}
	
	public void logout() {
		login = null;
		System.out.println("You are now logged out. The current user is "+login);
	}
}
