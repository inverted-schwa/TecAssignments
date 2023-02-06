package day2;

public class Area {

	public double Length;
	public double Breadth;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the width of the rectangle: ");
		double length = System.in.read();
		System.out.println("Enter the length of the rectangle: ");
		double breadth = System.in.read();
		Area a = new Area();
		a.setDim(length, breadth);

	}
	
	public static void setDim(double length, double breadth) {
		Length = length;
		Breadth = breadth;
		}
	
	public static double getArea(Area area) {
		return area.Length * area.Breadth;
	}
}
