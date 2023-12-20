package Synchronization;
class Tables{  
	synchronized static  void printTables(int n)
	   { 
		   
			   for(int i=1;i<=5;i++)
			   {  
			     System.out.println(n*i);  
			       try{  
			      Thread.sleep(400);  
			     }catch(Exception e){System.out.println(e);}  
			   }		   
}  
}  
  class MyThreadOne extends Thread
  {    
		public void run(){    
		Tables.printTables(1);    
		}    
   }    

  class MyThreadTwo extends Thread
  {    
	public void run(){    
	Tables.printTables(10);    
	}    
 }  

  class MyThread3 extends Thread
  {    
	public void run(){    
	Tables.printTables(100);    
	}    
 }  
  
  class MyThread4 extends Thread
  {    
	public void run(){    
	Tables.printTables(1000);    
	}    
 }  


public class TestSynchronization2 {

	public static void main(String[] args) {
		MyThreadOne t1=new MyThreadOne();    
		MyThreadTwo t2=new MyThreadTwo();    
		MyThread3 t3=new MyThread3();    
		MyThread4 t4=new MyThread4();    
		t1.start();    
		t2.start();    
		t3.start();    
		t4.start();    
	}

}
