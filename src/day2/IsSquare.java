package day2;
import java.util.*;

public class IsSquare {
	static double length;
	static double width;
	public static Scanner sc;
	
	public void accept() {
		sc = new Scanner(System.in);
		System.out.println("Length: ");
		length = sc.nextDouble();
		System.out.println("Width: ");
		width = sc.nextDouble();
	}
	
	public void calc() {
		if(length == width) {
			System.out.println("It's a square");
		}
		else System.out.println("It's a rectangle");
	}
	
	public static void main(String[] args) {
		IsSquare s = new IsSquare();
		s.accept();
		s.calc();
	}
}
