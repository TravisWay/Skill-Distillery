package Jets;

import java.util.Scanner;

public class Menu {

	public static void Run() {
		Scanner input = new Scanner(System.in);

		boolean quit = false;
		Jet Jetone = new Jet("F22", 1498, 1839, 2);
		Jet Jettwo = new Jet("F16", 1350, 2622, 2);
		Jet Jetthree = new Jet("G650", 610, 8053, 18);
		Jet Jetfour = new Jet("Boeing747", 570, 9200, 524);
		Jet Jetfive = new Jet("Sr71", 2200, 3355, 2);

		Hangar.addJet(Jetone);
		Hangar.addJet(Jettwo);
		Hangar.addJet(Jetthree);
		Hangar.addJet(Jetfour);
		Hangar.addJet(Jetfive);
		System.out.println("\nHello, Welcome to THE HANGAR.\n\nWhat would you like to do today");
		while (quit == false) {
			System.out.println("\n\nChoose ONE\nEnter 1 for List Fleet" + "\nEnter 2 for View fastest jet"
					+ "\nEnter 3 for View jet with the longest range" + "\nEnter 4 for Add a jet to Fleet"
					+ "\nEnter 5 for Quit");
			int Menuoption = input.nextInt();

			switch (Menuoption) {
			case 1:
				Hangar.Print();
				break;
			case 2:
				Hangar.CalcSpeed();
				break;
			case 3:
				Hangar.CalcRange();
				break;
			case 4:
				Hangar.Add();
				break;
			case 5:
				quit = true;
				break;
			}

		}

	}

}
