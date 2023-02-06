package day8;

public class FirstRunnable implements Runnable{
	public void run()
	{
		for(int x=1;x<=10;x++)
		{
			System.out.println(5+"*"+x+" = "+5*x);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}