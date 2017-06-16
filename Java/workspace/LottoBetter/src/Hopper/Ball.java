package Hopper;

public class Ball {
	
	String id;

	public Ball(String team) {
		this.id = team;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return id;
	}
	
	

}


