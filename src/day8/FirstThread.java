package day8;

public class FirstThread extends Thread{
	public void run()
	{
		for(int x=1;x<=10;x++)
		{
			System.out.println(5+"*"+x+" = "+5*x);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}