package day5;

public class Child extends Base {
	//by default it calls the default constructor of super class
	public Child()
	{
		super(90);//which will call the super class default constructor
		System.out.println("Child class constructor");
	}
	public static void main(String[] args)
	{
		Child ch1=new Child();
		/*
		 * First of all it will call constructor of super class and then 
		 * it will call constructor of child class.
		 */
		ch1.accept();
		ch1.hello();
	}
}