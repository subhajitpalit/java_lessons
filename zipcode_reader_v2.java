package activity_2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.sound.sampled.Line;

public class ZipsReader {

	public static void main(String[] args) throws FileNotFoundException
	
	{
		// Prompt for the input and output file name
		
		Scanner console = new Scanner(System.in);
		System.out.print( " Enter the input file name:");
		String inputFileName = console.next();
		System.out.println(" Enter the output file name:");
		String outputFileName = console.next();
		
		// Construct the Scanner and print Writer objects for reading and writing
		
		File inputFile = new File(inputFileName);
		Scanner in = new Scanner(inputFile);
		PrintWriter out = new PrintWriter(outputFileName); 
		
		// Read the input and Write the Output
		
		String line;
		char ch;
		
		while (in.hasNextLine())
		{	
			 line = in.nextLine();
			 Scanner lineScanner = new Scanner(line);
			 
			 String StateCode = lineScanner.next();
			 System.out.print("The State Code is : " +StateCode);
			 String StateName = "";
			 String ZipCode ="";
			 
			 while(!lineScanner.hasNextInt())
			 {
			  StateName = StateName + " " + lineScanner.next();
			 }
			 System.out.print("The State Name is : " +StateName);
			 
			 
			 while (lineScanner.hasNext()) 
			 {
			  String token = lineScanner.next();
			  if((token.matches("\\d{3}-\\d{3}")) || (token.matches("\\d{3}")))
			  {
			   ZipCode = ZipCode + " " +  lineScanner.next();			  
			 }
			  System.out.print("The State Zip Code ranges are : " +ZipCode);
			
			  lineScanner.close();

			 out.println(line);
	    }

		in.close();
		out.close();
		
	}
	}

}
