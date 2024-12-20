import java.lang.*;

class Test2 extends Thread
{
	public void run()
	{
		Thread.currentthread().setPriority(2);
		System.out.println("Priority of child:"+Thread.currentthread().getPriority());
		}
		
		public static void main(String []args)
		{
			System.out.println("Main Thread.....");
			Thread.currentthread().setPriority(4);
			System.out.println("Priority of main:"+Thread.currentthread().getPriority());
			
			Test2 te=new Test2();
			te.start();
			}
			}