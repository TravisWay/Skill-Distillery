package labs;


public class Employee {

	private String First;
	private String Last;
	private String ID;
	private String Salary;
	static int mWage = 8;
	static int rAge = 55;

	public Employee(String First, String Last) {
		setFirst(First);
		setLast(Last);
	}
	public Employee() {
		this("J","Doe");
	}
	
	
	public String getFirst() {
		return First;
	}

	public void setFirst(String first) {
		First = first;
	}

	public String getLast() {
		return Last;
	}

	public void setLast(String last) {
		Last = last;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getSalary() {
		return Salary;
	}

	public void setSalary(String salary) {
		Salary = salary;
	}

	void Print() {
		System.out.println(First + " " + Last + " " + ID + " " + Salary + " " + mWage + " " + rAge);

	}

}
