package Game;

public abstract class Badguys extends Character{
	public int health;
	public int damagedone;
 
	
	public int getDamagedone() {
		return damagedone;
	}

	public void setDamagedone(int damagedone) {
		this.damagedone = damagedone;
	}

	public Badguys() {
		// TODO Auto-generated constructor stub
	
		super();
	}

	public abstract int attack();
	

	public Badguys(int health, int damagedone) {
		super();
		this.health = health;
		
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}



}
