package labs;

public class Rectangle extends Shape{

	private int width;
	private int height;

	
	
	


	public Rectangle(Color mycolor,int width, int height) {
		super(mycolor);
		setHeight(height);
		setWidth(width);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getArea() {
		double area;
		area = width * height;
		System.out.println(area +" is the area of this rectangle.");

	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("This is a rectangle and its color is "+ getMycolor());
	}

}
