package labs;


public class VehicleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object [] arr = new Vehicle[3];
		Bicycle two = new Bicycle();
		Automobile four = new Automobile();
		Truck six = new Truck();
		
		arr[0] = two;
		arr[1] = four;
		arr[2] = six;
		
		for (Object vehicle : arr) {
			System.out.println(vehicle);
		}
		
		
		
	}

}
