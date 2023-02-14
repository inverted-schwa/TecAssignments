package day11;
import java.util.*;

public class setDemo {
	private Set<String> setex;
	private Scanner sc;
	public setDemo() {
		setex = new HashSet<String>();
		sc=new Scanner(System.in);
	}
	
	public void accept() {
		System.out.println("Enter how many strings you want to enter");
		int noofstr=sc.nextInt();
		for(int x = 0;x<noofstr;x++) {
			System.out.println("Enter a string");
			setex.add(sc.next());
		}
	}
	
	public void display() {
		for(String s:setex)
		{
			System.out.println("The string is "+s);
		}
	}
	
	public static void main(String[] args) {
		setDemo sd = new setDemo();
		sd.accept();
		sd.display();
	}
}
