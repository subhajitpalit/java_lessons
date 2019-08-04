package p_4_32;

import java.util.Scanner;
//import javax.swing.JOptionPane;

public class Prob_III 
{

	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
        int I, a, A1, A2;
        
        int II, b, B1, B2;
        
        int III, c, C1, C2;
        
        int IV, d, D1, D2;
        
        int x, a1;
        
        int y, b1;
        
        int z , c1;
        int check_first, check_second, check_third;
        
        
        
		int card_no;
        System.out.println("Please enter your credit card number :");
        card_no = in.nextInt();
       // int card_no = JOptionPane.showInputDialog("Enter your credit card number:");
        //int int_card_no = Integer.parseInt(card_no);
        
         I = (card_no % 10);  a1 = (card_no %100);
         
         x = (card_no % 1000); a = (a1/10)*2; //System.out.println(a);
         
         II = (x/100);          b1 = (card_no % 10000); 
         y = (card_no % 100000);b = (b1/1000)*2;   //System.out.println(b);
         III = (y/10000);       c1 = (card_no % 1000000);
       z = (card_no % 10000000); c = (c1/100000)*2;  //System.out.println(c);
         IV = (z/1000000);      d = (card_no / 10000000)*2;
                                             //System.out.println(d);
         check_first = (I + II + III + IV);
        // System.out.println(check_first);
         if (a >=10)
         {  A1 = a/10;
            A2 = a%10; 
         }
         else 
         {
          A1 = a;
          A2 = 0; 	 
         }
         //System.out.println("A1:"+A1);
         //System.out.println("A2:"+A2);
          
         if (b >=10)
         {  B1 = b/10;
            B2 = b%10; 
         }
         else 
         {
           B1 = b;
           B2 = 0; 	 
         }
         //System.out.println("B1:"+B1);
         //System.out.println("B2:"+B2);
         if (c >=10)
         {  C1 = c/10;
            C2 = c%10; 
         }
         else 
         {
           C1 = c;
           C2 = 0; 	 
         }
         //System.out.println("C1:"+C1);
         //System.out.println("C2:"+C2);
         
         if  (d >=10)
         {  D1 = d/10;
             D2 = d%10;
         }
         else 
         {
           D1 = d;
           D2 = 0;
          	 
         }
        // System.out.println("D1:"+D1);
        // System.out.println("D2:"+D2);
        
         check_second = (A1+A2+B1+B2+C1+C2+D1+D2);
         //System.out.println(check_second);
         check_third = (check_first + check_second)%10;
        // System.out.println(" check_third" +check_third);
         
         if  (check_third == 0 )
        		 {
        	         System.out.println("The credit card number is valid:: ");
        		 }
         else
         {
        	 System.out.println("The credit card number is invalid::");
         }
        
	   if (check_third!= 0)
	   {
			   if (check_third < I)
	              {
		                int I2 = (I - check_third);
		   
		                 System.out.println(" If the check digit is " +I2+ "credit card number would be valid:::");	   
	               }
	             else 
	                { 
		              int I3 = ((10 - check_third) + I);
		              System.out.println(" If the check digit is " +I3+ "credit card number would be valid:::");	
	                }
	             	
		}
	   
	   else 
	   {
		 System.out.println(" No need to the verify the number ::");   
	   }

	}
}
