class Switchcase1
{
		public static void main(String[]args)
		{
			int a=5,b=4,c=7;
			int result=0;
			char op;
			
			op='*';
			switch(op)
			{
				case'*':
				result=(a*b*c);
				System.out.println("Multiplication:"+result);
				break;
				case'/':
				result=(a/b/c);
				System.out.println("Division:"+result);
				break;
				default:
				System.out.println("you have entered wrong output...");
				break;
				
			}
		}
}
				