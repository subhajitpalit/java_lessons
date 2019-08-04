package moth_movement;
public class Moth 

{ public double initialPosition;
  public double D;
  public double lightPosition;
	
	
	public Moth(double initialPosition)
	{
		initialPosition = 0.00;
	}
	
	public void moveToLight(double lightPosition)
	{
        D = (initialPosition + lightPosition) / 2;
		
	}
	
	public void getposition()
	{
		System.out.println(" The new position of the moth is now at :  ") ;
		System.out.println(D);
		
	}

}


==========================================================

package moth_movement;
import java.util.Scanner;

public class MothTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Moth moth1 = new Moth(0);
		double lpos;
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("The moth is now at position " +moth1.initialPosition );
		System.out.print(" Enter the position of the light source  ");
		lpos = console.nextDouble();	
		moth1.moveToLight(lpos);
		System.out.println("The light source is at position: " +lpos) ;
		moth1.getposition();
		
		moth1.initialPosition = moth1.D;
		System.out.println("The moth is now at position " +moth1.initialPosition );
		System.out.print(" Enter the position of the light source  ");
		lpos = console.nextDouble();	
		moth1.moveToLight(lpos);
		System.out.println("The light source is at position: " +lpos) ;
		moth1.getposition();	
		
		moth1.initialPosition = moth1.D;
		System.out.println("The moth is now at position " +moth1.initialPosition );
		System.out.print(" Enter the position of the light source  ");
		lpos = console.nextDouble();	
		moth1.moveToLight(lpos);
		System.out.println("The light source is at position: " +lpos) ;
		moth1.getposition();
		

	}

}
