class switchCase7
{
	public static void main(String[]args)
	{
		String grade="B";
		Switch(grade);
		
		
		{
			case"A":
			System.out.println("Congratulations! Your mark is."+ "in the range 100-75");
			break;
			case"B":
			System.out.println("Your marks is in the range 50-75");
			break;
			case"C":
			System.out.println("Your marks is in the range 35-50");
			break;
			case"F":
			System.out.println("Sorry. Your mark is not enough to pass");
			break;
			default:
			System.out.println("Error");
			System.out.println("The grade you entered is not valid");
		}
	}
}

			