package day3;

public class ArrayDemo {
	int numbers[];
	public ArrayDemo() {
		numbers=new int[5];
		numbers[0]=40;
		numbers[1]=56;
		numbers[2]=89;
		numbers[3]=90;
		numbers[4]=101;
	}
	
	public void display()
	{
		for(int x=0;x<numbers.length;x++)
		{
			System.out.println("Number is "+numbers[x]);
		}
	}
	
	public static void main(String[] args) {
		ArrayDemo arrobj=new ArrayDemo();
		arrobj.display();
	}
}
