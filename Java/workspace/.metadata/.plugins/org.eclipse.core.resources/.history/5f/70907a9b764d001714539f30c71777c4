package Jets;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Menu();

	}

	public static void CalcRange() {
		float temp2 = 0;
		int big = 0;
		for (int i = 1; i < Hangar.jets.length; i++) {
			if (Hangar.jets[i] != null) {
				if (Hangar.jets[i].getRange() > temp2) {
					temp2 = Hangar.jets[i].getRange();
					big = i;
				}

			}

		}
		System.out.println("The jet with the longest range is the " + Hangar.jets[big].getModel() + " with a range of "
				+ Hangar.jets[big].getRange() + " miles.");

	}

	public static void CalcSpeed() {
		float temp = 0;
		int fast = 0;
		for (int i = 1; i < Hangar.jets.length; i++) {
			if (Hangar.jets[i] != null) {
				if (Hangar.jets[i].getSpeed() > temp) {
					temp = Hangar.jets[i].getSpeed();
					fast = i;
				}

			}

		}
		System.out.println("The fastest jet is " + Hangar.jets[fast].getModel() + " with a speed of Mach "
				+ Hangar.jets[fast].getSpeed());

	}
	public static void Print(){
		for (int i = 0; i < Hangar.jets.length; i++) {
			if (Hangar.jets[i] != null) {
				System.out.println("\n\nName = " + Hangar.jets[i].getModel());
				System.out.println("Speed = Mach " + Hangar.jets[i].getSpeed());
				System.out.println("Range is " + Hangar.jets[i].getRange() + " miles");
				System.out.println("Capacity is " + Hangar.jets[i].getCapacity() + " passengers");

			}

		}
	}
	
	public static void Add(){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the jet's name");
		String model = input.next();
		System.out.println("Enter the jet's speed(MPH)");
		float speed = input.nextFloat();
		System.out.println("Enter the jet's range(miles)");
		float range = input.nextFloat();
		System.out.println("Enter the jet's capacity(seating)");
		int capacity = input.nextInt();
		Hangar.addJet(new Jet(model, speed, range, capacity));
	}
	public static void Menu(){
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
			System.out.println("\nHello, Welcome to THE HANGAR.\nWhat would you like to do today"); 
			while (quit == false) {
			System.out.println("\n\nChoose ONE\nEnter 1 for List Fleet"
							+ "\nEnter 2 for View fastest jet" + "\nEnter 3 for View jet with the longest range"
							+ "\nEnter 4 for Add a jet to Fleet" + "\nEnter 5 for Quit");
			int Menuoption = input.nextInt();

			switch (Menuoption) {
			case 1:Print();
				break;
			case 2:CalcSpeed();
				break;
			case 3:CalcRange();
				break;
			case 4:Add();				
				break;
			case 5:
				quit = true;
				break;
			}

		}
		
		
		
		
		
		
		
		
		
	}

}
