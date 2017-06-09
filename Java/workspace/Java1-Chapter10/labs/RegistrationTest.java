package labs;

public class RegistrationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Automobile standard = new Automobile(4, 30000, "Subaru", "Impreza", 2007);
		Truck four = new Truck(4, 86000, "ford", "f150", 2016, 5);
		Truck six = new Truck(6, 86000, "ford", "f150", 2016, 5);
		
		//System.out.println(six.calculateRegistrationFee());
			//System.out.println(four.calculateRegistrationFee());
			//System.out.println(standard.calculateRegistrationFee());
		
Automobile [] arr = new Automobile[3];

arr[0] = six;
arr[1] = four;
arr[2] =standard;

for (Automobile automobile : arr) {
	//System.out.println(automobile.calculateRegistrationFee());
}


			
			
	}

}
