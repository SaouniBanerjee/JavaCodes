class Task17
{
		public static void main(String[]args)
		{
			int a=6;
			int i;
			long factorial = 1;
			for (i=1;i<=a;++i)
			{
				factorial*=i;
			}
			System.out.println("Factorial of %d-%d:"+a+factorial);
		}
}