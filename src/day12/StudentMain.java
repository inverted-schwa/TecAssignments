package day12;
import java.util.*;

public class StudentMain {
	private Map<Integer,Student> mapstudent;
	Scanner sc;
	public StudentMain()
	{
		mapstudent=new HashMap<Integer,Student>();
		sc=new Scanner(System.in);
	}
	public void insert()
	{
		System.out.println("Enter how many student detail u want to have");
		int noofstudent=sc.nextInt();
		for(int x=1;x<=noofstudent;x++)
		{
			Student s1=new Student();
			System.out.println("Enter Student id ");
			int id=sc.nextInt();
			s1.setStudentid(id)
;
			System.out.println("Enter Student Name ");
			s1.setStudentname(sc.next());
			System.out.println("Enter Score ");
			s1.setScore(sc.nextDouble());
			System.out.println("Enter Address ");
			s1.setAddress(sc.next());
			mapstudent.put(id, s1);
		}
	}
	public void retreive()
	{
		Set<Map.Entry<Integer,Student>> mapentry=mapstudent.entrySet();
		for(Map.Entry<Integer,Student> studentone:mapentry)
		{
			System.out.println("Student code is "+studentone.getKey());
			Student s=studentone.getValue();
			System.out.println("Name is "+s.getStudentname());
			System.out.println("The address is "+s.getAddress());
		}
	}
	public void delete()
	{
		
	}
	public static void main(String[] args) {
		StudentMain smain=new StudentMain();
		smain.insert();
		smain.retreive();
	}

}
