package day5;
import java.util.*;

public class StudentA extends Marks{
	int score1;
	int score2;
	int score3;
	
	@Override
	public void getMarks() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 3 scores: ");
		score1=sc.nextInt();
		score2=sc.nextInt();
		score3=sc.nextInt();
		double average = (score1+score2+score3)/3.0;
		System.out.println("The student's average is "+average);
		
	}
	
	public void display() {
		System.out.println("Score 1: "+score1);
		System.out.println("Score 2: "+score2);
		System.out.println("Score 3: "+score3);
	}
}
