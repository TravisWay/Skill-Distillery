package labs;

public class State {
	
	private String state;
	private String abv;
	private String capital;
	private String SBird;
	private int Population;
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("State [state=");
		builder.append(state);
		builder.append(", abv=");
		builder.append(abv);
		builder.append(", capital=");
		builder.append(capital);
		builder.append(", SBird=");
		builder.append(SBird);
		builder.append(", Population=");
		builder.append(Population);
		builder.append("]");
		return builder.toString();
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		if(!state.equals(null)||!state.equals(""))
			{this.state = state;
		}
	}
	public String getAbv() {
		return abv;
	}
	public void setAbv(String abv) {
		if(!state.equals(null)||!state.equals(""))
		{this.abv = abv;
		}
	}	
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		if(!state.equals(null)||!state.equals(""))
		{this.capital = capital;
	}
	}
	public String getSBird() {
		return SBird;
	}
	public void setSBird(String sBird) {
		if(!state.equals(null)||!state.equals(""))
		{this.SBird = sBird;
	}
	}
	public int getPopulation() {
		return Population;
	}
	public void setPopulation(int population) {
		if(Population >= 0)
		{ Population = population;
		}
	}	
	public State(String Name, String abv, String Capital) {
		setState(Name);
		setAbv(abv);
		setCapital(Capital);
	}
	public void display(){
		System.out.println(state+" " + abv +" " + capital+ " " + SBird+ " "+ Population);
	}
	
	public State(String Name, String abv, String Capital, int population){
		setState(Name);
		setAbv(abv);
		setCapital(Capital);
		setPopulation(population);
		
		
	}
	
	
	
}
