class YoungerAgeException extends
RuntimeException
{
	YoungerAgeException(String msg)
	{
	super (msg);
	}
	}
	class JavaTask20
	{
		public static void main(String[]args)
		{
			int age = 16;
			try
			{
				if(age<18)
				{
				throw new
				YoungerAgeException ("You are eligible for voting.");
				}
				else
				{
					System.out.println("you are eligible for voting.");
					}
					}
					catch (Exception e)
					{
					System.out.println("Exception Handled..."+e);
					}
		
		}
	}