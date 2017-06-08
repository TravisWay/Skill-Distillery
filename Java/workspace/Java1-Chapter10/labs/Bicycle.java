package labs;

public class Bicycle extends Vehicle {

	private int gears;

	
	
	
	public Bicycle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bicycle(int wheels, double price,int gears){
		super(2, price);
		setGears(gears);
		// TODO Auto-generated constructor stub
	}

	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}
	
	
	
	
	
	
	
}
