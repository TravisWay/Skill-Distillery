package Jets;

import java.util.Scanner;

public class Barracks {

	public static Pilot[] pilots = new Pilot[30];

	public Barracks() {

	}

	// Takes the object Pilot and adds it to the Pilot array provided a null
	// value is available
	public static void addPilot(Pilot p1) {
		for (int i = 0; i < pilots.length; i++) {
			if (pilots[i] == null) {
				pilots[i] = p1;
				break;
			}
		}
	}

	// Prints off the entire pilots array with each objects values.
	public static void Print() {
		for (int i = 0; i < Barracks.pilots.length; i++) {
			if (Barracks.pilots[i] != null) {
				System.out.println("Pilot " + (i + 1) + " = " + Barracks.pilots[i].getName() + "\n");

			}
		}
	}

	// Allows user to add pilot objects to the barracks by prompting for the
	// necessary parameters and then searches the array for a null value to add
	// that pilot object in its place.
	public static void Add() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the pilot's name:");
		String Name = input.nextLine();
		Barracks.addPilot(new Pilot(Name));

	}

	// Calculates a random number between 0-14 and returns it
	public static int random() {
		int rand = (int) (Math.floor((Math.random() * 15)));
		while (pilots[rand] == null) {
			rand = (int) (Math.floor((Math.random() * 15)));
		}
		return rand;
	}

}
