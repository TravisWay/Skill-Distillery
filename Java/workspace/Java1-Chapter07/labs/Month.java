package labs;

public class Month {

	String Month;
	String Abv;
	int days;
	
	
	void print(){
		
		System.out.println(Month + " has "+ days+ " days.");
		
	}
	void print(boolean detailed){
		if (detailed){
			System.out.println(Month + " has "+ days+ " days and has an abv of "+Abv);	
		}
		else{
			System.out.println(Month);
			
		}
	}
	
}
