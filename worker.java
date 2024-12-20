class  worker
{
	String name;
	int basic;
	
	
	worker(String name,int basic)
	{
		this.name=name;
		this.basic=basic;
	}
	void display()
	{
		System.out.println("Name:"+ name);
		System.out.println("Basic:"+basic);
	}
}
class  Wages extends worker
{
	double ot,hrs,rate,wage;
	Wages(String b,int c, double d,double a)
	{
		super(b,c);
		this.hrs=d;
		this.rate=a;
	}
	double overtime()
	{
		return(hrs*rate);
	}
	void display2()
	{
		wage=overtime()+basic;
		display();
		System.out.println("Total Wages:"+wage);
	}
}
	class javaClass5
	{
		public static void main(String[]args)
		{
			Wages s1=new Wages("Amit Das" , 5600 , 600.78 , 3.5);
			s1.display2();
		}
	}
		



