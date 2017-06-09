package Game;

public class Enemyeasy extends Badguys {

	public Enemyeasy() {
		super();
	}

	

		public Enemyeasy(int health, int damage) {
		setDamage(damage);
		setHealth(health);
		// TODO Auto-generated constructor stub
	}


	
	public int takehit(int damagedone) {
		// TODO Auto-generated method stub
		System.out.println("You have hit the enemy. " + damagedone + "pts taken away. Scary monster has "
				+ (health - damagedone) + " remaining");

		health = health - damagedone;
		return health;

	}


	

	public void dead() {
		System.out.println("This enemy is dead");

	}



	
	public int attack() {
		// TODO Auto-generated method stub
		return damage;
	}



}
