package Game;

public class Enemy extends Character {

	public Enemy() {
		super();
	}

	

	public Enemy(int health) {
		
		setHealth(100);
		// TODO Auto-generated constructor stub
	}



	int damagedone = 100;

	@Override
	public int takehit() {
		// TODO Auto-generated method stub
		System.out.println("You have hit the enemy. " + damagedone + "pts taken away. They have "
				+ (health - damagedone) + " remaining");

		health = health - damagedone;
		return health;

	}

	@Override
	public int attack() {
		System.out.println(damage + " pts of damage done");
		damagedone = damage;
		return damage;
	}

	public void dead() {
		System.out.println("This enemy is dead");

	}

}
