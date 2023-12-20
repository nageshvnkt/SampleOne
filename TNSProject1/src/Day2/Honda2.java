package Day2;

abstract class Bike
{
	abstract void run();
	abstract void start();
	abstract void gets();
	
	void m2()
	{
		System.out.println("This second non abstract method");
	}
	
	void m1()
	{
		System.out.println("This is 1st non abstract method");
	}
}
public class Honda2 extends Bike {

	void run()
	{
		System.out.println("This is abstract method");
	}
	void gets()
	{
	  System.out.println("This is also abstract method");	
	}
	void start()
	{
		System.out.println("This is 2nd abstract ");
	}
	public static void main(String[] args) {
		Bike ob=new Honda2();
		ob.m1();
		ob.run();
		

	}

}
