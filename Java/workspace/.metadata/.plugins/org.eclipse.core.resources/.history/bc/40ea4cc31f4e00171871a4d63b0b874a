package Jets;

import java.util.Scanner;

public class Menu{

	public static void Run() {
		Scanner input = new Scanner(System.in);

		boolean quit = false;
		Pilot Bean = new Pilot("Julian Delphiki Jr");
		Pilot Petra = new Pilot("Petra Arkanian");
		Pilot Ender = new Pilot("Andrew Wiggin");
		Pilot Mazer = new Pilot("Mazer Rackham");
		Pilot Dink = new Pilot("Dink Meeker");
		
		Barracks.addPilot(Bean);
		Barracks.addPilot(Petra);
		Barracks.addPilot(Ender);
		Barracks.addPilot(Mazer);
		Barracks.addPilot(Dink);
		
		
		
		
		Jet Jetone = new Jet("F22", 1498, 1839, 2,Barracks.pilots[Barracks.random()]);
		Jet Jettwo = new Jet("F16", 1350, 2622, 2,Barracks.pilots[Barracks.random()]);
		Jet Jetthree = new Jet("G650", 610, 8053, 18,Barracks.pilots[Barracks.random()]);
		Jet Jetfour = new Jet("Boeing747", 570, 9200, 524,Barracks.pilots[Barracks.random()]);
		Jet Jetfive = new Jet("Sr71", 2200, 3355, 2,Barracks.pilots[Barracks.random()]);
	
		Hangar.addJet(Jetone);
		Hangar.addJet(Jettwo);
		Hangar.addJet(Jetthree);
		Hangar.addJet(Jetfour);
		Hangar.addJet(Jetfive);
		
		System.out.println("\nHello, Welcome to THE HANGAR.\n\nWhat would you like to do today?");
		
		while (quit == false) {
			System.out.println("\n\nChoose ONE\nEnter 1 to List Fleet" + "\nEnter 2 to View fastest jet"
					+ "\nEnter 3 to View jet with the longest range" + "\nEnter 4 to Add a jet to Fleet"
					+"\nEnter 5 to view pilots" + "\nEnter 6 to add a pilot " +"\nEnter 7 to Quit");
			
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
				Barracks.Print();
				break;
			case 6:
				Barracks.Add();
				break;			
			default:
				System.out.println("\nGoodbye");
				quit = true;
				break;
			}
		}
		input.close();
	}
}
