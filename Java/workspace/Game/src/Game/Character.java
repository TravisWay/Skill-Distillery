package Game;

public abstract class Character {

	public int health;
	public int damage;

	public Character() {
		super();
	}

	public abstract int attack();

	public abstract int takehit();

	public Character(int health) {
		super();
		this.health = health;
		
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

}
