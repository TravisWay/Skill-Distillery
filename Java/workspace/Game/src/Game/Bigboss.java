package Game;


public class Bigboss extends Character {

	
	public Bigboss() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Bigboss(int health, int damage) {
		setDamage(damage);
		setHealth(health);
		// TODO Auto-generated constructor stub
	}


	public int attack() {
		System.out.println("BIG BOSS");
		
		// TODO Auto-generated method stub
		return damage;
	}

	
	public int takehit(int damagedone)  {
		// TODO Auto-generated method stub
		System.out.println("\nYou have hit the enemy. " + damagedone + "pts taken away. BIG BOSS has "
				+ (health - damagedone) + " remaining");

		health = health - damagedone;
		return health;

	}
	

	public void dead() {
		System.out.println("This enemy is dead");

	}
	
}
