package MoB.dao;

import MoB.pojo.*;
import MoB.dao.*;
import java.util.*;

public class UserDao {
	public BookDao bd = new BookDao();
	public User login;
	public UserDao() {
		}

	public boolean checkLogin(String uname, String pass) {
		for(User user:bd.userList) {
			if((user.getUserName().equals(uname))&&(user.getPassword().equals(pass))) {
				login = user;
				return true;
			}
		}
		return false;
	}
	
	public void logout() {
		login = null;
	}
}
