package labs;

import java.util.*;

public class Students {

	public static ArrayList<String> students = new ArrayList<>();
	
	public Students() {
		// TODO Auto-generated constructor stub
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		students.add("Charlie");
		students.add("Connor");
		students.add("Travis");
		students.add("Mike");
		students.add("Moses");
		students.add("Brian");
		students.add("Andy");
		students.add("Jake");
		students.add("Jake");
		
		
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
		
		
	}
	
	
}