package labs;

public class Truck extends Automobile {

	protected int BedSize;

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
	
	
	
}
