import java.util.Scanner;


public class assignP3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		  System.out.println(" Enter the amount of the capital :");
		  double C = in.nextDouble();
		  System.out.println(" Enter the rate of interest :");
		  double i = in.nextDouble();
		  double i1 = ((C*(i/100))/12);
		  
		  double C1 = (C + i1);
		  System.out.println(" The amount of money after the first month :");
		  System.out.println(C1);
		  
		  double i2 = ((C1*(i/100))/12);
		  double C2 = (C1 + i2);
		  System.out.println(" The amount of money after the second month :");
		  System.out.println(C2);
		  
		  double i3 = ((C2*(i/100))/12);
		  double C3 = (C2 + i3);
		  
		  System.out.println("The amount of money after the third month :");
		  System.out.println(C3);
		    
	}

}
