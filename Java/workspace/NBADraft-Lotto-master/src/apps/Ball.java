package apps;

public class Ball extends BallFactory{
	
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
		StringBuilder builder = new StringBuilder();
		builder.append("Ball [id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}
	
	

}


