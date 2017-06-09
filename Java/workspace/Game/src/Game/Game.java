package Game;

import java.util.Scanner;

//When the program starts, the user is welcomed and presented with a list of available commands.

public class Game {

	PlayerOne playerOne = new PlayerOne(100);

	// create game method
	public void playGame() {
		Scanner input = new Scanner(System.in);
		boolean dead = false;
		int counter2 = 0;
		int counter = 0;
		while (dead == false || counter2 < 3) {
			System.out.println("Move forward (f), left(l), right(r)");
			char idontcare = input.nextLine().charAt(0);
			counter++;

			if (counter >= 3) {

				Enemy badguy = new Enemy(50);
				//Player takes hit
				System.out.println("You have been hit by an enemy.");
				playerOne.takehit();
				System.out.println("Would you like to attack. Press a");
				idontcare = input.nextLine().charAt(0);
				while (idontcare != 'a') {
					playerOne.takehit();
					System.out.println("Would you like to attack. Press a");
					idontcare = input.nextLine().charAt(0);

					if (playerOne.health <= 0) {
						break;

					}
				}
				playerOne.attack();
				badguy.takehit();
				badguy.dead();
				counter2++;
				counter = 0;
				if (counter2 == 3) {
					break;

				}
			}
			if (playerOne.health <= 0) {
				dead = true;

			}

		}

		if (dead) {
			System.out.println("You have died");

		} else {
			System.out.println("You have completed the game and received treasure.");

		}

	}
}
