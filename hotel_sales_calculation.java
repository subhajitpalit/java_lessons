package ch_7;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Hotel_sales_total {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


	
		// Prompt for the input and output file name
		
				Scanner console = new Scanner(System.in);
				System.out.print( " Enter the Hotel Sales file name:");
				String inputFileName = console.next();
								
				// Construct the Scanner and print Writer objects for reading and writing
				File inputFile = new File(inputFileName);
				Scanner in = new Scanner(inputFile);
				
				// Read the input and Write the Output
//				in.useDelimiter(";");
				String line;
				
				 double lodge_amt=0.00, conf_amt=0.00, dinner_amt=0.00,
						lunch_amt=0.00, room_svc_amt=0.00, laundry_amt=0.00;
								
				while (in.hasNextLine())
				{	
					 line = in.nextLine();
					 Scanner lineScanner = new Scanner(line);
					 lineScanner.useDelimiter(";");
					 
					 String Cust_Name = lineScanner.next();
					 String Service = lineScanner.next();
					 String Amount = lineScanner.next();
					 String Date = lineScanner.next();
						 

					 
					 switch (Service) {
			            case "Lodging"    :  lodge_amt = lodge_amt + Double.parseDouble(Amount);
			            break;
			            case "Conference" :  conf_amt = conf_amt + Double.parseDouble(Amount);
	                    break;
			            case "Dinner"     :  dinner_amt = dinner_amt + Double.parseDouble(Amount);
	                    break;
			            case "Lunch"      :  lunch_amt = lunch_amt + Double.parseDouble(Amount);
	                    break;
			            case "Room Service" :  room_svc_amt = room_svc_amt + Double.parseDouble(Amount);
	                    break;
			            case "Laundry"      :  laundry_amt = laundry_amt + Double.parseDouble(Amount);
	                    break;        
	                    default: System.out.println("Invalid Service" +Service);
	                    break;
	               }			   					
				   lineScanner.close(); 
			    }
				
				System.out.println("Total Lodging Amount : " +lodge_amt);
				System.out.println("Total Dinner Amount : " +dinner_amt);
				System.out.println("Total Lunch Amount : " +lunch_amt);
				System.out.println("Total Conference Amount : " +conf_amt);
				System.out.println("Total Laundry Amount : " +laundry_amt);
				System.out.println("Total Room Service Amount : " +room_svc_amt);
			
				in.close();
				
	}
	
}
