package labs;

public class Employee6 {

	private String First;
	private String Last;
	private String ID;
	private double Salary;
	static int mWage = 8;
	static int rAge = 55;
	private Title title;

	public Title getTitle() {
		return title;
	}
	public void setTitle(Title title) {
		this.title = title;
	}
	public Employee6(String First, String Last, Title title) {
		setFirst(First);
		setLast(Last);
		setTitle(title);
		setSalary(60000);
	}
	public Employee6() {
		this("J","Doe", Title.LOW);
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

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double d) {
		Salary = d;
	}

	public void Print() {
		
		//System.out.println(First + " " + Last + " " + ID + " " + Salary + " " + mWage + " " + rAge);
		System.out.printf("%.2f",Salary);
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		
		
		return (First + " " + Last + " " + ID + " " + Salary + " " + mWage + " " + rAge);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((First == null) ? 0 : First.hashCode());
		result = prime * result + ((ID == null) ? 0 : ID.hashCode());
		result = prime * result + ((Last == null) ? 0 : Last.hashCode());
		long temp;
		temp = Double.doubleToLongBits(Salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee6 other = (Employee6) obj;
		if (First == null) {
			if (other.First != null)
				return false;
		} else if (!First.equals(other.First))
			return false;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		if (Last == null) {
			if (other.Last != null)
				return false;
		} else if (!Last.equals(other.Last))
			return false;
		if (Double.doubleToLongBits(Salary) != Double.doubleToLongBits(other.Salary))
			return false;
		if (title != other.title)
			return false;
		return true;
	}
	
	
	
}
