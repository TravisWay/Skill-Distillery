package DecIn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DecIn {

	static List<String> words = new ArrayList<>();
	static List <String> mine = new ArrayList<>();
	static int counter=0;
	public static void Reader() {
		BufferedReader bufIn = null;
		try {
			bufIn = new BufferedReader(new FileReader("presidents.csv"));

			String line;
			// Reads through the csv file and stores the elements from each line
			// into a president object which is part of a List.
			while ((line = bufIn.readLine()) != null) {
				String[] words2 = line.split("\\n");
				words.add(words2[0]);
				counter++;
			}

		} catch (IOException e) {
			System.err.println(e);
		} finally {
			if (bufIn != null) {
				try {
					bufIn.close();
				} catch (IOException e) {
					System.err.println(e);
				}
			}
		}
		
		
		for (int i = 0; i < words.size(); i++) {
			breakdown(words.get(i));
			counter++;
		}
		System.out.println(counter);
	}
	
	public static void printarray(List<String> mine2) {
		for (String word : mine2) {
			System.out.println(word);
		}
	}
	
	public static void breakdown(String string){
		String regex = "(\\w(?<!\\d)[\\w'-]*)";
		
		
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(string);

		// The substituted value will be contained in the result variable
		while(matcher.find()){
	
			mine.add(matcher.group(1));
			
			printarray(mine);
			
		
		
		
		}
		
	}

	
}