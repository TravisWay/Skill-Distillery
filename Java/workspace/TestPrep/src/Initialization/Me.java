package Initialization;

public class Me extends SuperMan {
	static String staticField = sayString("Static field assignment");
	static{
	staticField = sayString("my static initializer 1"); 
}
}
