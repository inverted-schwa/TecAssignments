package day3;

public class FindAverage {
	/*
	 * Create an array of five numbers, create one method called findAverage which should find average of all numbers in arrays
	 */
	

	
	public FindAverage() {
		int[] numbers = new int[5];
		numbers[0]=15;
		numbers[1]=25;
		numbers[2]=35;
		numbers[3]=45;
		numbers[4]=55;
		int total=0;
		for(int i=0;i<numbers.length;i++) {
			total += numbers[i];
		}
		double average = total*1.0/5;
		System.out.println("The average is "+ average);
	}
	
	public static void main(String[] args) {
		FindAverage fa = new FindAverage();
	}
}
