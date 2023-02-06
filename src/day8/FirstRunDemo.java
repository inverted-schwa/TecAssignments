package day8;

public class FirstRunDemo implements Runnable {
	public void run()
	{
		for(int x=1;x<=10;x++)
		{
			System.out.println("value of "+x+"*5 is "+x*5);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		FirstRunnable firstr=new FirstRunnable();
		Thread th1=new Thread(firstr);//passing the object of class which is implementing 
		//Runnable interface
		th1.start();
		SecondRunnable secr=new SecondRunnable();
		Thread th2=new Thread(secr);//passing the object of class which is implementing 
		//Runnable interface
		th2.start();
	}

}