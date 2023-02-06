package day8;

public class Multiples extends Thread {
	public void run()
	{
		for(int x=1;x<=10;x++)
		{
			System.out.println("Value of "+x+"*5 is "+x*5);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		Multiples m=new Multiples();//new thread stage
		m.start();
	}
}
