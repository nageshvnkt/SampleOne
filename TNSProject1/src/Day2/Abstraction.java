package Day2;

abstract class Bikes
{  
	Bikes()
	{
		System.out.println("Constructor invoked");
	}
	abstract void run();
	abstract void start();
	
	void gear()
	{
		System.out.println("This is non abstract");
	}
}
 class Hondas extends Bikes
 {
	void run()
	{
		System.out.println("This is abstract method");
	}
	 void start()
	 {
		 System.out.println("This is abstract method ");
	 }
 }
public class Abstraction {

	public static void main(String[] args) {
	 Bikes ob=new Hondas();
	 
	 ob.gear();
	 ob.run();
	 ob.start();

	}

}
