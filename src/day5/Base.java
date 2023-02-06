package day5;

public class Base {

	public Base()
	{
		System.out.println("Super class Constructor");
	}
	
	public Base(int x)
	{
		System.out.println("Value is "+x);
	}
	
	public void accept() {
		System.out.println("This method is written in super class");
	}
	
	
	public void hello() {
		System.out.println("Hello from the super class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
