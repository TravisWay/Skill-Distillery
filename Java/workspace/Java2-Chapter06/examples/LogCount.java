package examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





public class LogCount {

	static Map <Integer, String> test = new HashMap<>();
	static Map <String, Integer> test2 = new HashMap<>();
	static Map<String,Map<Integer, String>> Log = new HashMap<>();
	static int counter = 1;

	public static void Reader() {
		BufferedReader bufIn = null;
		try {
			bufIn = new BufferedReader(new FileReader("access_log"));
			String line;
			// Reads through the csv file and stores the elements from each line
			// into a president object which is part of a List.
			while ((line = bufIn.readLine()) != null) {
				String[] line2 = line.split(" - - ");
				String iP= line2[0];
				
			if(test2.containsKey(iP)){
				int c = test2.get(iP);
				c++;
				test2.put(iP, c);
				
				}
			else{
				
				test2.put(iP, 0);
				
			}
				
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
	//System.out.println(Log.size());
	//System.out.println(counter);
	System.out.println(Log.size());
	System.out.println(test2.size());
	
	
	
	}

}
