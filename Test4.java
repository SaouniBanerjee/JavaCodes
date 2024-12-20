import java.lang.*;

class Test1extends Thread
{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon Thread......");//true
			}
			else	
			{
				System.out.println("Child Thread.....");//false
			}
	}
}

				
				
		public static void main(String[]args)
		{
			System.out.println("Main Thread.....");
			
			Test t1=new Test();
			t1.setDaemon(false);
			t1.start();
			
			}
			}
			
			
			