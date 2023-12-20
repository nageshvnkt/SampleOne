package Day2;

class Employee
{
	private int empId;
	private String empName;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}	
	public String getEmpName() {
		return empName;
	}	
	public void setEmpName(String empName) {
		this.empName = empName;
	}		
}
public class EncapsulationEx {
	public static void main(String[] args) {
	   Employee ob=new Employee();
	   ob.setEmpId(23);
	  System.out.println(ob.getEmpId());
	}

}
