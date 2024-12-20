import java.lang.*;

class Test extends Thread
{
	public void run()
	{
		System.out.println(10/0);
		System.out.println("Child Thread old name:+Thread .currentThread().getName()");
		Thread.currentThread().setName("Sumit");
		System.out.println("Child Thread new name:"+Thread.currentThread().getName());
	}
	
	public static void main(String[]args)
	{
		System.out.println(10/0);
		System.out.println("Hello This is main method......");
		System.out.println("Parent Thread old name:"+Thread.currentThread().getName());
		Thread.currentThread().setName("Amit");
		System.out.println("Parent Thread new name:"+Thread.currentThread().getName());
		System.out.println(10/0);
		
		Test t1=new Test();
		t1.start();
		
		Test t2=new Test();
		t2.start();
		
		Test t3=new Test();
		t3.start();
		
		Test t4=new Test();
		t4.start();
		
		Test t5=new Test();
		t5.start();
		
	}
}
		