package ch_7;

//import java.io.File;
//import java.io.IOException;
//import java.util.Scanner;
import java.io.*;
import java.util.*;

public class LineReverse_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// Prompt for the input and output file name
		
		Scanner console = new Scanner(System.in);
		System.out.print( " Enter the input file name:");
		String inputFileName = console.next();
//		System.out.println(" Enter the output file name:");
//		String outputFileName = console.next();
		
		// Construct the Scanner and print Writer objects for reading and writing
		
		File inputFile = new File(inputFileName);
		Scanner in = new Scanner(inputFile);
//		PrintWriter out = new PrintWriter(outputFileName); 
		PrintWriter out = new PrintWriter(inputFileName);
		
		while (in.hasNextLine())
		{	
			String line = in.nextLine();
			String rev_line="";
			int len = line.length();
			int i = (len -1);
			while(i >= 0)
			{
			rev_line = rev_line + line.charAt(i) ;
			i--;
			}
//			line.replace(line,rev_line);
//			out.flush();
//			out.append(rev_line);
		    out.println(line.replace(line,rev_line));
//			out.append(line.replace(line,rev_line));
//			line.replaceAll(line,rev_line);
//			out.println(line);
						
		}
		
//		in.close();
//		out.close();

	}
	
}
