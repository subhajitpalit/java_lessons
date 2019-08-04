package ch_1;

import java.util.Scanner;

public class Assign_1 {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	
		// Read the cost 	
		
	 Scanner in = new Scanner(System.in);
	
	System.out.println( " Enter the cost of the Hybrid car ");
	
	double hy_price = in.nextDouble();
	
	System.out.println(" Enter the cost of the normal car");
	
	double car_price = in.nextDouble();
	
	double diff_cost = ( hy_price - car_price);
	
	System.out.println( " The difference of cost between two car " + diff_cost);
	
	System.out.println(" Enter the estimated miles diven by the Hybrid car");
	 double hy_driven = in.nextDouble();
	
	System.out.println( " Enter the estimated miles driven by the normal car");
	double car_driven = in.nextDouble();
	
	System.out.println( "Enter the cost of the fuel");
	double fuel_cost = in.nextDouble();
	System.out.println("Enter the fuel efficeiency of Hybrid car");
	double hy_fuel_eff = in.nextDouble();
	System.out.println("Enter the fuel efficiency of normal car");
	double car_fuel_eff = in.nextDouble();
	double hy_oil_consume = (hy_driven/hy_fuel_eff);

	System.out.println( " The toal oil consume by the hybrid car is"+ hy_oil_consume);
	double car_oil_consume = (car_driven/car_fuel_eff);
	System.out.println("The total oil consume by the normal car is "+ car_oil_consume);
	double hy_fuel_cost = (hy_oil_consume*fuel_cost);
	double car_fuel_cost = (car_oil_consume*fuel_cost);
	double diff_oil_cost = (car_fuel_cost - hy_fuel_cost);
	System.out.println(" The difference between the cost of oil consumption between normal car and hybrid car"+  diff_oil_cost);
	
	System.out.println("Enter the resale value of hybrid car ");
	double hy_resale = in.nextDouble();
	System.out.println(" Enter the resale value of normal car ");
	double car_resale = in.nextDouble();
	double diff_resaleprice = (hy_resale - car_resale);
	System.out.println( "The difference between the resale price of hybrid and normal car is "+ diff_resaleprice);
	
	double total_saving = (diff_oil_cost + diff_resaleprice);
	System.out.println(" The savings from the car is "+ total_saving);

	}

}
