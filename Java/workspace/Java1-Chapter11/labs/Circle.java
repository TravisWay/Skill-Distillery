package labs;

public class Circle extends Shape {

	private int radius;
	
	


	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public Circle(Color myColor,int radius) {
		super(myColor);
		setRadius(radius);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getArea() {
		double area;
		area = Math.PI * (radius * radius);
		System.out.println(area +" is the area of the Circle");
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("This is a circle and its color is "+ getMycolor());
	}

}
