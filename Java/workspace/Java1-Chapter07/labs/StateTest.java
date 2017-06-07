package labs;

public class StateTest {

	public static void main(String[] args) {
		
		
		State Washington = new State("Washington", "WA", "Olympia");
		State Colorado = new State("Colorado","CO", "Denver");
		State Oregon =new State("Oregon","OR", "Portland");
		System.out.println(Washington);
		Washington.setPopulation(1000000);
		Washington.setSBird("Seagull");
		
		Washington.display();
		Colorado.display();
		Oregon.display();
		
		State[] states = new State[5];
		
		states[0] = new State("Washington", "WA", "Olympia", 14000000);
		states[1] = new State("Oregon", "OR", "Portland", 12000000);
		states[2] = new State("Colorado", "CO", "Denver", 13000000);
		states[3] = new State("Wyoming", "WY", "Cheyenne", 11000000);
		states[4] = new State("Idaho", "ID", "Boise", 500000);
		
		for (int i = 0; i < states.length; i++) {
			states[i].display();
		}
		int temp =0;
		for (int i = 0; i < states.length; i++) {
			if(states[i].getPopulation() > temp){
				temp = states[i].getPopulation();
			}
			
		}
		System.out.println(temp);
		
	}

	
	
}
