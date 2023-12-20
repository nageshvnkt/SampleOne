package Day2;

interface Printable
{
	 void prints();
	 void display();
}

class Sample implements Printable
{
	public void prints()
	{
		System.out.println("First one");
		
	}
	
	public void display()
	{
		System.out.println("Second one");
	}
}

public class InterfaceEx {

	public static void main(String[] args) {
	Sample s=new Sample();
	s.display();
	s.prints();
   
	}

}
