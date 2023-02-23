package MoB.service;

import java.util.Scanner;

import MoB.dao.UserDao;

public class UserService {
	private Scanner sc;
	public UserDao udao;
	
	public UserService()
	{
		udao=new UserDao();
	}
	
	public void logout() {
		udao.logout();
	}
	
	public boolean checkLogin(String uname, String pass) {
		return udao.checkLogin(uname, pass);
		//System.out.println("The user logged in is "+udao.login.userName+" with password "+udao.login.password);
	}
	
	public void viewFavorites() {
		udao=new UserDao();
		udao.viewFavorites();
	}
	public void viewNew() {
		udao=new UserDao();
		udao.viewNew();
	}
	
	public void viewUsers() {
		udao.viewUsers();
	}
}
