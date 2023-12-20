package Day2;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
  Scanner ob = new Scanner(System.in);
		String Name;
		System.out.println("Enter the name");
		Name=ob.next();
		System.out.println("Name="+Name);
		int id;
		System.out.println("Enter the ID");
		id=ob.nextInt();
		System.out.println("ID="+id);
		ob.close();
	}

}
