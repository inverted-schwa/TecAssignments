package day8;

public class SecondThread extends Thread{
	public void run()
	{
		for(int x=1;x<=10;x++)
		{
			System.out.println(7+"*"+x+" = "+7*x);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		FirstThread first=new FirstThread();
		SecondThread second=new SecondThread();
		first.start();
		try {
			first.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		second.start();
		try {
			second.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}