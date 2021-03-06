package labs;

public class ShapeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rect1 = new Rectangle(Color.GREEN, 4, 5);
		Circle cir1 = new Circle(Color.BLACK, 5);
		Rectangle rect2 = new Rectangle(Color.GREY, 5, 5);
		
		Shape [] test = new Shape[3];
		test[0] = rect1;
		test[1] = cir1;
		test[2] = rect2;
		
		for (Shape shape : test) {
			shape.getArea();
		}
		Drawable[] test2 = new Drawable[3];
	
		test2[0] = rect1;
		test2[1] = cir1;
		test2[2] = rect2;
		
		for (Drawable drawable : test2) {
			drawable.draw();
		}
		
		
	}


}
