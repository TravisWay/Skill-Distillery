package labs;

import java.util.Scanner;



public class Mileage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("How many miles driven?");
		
		double miles = input.nextDouble();
		
		System.out.println("How many gallons used?");
		
		double gallons = input.nextDouble();
		
		double total = miles/gallons;
		
		System.out.println(total + "mpg");
		
		
		
		
	}

}