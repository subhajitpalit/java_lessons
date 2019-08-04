package my_thread;
import java.util.Date;

public class GreetingRunnable  implements java.lang.Runnable
{
	private static final int REPETITIONS = 10;
	private static final int DELAY = 60000;
	private String greeting;
	
	public GreetingRunnable(String aGreeting)
	{
		greeting = aGreeting;
	}
	
	public void run()
	{
	 try
	 {
	  for (int i=1;i<= REPETITIONS; i++)
	  {
	   Date now = new Date();
	   System.out.println(now + " " + greeting);
	   Thread.sleep(DELAY);
	  }
	 }
	 catch (InterruptedException exception)
	 {
	 }
 			
	}
}

------------------------------------------------------------------------------------------------------------------- 
package my_thread;
public class GreetingThreadRunner {

	public static void main(String a[]) throws Exception
	{
		GreetingRunnable r1 = new GreetingRunnable("Hello");
		GreetingRunnable r2 = new GreetingRunnable("GoodBye");
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
    	t1.start();
		t2.start();		
	}
}
