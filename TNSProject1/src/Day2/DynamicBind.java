package Day2;

class Animals
{
	void eat()
	{
		System.out.println("Inside Animal");
	}
}
class Dogs extends Animals
{
	void eat()
	{
		System.out.println("Inside Dog");
	}
}
public class DynamicBind {

	public static void main(String[] args) {
		Animals ob= new Dogs();
		ob.eat();

	}

}
