package labs;

public class AddressTest {

	public static void main(String[] args) {
		
		int HouseNum = -10;
		StringBuilder zip = new StringBuilder();
		zip.append("63367");
		
		
		
		Address Mine = new Address(0, "Tailor Sq", "O'Fallon", zip, "FL");
		
		Mine.setHouseNum(HouseNum);
		Mine.setZipCode(zip);
		System.out.println(Mine);
	
	
	}

}
