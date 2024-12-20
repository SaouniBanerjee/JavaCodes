class  singleint
{
	protected String name;
	protected String brand;
	public int modelno;
	public String colour;

public void calling()
{
	System.out.println("Mobile give the feature of calling facility...");
}
public void sendSms()
{
	System.out.println("In mobile you can send sms very easily and fast...");
}
}
class Samsung extends Mobile
{
	void setName(String name1)
	{
		this.name=name1;
	}
	void setbrand(String brand1)
	{
		this.brand=brand1;
	}
	void setModel(int modelno1)
	{
		this.modelno = modelno1;
	}
	void setcolour(String colour1)
	{
		this.colour=colour1;
	}
	
	void display()
	{
		System.out.println("Mobile name:"+name);
		System.out.println("Mobile brand:"+brand);
		System.out.println("Mobile model:"+ modelno);
		System.out.println("Mobile colour:"+colour);
	}
}
class inheritence1
{
	public static void main(String[]args)
	{
		Samsung S1 = new Samsung();
		S1.setName("Samsung M5");
		S1.setbrand("Samsung");
		S1.setModel(54321);
		S1.setcolour("Black");
		
		S1.display();
		S1.calling();
		S1.sendSms();
		
	}
}