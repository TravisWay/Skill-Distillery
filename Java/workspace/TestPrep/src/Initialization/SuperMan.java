package Initialization;

public class SuperMan {

	String superInstance = sayString("instance field declaration");
	
	static String superStatic =sayString("static field declaration");
	
	static{
		superStatic= sayString("set in static initalizer");
	}
	{
		superInstance = sayString("Instance init 1");
	}
	public static String sayString(String s){
		System.out.println(s);
		return s;
		
	}
	
}
