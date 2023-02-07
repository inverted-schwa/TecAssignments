package day2;
import java.util.*;
public class Area {
	private static Scanner sc;
	public double Length;
	public double Breadth;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc=new Scanner(System.in);
		System.out.println("Enter the width of the rectangle: ");
		double length = sc.nextDouble();
		System.out.println("Enter the length of the rectangle: ");
		double breadth = sc.nextDouble();
		Area a = new Area();
		a.setDim(length, breadth);

	}
	
	public void setDim(double length, double breadth) {
		this.Length = length;
		this.Breadth = breadth;
		}
	
	public double getArea(Area area) {
		return area.Length * area.Breadth;
	}
}
