package Day2;

class BankAccount
{
 private String name;
 private int  passwd;
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the passwd
 */
public int getPasswd() {
	return passwd;
}
/**
 * @param passwd the passwd to set
 */
public void setPasswd(int passwd) {
	this.passwd = passwd;
}
 
 
	
}

public class Encapsulation {

	public static void main(String[] args) {
	BankAccount ob=new BankAccount();
	ob.setpasswd(34);
	System.out.println(ob.getpasswd());

	}

}
