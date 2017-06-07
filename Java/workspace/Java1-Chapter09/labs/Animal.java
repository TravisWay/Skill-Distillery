package labs;

public class Animal {
	
	private String name;
	private int weight;
	private String gender;
	
	
	
	
	
	public Animal(String name, int weight) {
		setGender("female");
		setName(name);
		setWeight(weight);
	}
	public Animal(String name, int weight, String gender) {
		
		setGender(gender);
		setName(name);
		setWeight(weight);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	void makeNoise(){
		System.out.print(gender + " "+ name + ":");
		
		if(name.equals("lion")){
			System.out.println("Roar");
			
		}
		else{
			System.out.println("NOISE!");
			
			
		}
		
		
	}
	
	
	
}
