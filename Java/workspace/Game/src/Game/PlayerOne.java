package Game;

public class PlayerOne extends Character {

	public PlayerOne() {
		super();
	}

	

	public PlayerOne(int health) {
		
		setHealth(100);
		// TODO Auto-generated constructor stub
	}



	int damagedone = 5;

	public int getDamagedone() {
		return damagedone;
	}

	public void setDamagedone(int damagedone) {
		this.damagedone = 5;
	}

	@Override
	public int takehit() {
		// TODO Auto-generated method stub
		setDamage(5);
		getDamagedone();
		System.out.println(
				"You were hit. " + damagedone + "pts taken away. You have " + (health - damagedone) + " remaining");

		health = health - damagedone;
		setHealth(health);
		return health;

	}

	@Override
	public int attack() {
		System.out.println(damage + " pts of damage done");
		damagedone = damage;
		return damage;
	}

}
