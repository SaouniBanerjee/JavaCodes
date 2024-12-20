class Student1
{
	int id;
	String name;
	
	Student ()
	{
		System.out.println("This is a default constructor");
	}
	Student( int i,String n)
	{
		id=i;
		name=  n;
	}
	class Call2
	{
		public static void main(String[]args)
		{
			Student se= new Student();
			Student s=new Student(2,"Anuj");
			
			System.out.println("\nDefault Constructor values:\n");
			System.out.println("Student Id:"+s.id +"\nStudent.Name+s.name);
			
			System.out.println("/n--------------------Parameterized Constructor values:--------------:");
			Student student = new student();
			System.out.println("Student Id:"+student.id+ "\nStudent Name:"+student.name);
		}
	}
	
			