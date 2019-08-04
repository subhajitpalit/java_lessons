package prob_combolock;
import java.util.Scanner;

public class ComboLock 
{   
	// secret code values set below as private instance variable; 
	private int sec1=10, sec2=15, sec3=25, ticks;
	public int key, key1, key2, key3;
	
	//Construct ComboLock with secret combination number.
	
	public ComboLock (int sec1, int sec2, int sec3)
	{
	sec1=0;
	sec2=0;
	sec3=0;
		
	}
	 	
	// Reset the dial so that it points to 0.
	public void reset()
	{
		ticks = 0;
		key = 0;	
	}
	
	public void turnLeft(int ticks)
	{
		key = (40 -ticks);		
	}
	
	public void turnRight(int ticks)
	{
		key = ticks ;
	}
	
	public boolean open()
	{
		System.out.println("The Keys used are : " +key1 +" " +key2 +" " +key3);
		System.out.println("The secret Keys used are : " +sec1 +" " +sec2 +" " +sec3);
		
		
		if ((key1 == sec1)&&(key2 == sec2)&&(key3 == sec3))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
}








///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package prob_combolock;
import java.util.Scanner;

public class Test_ComboLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		ComboLock lock1 = new ComboLock(0,0,0);	
		
		int key_1=0,key_2=0,key_3=0;		
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the first security number (0 to 39) : ");
		key_1 = in.nextInt();
        System.out.println("Enter the second security number(0 to 39) :");
        key_2 = in.nextInt();
        System.out.println("Enter the third security number (0 to 39) :");
        key_3 = in.nextInt();
        
		lock1.reset();
		lock1.turnRight(key_1);
		lock1.key1=lock1.key;
		
		lock1.reset();
		lock1.turnLeft(key_2);
		lock1.key2=lock1.key;
		
		lock1.reset();
		lock1.turnRight(key_3);
		lock1.key3=lock1.key;
		
		if (lock1.open())
		{
			System.out.println(" Congratulations !  You opened the lock !!!");
		}
		else
		{
			System.out.println(" Sorry, your guess was not correct ! better luck next time");
		}
				

	}

}
