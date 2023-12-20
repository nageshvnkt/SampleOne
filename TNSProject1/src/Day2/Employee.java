package Day2;

public class Employee {
	
	int empId;
	String empName;
	
	void insertRecord(int Id, String name)
	{
		empId=Id;
		empName=name;
	}
	void display()
	{
		System.out.println(empId+"  "+empName);
		
	}

	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		emp1.insertRecord(34, "Rahul");
		Employee emp2=new Employee();
		emp2.insertRecord(52,"Irfan");
		emp1.display();
		emp2.display();
	
	}

}
