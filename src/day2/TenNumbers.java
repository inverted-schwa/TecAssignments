package day2;
import java.util.*;

public class TenNumbers {
	public static int nums[] = new int[10];
	public static Scanner sc;
	public static double average;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.println("The "+i+" number please: ");
			nums[i]=sc.nextInt();
		}
		
		average();
	}
	
	public static void average() {
		double total=0;
		for(int i=0;i<10;i++) {
			total +=nums[i];
		}
		average = total/10.0;
		System.out.println("The average of the values is "+average);
	}
}
