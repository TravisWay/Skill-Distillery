package labs;


public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle car = new Vehicle(4, 30000);
		
		Automobile truck = new Automobile(4, 30000, "Ford", "F150", 2017);
		
		Truck ford = new Truck(6, 50000, "ford", "F950", 2017, 4);
		
		System.out.println(car+"\n"+truck+ "\n"+ ford);
		
		displayAuto(truck);
		
	}

	public static void displayAuto(Automobile a1){
		System.out.println(a1.getYear());
		System.out.println(a1.getWheels());
		if(a1 instanceof Truck){
		
		((Truck) a1).getBedSize();
		}
	
		
	}
	
	
}