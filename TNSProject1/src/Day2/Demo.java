package Day2;
class Employee
{
	int empId;
	String empName;
	static String companyName = "TCS";
	static void ValueChange()
	{
		companyName = "DataFlair";
	}
	Employee(int id, String name){
		empId = id;
		empName = name;
	}
	//method to display values
	void display()
	{
		System.out.println(empId+" "+empName+" "+companyName);
	}
}
public class Demo {

	public static void main(String[] args) {
		Employee. ValueChange(); 
		Employee EmployeeObj = new Employee(218,"Kushal");
		Employee EmployeeObj1 = new Employee(635,"Bhumika");
		Employee EmployeeObj2 = new Employee(147,"Renuka");
		//calling display method
		
		EmployeeObj.display();
		EmployeeObj1.display();
		EmployeeObj2.display();


	}

}
