package labs;

public class EmpTest {

	public static void main(String[] args) {
		
		Employee Travis = new Employee("Travis", "Way");
		Travis.setID("123456");
		Travis.setSalary("65000");;
		
		Travis.Print();
		
		Employee Me = new Employee();
		Me.Print();
		
	}
	
}
