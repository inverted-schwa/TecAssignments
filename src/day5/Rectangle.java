package day5;
import java.util.*;

public class Rectangle extends Shape{
	private double length;
	private double width;
	private Scanner sc;
	
	public Rectangle()
	{
		sc=new Scanner(System.in);
		this.shapeType="Rectangle";
		this.length=sc.nextDouble();
		this.width=sc.nextDouble();
	}
	
	public static void main(String[] args)
	{
		Rectangle r = new Rectangle();
		r.displayShape();
	}
}
