package com.skilldistillery.Bingo;

public class CardSpot {

	private int number;
	private boolean marked;
	
	public CardSpot(){
		
	}
	
	
	public CardSpot(int number, boolean marked) {
		super();
		this.number = number;
		this.marked = marked;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public boolean isMarked() {
		return marked;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		if(marked){
		builder.append("XX");
		}
		else if(!marked){
			builder.append(number);
		}
		return builder.toString();
	}
	public void setMarked(boolean marked) {
		this.marked = marked;
	}
	
	
	
}
