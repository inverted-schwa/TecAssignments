package MoB.service;

import java.util.Scanner;

import MoB.dao.UserDao;

public class UserService {
	private Scanner sc;
	private UserDao udao;

	
	public UserService()
	{
		sc=new Scanner(System.in);
		udao=new UserDao();
	}
	
	public void logout() {
		udao.logout();
	}
	
	public boolean checkLogin(String uname, String pass) {
		return udao.checkLogin(uname, pass);
	}
}
