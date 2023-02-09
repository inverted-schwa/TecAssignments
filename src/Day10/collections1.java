package Day10;
import java.util.*;
public class collections1 {
	private Collection<String> collstr;
	public collections1() {
		collstr=new ArrayList<String>();
		collstr.add("Welcome!");
		collstr.add("New Java!");
		collstr.add("Hello!");
		collstr.add("Demo!");
		collstr.add("First Java!");

	}
	
	public void delete() {
		collstr.remove("Hello!");
		collstr.remove("Demo!");
		System.out.println("two values deleted");
	}
	
	public void display()
	{
		for(String s:collstr)
		{
			System.out.println("Value is "+s);
		}
	}
	
	public static void main(String[] args)
	{
		collections1 c=new collections1();
		c.display();
		c.delete();
		c.display();
	}
}
