package labs;

import java.util.ArrayList;

public class Numbers {

	public static ArrayList<Double> rand = new ArrayList<>(10);
	
	public void main (String [] args) {
		
		for (int i = 0; i < rand.size(); i++) {
			rand.add(Math.random());
		}
		for (int i = 0; i < rand.size(); i++) {
			System.out.println(rand.get(i));
		}
	
	
	
	}
	
	

}
