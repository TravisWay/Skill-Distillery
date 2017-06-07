package labs;

public class EmpTest6 {

	public static void main(String[] args) {
		
		Employee6 Travis = new Employee6("Travis", "Way", Title.LOW);
		Travis.setID("123456");
		Travis.setSalary(65000.0000);;
		
		//Travis.Print();
		//System.out.println(Travis);
		Employee6 Me = new Employee6();
		//Me.Print();
		//System.out.println(Me);
		
		Travis.Print();
		//System.out.println(Me.equals(Travis));
		//System.out.println(Me.hashCode()==Travis.hashCode());
		
	}
	
}
