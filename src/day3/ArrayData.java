package day3;
import java.util.*;
public class ArrayData {
	private Scanner sc;
	private int arr[];
	
	public ArrayData() {
		sc=new Scanner(System.in);
		System.out.println("Enter the value which you want to insert ");
		int totalrecords=sc.nextInt();
		arr=new int[totalrecords];
	}
	public void accept() {
		for (int x=0;x<arr.length;x++)
		{
			System.out.println("Enter any number ");
			arr[x]=sc.nextInt();
		}
	}
	
	public void display() {
		for(int num:arr) {
			System.out.println("Number is "+num);
		}
	}
	
	public static void main(String[] args) {
		ArrayData arrd=new ArrayData();
		arrd.accept();
		arrd.display();
	}
}
