package Lotto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GetWinner {

	
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);	
	Map<String, Integer> Input	= new HashMap<>();
	
	System.out.println("How many hoppers do you need");
	
	
		
	
	System.out.println("How many different balls do you need?");
	int amount = input.nextInt();
	for (int i = 0; i < amount; i++) {
		input.nextLine();
		System.out.println("What is the value?");
		String name = input.nextLine();
		System.out.println("How many balls for this value?");
		int number = input.nextInt();
		Input.put(name, number);
		}
	
		
		
//	String[] text = { "s1", "s2", "s3", "s4", "s5",
//			 "s6", "s6", "s7", "s8", "s9", "s10", "s11", "s12", "s13",
//			 "s14" };
//			 int[] numBalls = { 250, 199, 156, 119, 88, 63, 43, 28, 17, 11, 8, 7,
//			 6, 5};
			
			 DraftDriver nba = new DraftDriver();
			 
			 System.out.println(nba.Winner(Input) +" is the winnner");
	
			 
			 
	
			 }
	
}
