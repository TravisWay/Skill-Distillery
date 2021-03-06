package labs;

public class Truck extends Automobile {

	private int BedSize;

	public Truck() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Truck(int wheels, double price, String make, String model, int year, int BedSize) {
		super(wheels, price, make, model, year);
		this.BedSize=BedSize;
		// TODO Auto-generated constructor stub
	}
	public int getBedSize(){
		return this.BedSize;
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Truck [BedSize=");
		builder.append(BedSize);
		builder.append(", make=");
		builder.append(make);
		builder.append(", model=");
		builder.append(model);
		builder.append(", Year=");
		builder.append(Year);
		builder.append(", wheels=");
		builder.append(wheels);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
		
	
	}
	


	@Override
	public double calculateRegistrationFee() {
		// TODO Auto-generated method stub
		double base = .01;
		
		if(wheels> 4){
		 base = .015;
		
			
	
		double more =(.0001*(java.time.Year.now().getValue()-Year));
		if (more > (.005)){
			more=.005;
			
		}
		double fee = price*(base - more);
		return fee;	
		
		}	
		else{
			
			return super.calculateRegistrationFee();
		}
	
	
	}
	
}	
