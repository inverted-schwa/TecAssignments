package employeeExample.service;

import employeeExample.pojo.*;
import employeeExample.dao.*;
import java.util.Scanner;

public class UserService {
	private Scanner sc;
	private UserDao udao;
	
	public UserService()
	{
		sc=new Scanner(System.in);
		udao=new UserDao();
	}
	
	public boolean checkLogin(String uname, String pass) {
		return udao.checkLogin(uname, pass);
	}
}
