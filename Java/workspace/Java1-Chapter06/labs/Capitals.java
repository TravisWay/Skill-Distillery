package labs;

import java.util.Scanner;

public class Capitals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [][] Capitals = {{"Alabama","Montgomery"},{"Alaska","Juneau"},    
                {"Arizona", "Phoenix"},    
                {"Arkansas", "Little Rock"},    
                {"California", "Sacramento"},    
                {"Colorado", "Denver"},    
                {"Connecticut", "Hartford"},    
                {"Delaware", "Dover"},    
                {"Florida", "Tallahassee"},    
                {"Georgia", "Atlanta"},    
                {"Hawaii", "Honolulu"},    
                {"Idaho", "Boise"},    
                {"Illinois", "Springfield"},    
                {"Indiana", "Indianapolis"},    
                {"Iowa", "Des Moines"},    
                {"Kansas", "Topeka"},    
                {"Kentucky", "Frankfort"},    
                {"Louisiana", "Baton Rouge"},    
                {"Maine", "Augusta"},    
                {"Maryland", "Annapolis"},    
                {"Massachusetts", "Boston"},    
                {"Michigan", "Lansing"},    
                {"Minnesota", "St. Paul"},    
                {"Mississippi", "Jackson"},    
                {"Missouri", "Jefferson City"},    
                {"Montana", "Helena"},    
                {"Nebraska", "Lincoln"},    
                {"Nevada", "Carson City"},    
                {"New Hampshire", "Concord"},    
                {"New Jersey", "Trenton"},    
                {"New Mexico", "Santa Fe"},    
                {"New York", "Albany"},    
                {"North Carolina", "Raleigh"},    
                {"North Dakota", "Bismarck"},    
                {"Ohio", "Columbus"},    
                {"Oklahoma", "Oklahoma City"},    
                {"Oregon", "Salem"},    
                {"Pennsylvania", "Harrisburg"},    
                {"Rhode Island", "Providence"},    
                {"South Carolina", "Columbia"},    
                {"South Dakota", "Pierre"},    
                {"Tennessee", "Nashville"},    
                {"Texas", "Austin"},    
                {"Utah", "Salt Lake City"},    
                {"Vermont", "Montpelier"},    
                {"Virgina", "Richmond"},    
                {"Washington", "Olympia"},    
                {"West Virginia", "Charleston"},    
                {"Wisconsin", "Madison"},    
                {"Wyoming", "Cheyenne"} };
				

//		for (int i = 0; i < Capitals.length; i++) {
//			
//			
//			for (int j = 0; j < 2; j++) {
//				
//			
//		
//			System.out.print(Capitals[i][j]+ " ");
//		}
//		
//			System.out.println();
//		
//	}
		
		System.out.println("Enter a state that you would like the capital for: ");
		
		Scanner input = new Scanner(System.in);
		
		String state = input.nextLine();
		
		for (int i = 0; i < Capitals.length; i++) {
			if(state.equals(Capitals[i][0])){
				System.out.println(Capitals[i][1]);
				break;
			}
			
			
			
		}
	}
}