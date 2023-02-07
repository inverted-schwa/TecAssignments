package day9;

public class Table {
	public synchronized void printTable(int number) {
		for(int x=1;x<10;x++)
		{
			System.out.println(x+" * "+number+" = "+(x*number));
		}
	}
}
