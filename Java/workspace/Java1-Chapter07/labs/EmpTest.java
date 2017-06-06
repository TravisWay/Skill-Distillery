package labs;

public class EmpTest {

	public static void main(String[] args) {
		
		Employee Travis = new Employee();
		Travis.First="Travis";
		Travis.Last="Way";
		Travis.ID="1234567";
		Travis.Salary="65000";
		
		Travis.Print();
		
		Employee John = new Employee();
		John.First="John";
		John.Last="Smith";
		John.ID="123456789";
		John.Salary="66000";
		
		John.Print();
		
		
	}
	
}
