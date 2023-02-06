package day3;
import java.util.*;


public class TenNumbers {
	private Scanner sc;
	private int arr[];
	
	public TenNumbers() {
		sc=new Scanner(System.in);
		arr=new int[10];
	}
	public void accept() {
		for (int x=0;x<arr.length;x++)
		{
			System.out.println("Enter any number ");
			arr[x]=sc.nextInt();
		}
	}
	
	public void display() {
		for(int i=0;i<10;i++) {
			if(arr[i]%5==0)
			System.out.println(arr[i]+" is divisible by 5");
		}
	}
	
	public static void main(String[] args) {
		TenNumbers tennum=new TenNumbers();
		tennum.accept();
		tennum.display();
	}
}
