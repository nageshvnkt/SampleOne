package Day2;

class Bank
{  
	int getRateOfInterest()
	{
		return 0;
	}  
}  

class SBI extends Bank
{
	int getRateOfInterest()
	{
		return 8;
	}
}

class Axis extends Bank
{
	int getRateOfInterest()
	{
		return 7;
	}
}

class ICICI extends Bank
{
	int getRateOfInterest()
	{
		return 6;
	}
}

public class Test {

	public static void main(String[] args) {
	
		SBI s=new SBI();
	System.out.println(s.getRateOfInterest());	
	
	Axis a=new Axis();
	System.out.println(a.getRateOfInterest());	
	
	ICICI i=new ICICI();
	System.out.println(i.getRateOfInterest());	

	}

}
