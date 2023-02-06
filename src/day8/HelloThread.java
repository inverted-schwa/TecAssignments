package day8;

public class HelloThread extends Thread{
		public void run()
		{
			for(int x=1;x<=10;x++)
			{
				System.out.println("Value of x is "+x);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		public static void main(String[] args) {
			HelloThread hello=new HelloThread();//new thread stage
			hello.start();
		}

	}

