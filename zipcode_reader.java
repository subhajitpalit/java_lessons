package activity_2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;




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
		
		while (in.hasNextLine())
		{	
			 String line = in.nextLine();
			 out.println(line);
			 
		}
		
		in.close();
		out.close();

	}

}
