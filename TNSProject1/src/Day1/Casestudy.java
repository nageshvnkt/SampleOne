package Day1;
import java.util.Scanner;
abstract class Movie
{
	String title;
	abstract  void setTitle(String s);
}
 class MyMovie extends Movie 
 {
	 void setTitle(String s)
	     {
		 title = s;
		 }
		 String getTitle()
		 {
		 return title;
		 }
 }
public class Casestudy {
	public static void main(String[] args) {
		System.out.println("Enter the title");
		 Scanner s=new Scanner(System.in);
		 String title=s.nextLine();
		 MyMovie m=new MyMovie();
		 m.setTitle(title);
		 System.out.println(m.getTitle());
		 
		 	
	}

}
