package Game;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println(
				"The Darkness............................\n\nEnter 1 if you would like to enter the game \n Enter 2 if you would like to Quit the game ");
		int select = input.nextInt();
		if (select == 1) {
			Game newGame = new Game();
			newGame.playGame(); // now call Game board!

		} else if (select == 2) {
			System.out.println("that's too bad.. see you later dude! ");

			// quit the game

		}
	}

}