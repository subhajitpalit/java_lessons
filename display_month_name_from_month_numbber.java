import java.util.Scanner;

public class Assign_1P_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner in = new Scanner(System.in);
   
   String month = "January   February  March     April     May       June      July      August    September October   November  December  ";
   
   System.out.println("Enter the desired number of month :");
   
   int number = in.nextInt();
   //System.out.println(number);
   
   int start_ind = (number -1);
   int start_pos = (start_ind*10);
   int end_pos = (start_pos + 9);
   
   //System.out.println(start_pos);
   //System.out.println(end_pos);
   
   String month_display = month.substring(start_pos, end_pos);
   
   
   System.out.println( "The month in word will be : ");
   System.out.println(month_display);

	}

}
