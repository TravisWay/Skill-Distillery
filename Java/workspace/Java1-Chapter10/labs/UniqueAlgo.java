package labs;

import java.util.Scanner;

public class UniqueAlgo {

	public static void  main( String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		
		String test = input.nextLine();
		
		char[] a=test.toCharArray();
		
		char [] b = test.toCharArray();
		int counter = 0;
		
		for (int i = 0; i < b.length; i++) {
			char c = b[i];
			
			for (int j=1; j < a.length;j++) {
				if(c == a[j]){
					if(a[i] == c)
					{
						
					}
					else{
						System.out.println("This is not a unique string.  No two letters can be the same");
					}
					
				}
				else{
					System.out.println("Good");
				}
			}
			
		}
		if(counter ==0){
			System.out.println("Well done! No two characters are the same");
			
		}
		
		
	}
	
}
