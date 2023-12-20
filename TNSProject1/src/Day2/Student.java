package Day2;

public class Student
{
	int rollno;
	String name;
	
	Student(int r, String s)
	{
		rollno=r;
		name=s;
	}
	
	void display()
	{
		System.out.println(rollno+"  "+name);
	}
	
	public static void main(String args[])
	{
		Student s1=new Student(23,"Aman");
		s1.display();
		Student s2=new Student(33,"Anil");
		s2.display();
	}
 }
