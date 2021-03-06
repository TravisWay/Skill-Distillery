package labs;

import com.oracle.webservices.internal.api.databinding.Databinding.Builder;

public class Address {

	private int HouseNum;
	private String Street;
	private String City;
	private StringBuilder ZipCode;
	private String State;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [HouseNum=");
		builder.append(HouseNum);
		builder.append(", Street=");
		builder.append(Street);
		builder.append(", City=");
		builder.append(City);
		builder.append(", ZipCode=");
		builder.append(ZipCode);
		builder.append(", State=");
		builder.append(State);
		builder.append("]");
		return builder.toString();
	}

	public Address(int houseNum, String street, String city, StringBuilder string, String state) {
		super();
		setCity(city);
		setHouseNum(houseNum);
		setState(state);
		setStreet(street);
		setZipCode(string);
	}

	public int getHouseNum() {
		return HouseNum;
	}

	public void setHouseNum(int houseNum) {
		if (houseNum < 1) {
				HouseNum = 1;
		} else {
			HouseNum = houseNum;
		}
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public StringBuilder getZipCode() {
		return ZipCode;
	}

	public void setZipCode(StringBuilder zipCode2) {
		if (zipCode2.length() == 5){
			ZipCode = zipCode2.append("-0000");
		}
		else{
			ZipCode = zipCode2;
		}
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

}
