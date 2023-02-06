package day3;
import java.util.*;

public class Rectangle {
	private Scanner sc;
	public Rectangle(int x, int y)
	{
		sc = new Scanner(System.in);
		System.out.println("Constructor is called with parameter "+x*y);
	}
	
	public void accept() {
		System.out.println("Accepting details from user");
	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle(34,344);
	}
}
