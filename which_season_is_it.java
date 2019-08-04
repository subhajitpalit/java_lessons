package p_3_18;

import java.util.Scanner;

public class FirstProb {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
  Scanner in = new Scanner(System.in);
  System.out.println(" Enetr the number of month :");
  int month = in.nextInt();
  System.out.println( " Enter the date of the month :");
  int date = in.nextInt();
 
  
  
  if ((month >=1)&&(month <=12))
  { 
   System.out.println("valid month::");
  
  }
     
  else 
  {
	  System.out.println(" Invalid entry ::");
  }
  
  if((month == 1) || (month == 2))
  {
	  System.out.println(" The seson is winter :::");
  }
  else if (date >31)
  {
	  System.out.println(" Invalid input:::");
  }
  else if ((month == 3)&&(date >=1)&&(date <21))
  {
	  System.out.println(" The season is winter::");
  }
  else if ((month == 3)&&(date >=21)&&(date <=31))
  {
	  System.out.println(" The season is spring::: ");
  }
  else if (date >31)
  {
	  System.out.println(" Invalid input:::");
  }
  else if ((month == 4)||(month ==5))
  {
	  System.out.println(" The season is Spring :::");
  }
  else if (date >31)
  {
	  System.out.println(" Invalid input:::");
  }
  else if ((month == 6)&&(date >= 1)&&(date <21))
  {
	  System.out.println("The season is spring:::");
  }
  else if ((month == 6)&&(date >=21)&&(date <=31))
  {
	  System.out.println("The season is summer :::");
  }
  else if (date >31)
  {
	  System.out.println(" Invalid input:::");
  }
  else if ((month == 7)||(month ==8))
  {
	  System.out.println("The season is summer :::");
  }
  else if (date >31)
  {
	  System.out.println(" Invalid input:::");
  }
  else if ((month == 9) && (date >=1)&&(date <21))
  {
	  System.out.println(" The season is summer::");
  }
  else if ((month == 9)&&(date >=21)&&(date <=31))
  {
	  System.out.println("The season is fall :::");
  }
  else if (date >31)
  {
	  System.out.println(" Invalid input:::");
  }
  else if ((month == 10)||(month == 11))
  {
	  System.out.println("The season is Fall :::");
	  
  }
  else if (date >31)
  {
	  System.out.println(" Invalid input:::");
  }
  else if ((month ==12)&&(date >=1)&&(date <21))
  {
	  System.out.println("The season is fall ::");
  }
  
  else if ((month == 12)||(date >=21)&&(date <=31))
  {
	  System.out.println("The season is winter :::");
  }

  
	}
}
