package day9;

public class Thread1 extends Thread{
	private Table obj;
	public Thread1(Table obj)
	{
		this.obj=obj;
	}
	public void run()
	{
		obj.printTable(9);
	}


}
