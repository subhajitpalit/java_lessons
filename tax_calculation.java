package p_3_22;
import java.util.Scanner;


public class Second_prob {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double t1=(0.1);
		double t2=(0.15);
		double t3=(0.25);
		
		//amoutn of total tax
		double T1=0;
		double T2=0;
		double T3=0;
		double T4=0;
		double T5=0;
		double T6=0;
		
		
		//Read income and marital status
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter s for single ,m for married: ");
		String maritalStatus = in.next();
		System.out.println("Enter the maount of income: ");
	    double I = in.nextDouble();
	    
		//compute taxes due
		
		if (maritalStatus.equals("s"))
		{
			if ((I>0)&&(I<=8000))
			{
				T1 = (I*t1);
				System.out.println(" The amount of tax is "+T1);
			}
			else if (( I>8000 ) && ( I<=32000))
			{   
				double I1 = (I - 8000);
				
				T2 = (800 + (I1*t2));
				System.out.println("The amount of tax is "+ T2);
			}
			else if (I > 32000)
			{
				double I2 = (I - 32000);
				
				T3 = (4400 + (I2*t3));
				System.out.println("The amount of tax is "+ T3);
			}
			
			//else if 
			
			//{ System.out.println( "The amount of tax is zero ...");}
		}
			
			else 
			{
				if ((I > 0)&&(I <=16000))
				{
					T4 = (I*t1);
					System.out.println("The amount of tax is "+ T4);
				}
				else if ((I >16000)&&(I <=64000))
				{   
					
					double I3 = (I - 16000);
					T5 = (1600 + (I3*t2));
					System.out.println("The amount of tax is "+ T5);
				}
				else if (I > 64000)
				{
					double I4 = (I - 64000);
					
					T6 = (8800 + (I4*t3));
					System.out.println("The amount of tax is "+ T6);
				}

				
			}

	}

}
