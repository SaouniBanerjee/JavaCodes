class Switchcase3
{
		public static void main(String[]main)
		{
			int num=89;
			char grade;
			switch(num)
			{
				case int num when (num>80):
				System.out.println("A");
				break;
				case num>75:
				System.out.println("B");
				case num>70:
				System.out.println("C");
				break;
				case num>60:
				System.out.println("D");
				break;
				default:
				System.out.println("FAIL");
				
				break;
			}
			
		}
}
