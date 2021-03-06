package labs;

public class Automobile extends Vehicle {

	protected String make;
	protected String model;
	protected int Year;
	public Automobile() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	

	public Automobile(int wheels, double price, String make, String model, int year) {
		super(wheels, price);
		setMake(make);
		setModel(model);
		setYear(year);
		// TODO Auto-generated constructor stub
	}




	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Automobile [make=");
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
	
	public double calculateRegistrationFee() {
		double more =(.0001*(java.time.Year.now().getValue()-Year));
		if (more > (.005)){
			more=.005;
			
		}
		
		double fee = price*(.01 - more);
		return fee;
		
		
	}
	
	
	
	
}
