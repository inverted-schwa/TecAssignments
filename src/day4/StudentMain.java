package day4;
import java.util.*;
public class StudentMain {
	private Student studentarr[];
	private static Scanner sc;
	private int choice;
	/*
	public void menu() {
		sc=new Scanner(System.in);
		do {
		System.out.println("1. Enter new array");
		System.out.println("2. Update a value");
		System.out.println("3. Delete a value");
		System.out.println("4. View details ");
		System.out.println("5. Exit");
		choice = sc.nextInt();
		if(choice ==1) {
		}
		}while(choice!=5);
	}
	*/
	public StudentMain() {
		//sc=new Scanner(System.in);
	}
	public void insert()
	{
		System.out.println("Enter how many students you want to enter: ");
		int noofstudents=sc.nextInt();
		studentarr=new Student[noofstudents];
		for(int x=0;x<studentarr.length;x++) {
			studentarr[x]=new Student();
			System.out.println("Enter student id ");
			studentarr[x].setStudentid(sc.nextInt());
			System.out.println("Set student name ");
			studentarr[x].setStudentname(sc.next());
			System.out.println("Set student score ");
			studentarr[x].setScore(sc.nextInt());
			System.out.println("Data inserted");
		}
	}
	public void delete()
	{
		System.out.println("Enter the student id which you want to delete");
		int studentdelete = sc.nextInt();
		for(Student s:studentarr)
		{
			if(s.getStudentid()==studentdelete)
			{
				s.setScore(0);
				s.setStudentid(0);
				s.setStudentname(null);
				System.out.println("Data deleted");
			}
		}
	}
	public void update()
	{
		System.out.println("Enter the student id which you want to update");
		int studentupdate = sc.nextInt();
		for(Student s:studentarr)
		{
			if(s.getStudentid()==studentupdate)
			{
				System.out.println("Enter the new score");
				s.setScore(sc.nextInt());
				System.out.println("Data updated");
			}
		}
	}
	public void retrieve()
	{
		for(Student s:studentarr)
		{
			System.out.println("Student name is "+s.getStudentname());
			System.out.println("Student ID is "+s.getStudentid());
			System.out.println("Student score is "+s.getScore());
		}
	}
	public static void main(String args[]) {
		sc=new Scanner(System.in);
		StudentMain smain=new StudentMain();
		do {
		System.out.println("1. Enter new array");
		System.out.println("2. Update a value");
		System.out.println("3. Delete a value");
		System.out.println("4. View details ");
		System.out.println("5. Exit");
		smain.choice = sc.nextInt();
		if(smain.choice==1) {
			smain.insert();
		}
		if(smain.choice==2) {
			smain.update();
		}
		if(smain.choice==3) {
			smain.delete();
		}
		if(smain.choice==4) {
			smain.retrieve();
		}
		}while(smain.choice!=5);
		//smain.insert();
		//smain.retrieve();
	}
}
