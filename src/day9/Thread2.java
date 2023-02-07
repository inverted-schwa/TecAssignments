package day9;

public class Thread2 extends Thread {
	Table obj1;
	public Thread2(Table obj1)
	{
		this.obj1=obj1;
	}
	public void run()
	{
		obj1.printTable(5);
	}

}
