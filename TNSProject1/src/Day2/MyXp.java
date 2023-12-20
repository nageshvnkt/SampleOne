package Day2;
public class MyXp
{   int clas;
	static int studentCount;
	MyXp() 
	{   
		clas=1;
	    studentCount = 15;
	}
	void addStudent()
	{
		studentCount++;
	}
  void addclass ()
	{
		clas++;
	}
public static void main(String[] args)
	{   MyXp java = new MyXp();
		MyXp python = new MyXp();
		java.addStudent();
		python.addStudent();
		python.addclass();
		System.out.println("Total Students " +studentCount);
		System.out.println("Pythonclasscount " +python.clas);
				System.out.println("Javaclasscount " +java.clas);
						}}

