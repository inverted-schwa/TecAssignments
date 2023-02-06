package day2;
import java.util.*;

public class TakeInteger {
	public Scanner sc;
	public int total;
	public int length;
	public int product=1;
	public char status1;
	public double average=0;
	
	public void accept() {
		sc = new Scanner(System.in);
		String current = sc.next();
		char status[];
		status = current.toCharArray();
		if (status[0]!='q') {
			int currentInt = Integer.parseInt(current);
			total += currentInt;
			System.out.println("The total is: "+total);
			length++;
			System.out.println("The length is :"+length);
			product *= currentInt;
			System.out.println("The product is: "+product);
			average = total*1.0/length;
			System.out.println("The average is :"+ average);
			
		}
		else status1='q';
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TakeInteger t = new TakeInteger();
		
		do {
			System.out.println("Input another number or 'q' to quit");
			t.accept();
		}while(t.status1!='q');
		
		System.out.println("Program finished!");
	}

}
