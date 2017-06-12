package Jets;

public class Jet {

	private String model;
	private float speed;
	private float range;
	private int capacity;
	
	//Constructor for jet objects requiring 4 parameters, and then sets those values
	public Jet(String model, float speed, float range, int capacity) {
		super();
		setCapacity(capacity);
		setModel(model);
		setRange(range);
		setSpeed(speed);
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		float Mach = (float) (speed/761.21);		
		this.speed = Mach;
	}
	public float getRange() {
		return range;
	}
	public void setRange(float range) {
		this.range = range;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}
