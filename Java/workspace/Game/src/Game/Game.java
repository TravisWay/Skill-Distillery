package Game;

import java.util.Scanner;

//When the program starts, the user is welcomed and presented with a list of available commands.

public class Game {

	Scanner input = new Scanner(System.in);
	Bigboss Crazy = new Bigboss(50, 20);
	Enemyeasy badguy = new Enemyeasy(40, 10);
	Enemyeasy badguy2 = new Enemyeasy(40, 10);
	PlayerOne playerOne = new PlayerOne(100, 30);
	int counter = 0;
	boolean dead = false;

	// create game method
	public void playGame() {

		while (dead == false) {
			move();
		}

	}

	public void move() {
		while (dead == false) {
			System.out.println("Move forward (f), left(l), right(r)");
			char idontcare = input.nextLine().charAt(0);
			counter++;
			if (counter == 3) {
				fight(badguy.damage);
			} else if (counter == 6) {
				fight(badguy2.damage);
			} else if (counter == 10) {
				fight(Crazy.damage);
			}
		}
	}

	public void fight(int damage) {

		// Player takes hit
		if(damage < 19){
		System.out.println("You have been hit by an enemy.");
		}
		else{
		System.out.println("You have been hit by BIG BOSS.");	
		}
		playerOne.takehit(damage);
		if (playerOne.health <= 0) {
			Lose();
		}
		System.out.println("You can run or attack. Press a to attack. If you run, you will die eventually");
		char idontcare = input.nextLine().charAt(0);
		while (idontcare != 'a') {
			playerOne.takehit(damage);
			if (playerOne.health <= 0) {
				dead = true;
				Lose();
			}
			System.out.println("You can run or attack. Press a to attack. If you run, you will die eventually");
			idontcare = input.nextLine().charAt(0);

		}
		if (counter == 3) {
			badguy.takehit(playerOne.attack());

			while (badguy.health > 0) {
			
				fight(damage);
				
			}
			
			badguy.dead();
			

		} 
		else if (counter <= 7) {
			badguy2.takehit(playerOne.attack());

			while (badguy2.health > 0) {
				fight(damage);
			}
			badguy2.dead();
			
		} 
		else if (counter <= 11) {
			Crazy.takehit(playerOne.attack());

			while (Crazy.health > 0) {
				fight(damage);
			}
			Crazy.dead();
			Win();
		}
	}
	public void Lose() {
		System.out.println("You have died");
		System.exit(0);
	}

	public void Win() {
		System.out.println("\nYou have completed the game and received treasure.");
		System.exit(0);
	}

}
