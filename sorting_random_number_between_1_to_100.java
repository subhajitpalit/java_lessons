package p6_14;
import java.util.Scanner;
import java.util.Arrays;

public class ProbI {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
		
		 int []randomA = new int[20]; 
		 for(int i =0; i<20; i++)
		 {
		      int  randomn = (int)(100.0 * Math.random());
		      randomA[i] = randomn;	      
		 }
		 
		 System.out.println("Random Numbers between 1 to 100 as entered in Array is as follows :==>");		 
		 for(int i =0; i<20; i++)
		 {
		      System.out.print("  " +randomA[i]) ;      
		 }
		 System.out.println();
		 
		 //sorting Array now;
		 Arrays.sort(randomA);
		 
		 //printing sorted array now;
		 
		 System.out.println("The Array after Sorting the Random Numbers looks like below now :==>");		 
		 for(int i =0; i<20; i++)
		 {
		      System.out.print("  " +randomA[i]) ;      
		 }
		 System.out.println();
		 
		 
	}
	

}
