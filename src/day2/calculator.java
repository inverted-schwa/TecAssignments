package day2;
import java.util.*;

public class calculator {
	int number1;
	int number2;
	Scanner scobj;
	//void return type
	public void accept() {
		scobj=new Scanner(System.in);
		System.out.println("Enter value for number 1");
		number1=scobj.nextInt();
		System.out.println("Enter a value for number 2");
		number2=scobj.nextInt();
	}
	
	public void add() {
		//System.out.println("This is add.");
		System.out.println("The total is "+ (number1+number2));
	}
	
	public void subtract() {
		//System.out.println("This is subtract.");
	}
	
	public void multiply() {
		System.out.println("This is multiply.");
	}
	
	public void divide() {
		System.out.println("This is divide.");
	}
	
	public static void main(String[] args) {
		calculator calobj;//reference variable
		calobj=new calculator();
		calobj.accept();
		calobj.add();
		calobj.subtract();
		calobj.divide();
		calculator calobj1 = new calculator();
		calobj1.multiply();

	}
}
