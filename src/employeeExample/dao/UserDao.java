package employeeExample.dao;
import employeeExample.pojo.*;
import java.util.*;

public class UserDao {
	private Set<User> users = new HashSet<User>();
	public UserDao() {
		User u1 = new User("user1","pass1");
		users.add(u1);
		User u2 = new User("user2","pass2");
		users.add(u2);
		User u3 = new User("user3","pass3");
		users.add(u3);
	}
	
	public boolean checkLogin(String uname, String pass) {
		for(User user:users) {
			if((user.getUsername().equals(uname))&&(user.getPassword().equals(pass))) {
				return true;
			}
		}
		return false;
	}
}
