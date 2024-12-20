class Smartphone
{
	public  void calling()
	{
		System.out.println("Smartphone gives the facility to communicate with each other...");
	}
}
class Samsung extends Smartphone
{
	public void calling()
	{
		super.calling();
		System.out.println("Samsung gives the facility to communicate with each other,along with group calling as well as video calling facility.");
	}
}
class JavaClass7
{
	public static void main(String []args)
	{
		Samsung s=new Samsung();
		s.calling();
	}
}
		