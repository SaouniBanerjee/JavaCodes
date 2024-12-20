class Switchcase
{
		public static void main(String[]args)
		{
			int a = 12,b = 5;
			int result=0;
			char op;
			
			op='-';
			switch(op)
			{
				case '+':
				result=(a+b);
				System.out.println("Addition:"+result);
				break;
				case '-':
				result=(a-b);
				System.out.println("Substraction:"+result);
				break;
				case '*':
				result=(a*b);
				System.out.println("Multiplication:"+result);
				break;
				case '/':
				result=(a/b);
				System.out.println("Division"+result);
				break;
				default:
				System.out.println("you have entered wrong output....");
				break;
			}
			System.out.println("Thank you for using calculator apps.");
		}
}