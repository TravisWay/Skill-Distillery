package labs;

public class EmpTest6 {

	public static void main(String[] args) {
		
		Employee6 Travis = new Employee6("Travis", "Way");
		Travis.setID("123456");
		Travis.setSalary("65000");;
		
		//Travis.Print();
		System.out.println(Travis);
		Employee6 Me = new Employee6();
		//Me.Print();
		System.out.println(Me);
		System.out.println(Me.equals(Travis));
		System.out.println(Me.hashCode()==Travis.hashCode());
		
	}
	
}
