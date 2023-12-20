package Day2;

class XYZ
{
	private int x;
    private void input()
    {
    	x=5;
    }
    void display()
    {
    	input();
    }
}
public class PrivateEx {

	public static void main(String[] args) {
		XYZ ob=new XYZ();
		ob.x=9;
		ob.input();
		ob.display();

	}

}
