import java.lang.*;

class Test implements  Runnable
{
	public void run()
	{
		System.out.println("Java Multithreading concept.....");
		System.out.println("This is Java Class.....");
		System.out.println("Thread is going to be executed.....");
		
	}
	
	
	public static void main(String []args)
	{
		Test t1=new Test();
		Thread th= new Thread(t1);
		th.start();
	}
}