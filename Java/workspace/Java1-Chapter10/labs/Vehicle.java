package labs;

public class Vehicle {

	public int wheels;
	public double price;
	
	
	public Vehicle(int wheels, double price) {
		this.wheels = wheels;
		this.price = price;
	}
	public Vehicle(){
		
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vehicle [wheels=");
		builder.append(wheels);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

}
