package day5;
import java.util.*;

public class Square extends Rectangle{
	private double edge;
	private Scanner sc;
	
	public Square()
	{
		sc=new Scanner(System.in);
		this.shapeType="Square";
		this.edge=sc.nextDouble();
	}
	
	public static void main(String[] args)
	{
		Square s = new Square();
		s.displayShape();
	}
}