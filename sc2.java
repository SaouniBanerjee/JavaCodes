import java.util.*;
class sc2
{
			public static void main(String[]args)
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the first value:");
				 float num1 = sc.nextInt();
				 System.out.println("Enter the second value:");
				 float num2 = sc.nextInt();
				 System.out.println("Enter your choice ( +,-,*,/,%):" );
				 char operator = sc.next().charAt(0);
				 
				 switch(operator)
				 {
					case'+':
					System.out.println("Addition:"+(num1+num2));
					break;
					
					case'-':
					System.out.println("Substaction:"+(num1-num2));
					break;
					
					case'*':
					System.out.println("MULtiplication:"+(num1*num2));
					break;
					
					case'/':
					System.out.println("Division:"+(num1/num2));
					break;
					
					case'%':
					System.out.println("Parcentage:"+(num1%num2));
					break;
					
					default:
					System.out.println("Error");
					}
					}
					}