package Hopper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GetWinner {
	static BallFactory b1 = new BallFactory();

	static List<Ball> BList = new ArrayList<>();
	static List<Ball> BList2 = new ArrayList<>();
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);	
	Map<String, Integer> Input	= new HashMap<>();
	
	System.out.println("How many hoppers do you need");
	
//	int hoppers = input.nextInt();
//	for (int i = 0; i < hoppers; i++) {
		
	
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
	
			 for (int i = 1; i < 69; i++) {
					BList.add(b1.createBall(Integer.toString(i)));

					}

				for (int i = 1; i < 26; i++) {
						BList2.add(b1.createBall(Integer.toString(i)));
				}



					for (int h = 0; h < 1; h++) {
						b1.shuffle(BList);
					}
						System.out.println("Red: " + nbaBalls2.get(0));
			 
	
	}
}
