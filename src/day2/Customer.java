package day2;
import java.util.*;

public class Customer {
private Scanner sc;
int quantity;
double totalcost;

	public void acceptDetails() {
		sc = new Scanner(System.in);
		quantity=sc.nextInt();
		if(quantity>1000) {
			totalcost = 0.9*(quantity*100);
		}
		else totalcost =(quantity*100);
		
		System.out.println("The total cost is :" + totalcost);
	}
	public static void main(String[] args) {
		Customer c = new Customer();
		c.acceptDetails();
	}
}
