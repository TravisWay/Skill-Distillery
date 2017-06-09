package labs;

public abstract class Shape implements Drawable {

	Color mycolor;

	public Color getMycolor() {
		return mycolor;
	}
	public void setMycolor(Color mycolor) {
		this.mycolor = mycolor;
	}
	
	public Shape(Color mycolor) {
		super();
		this.mycolor = mycolor;
	}
	public abstract void getArea();
	
}
