package Jets;

import java.util.Scanner;

public class Hangar {

	public static Jet[] jets = new Jet[100];

	// Takes the object Jet and adds it to the jets array provided a null value
	// is available
	public static void addJet(Jet j1) {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] == null) {
				jets[i] = j1;
				break;
			}
		}
	}

	// Calculates the jet object with longest range in the jets array by going
	// through the entire array and comparing jet object range values. Prints
	// the jet object.
	public static void CalcRange() {
		float temp2 = 0;
		int big = 0;
		for (int i = 1; i < Hangar.jets.length; i++) {
			if (Hangar.jets[i] != null && Hangar.jets[i].getRange() > temp2) {
				temp2 = Hangar.jets[i].getRange();
				big = i;
			}

		}

		System.out.println("\nThe jet with the longest range is \n\n" + Hangar.jets[big].getModel());
		System.out.println("Speed = Mach " + Hangar.jets[big].getSpeed());
		System.out.println("Range is " + Hangar.jets[big].getRange() + " miles");
		System.out.println("Capacity is " + Hangar.jets[big].getCapacity() + " passengers");
	}

	// Calculates the jet object that is the fastest in the jets array by going
	// through the entire array and comparing jet object speed values. Prints
	// the jet object.
	public static void CalcSpeed() {
		float temp = 0;
		int fast = 0;
		for (int i = 1; i < Hangar.jets.length; i++) {
			if (Hangar.jets[i] != null && Hangar.jets[i].getSpeed() > temp) {
				temp = Hangar.jets[i].getSpeed();
				fast = i;
			}

		}
		System.out.println("\nThe fastest jet is \n\n" + Hangar.jets[fast].getModel());
		System.out.println("Speed = Mach " + Hangar.jets[fast].getSpeed());
		System.out.println("Range is " + Hangar.jets[fast].getRange() + " miles");
		System.out.println("Capacity is " + Hangar.jets[fast].getCapacity() + " passengers");
	}

	// Prints off the entire jets array with each objects values.
	public static void Print() {
		for (int i = 0; i < Hangar.jets.length; i++) {
			if (Hangar.jets[i] != null) {
				System.out.println("\nName = " + Hangar.jets[i].getModel());
				System.out.println("Speed = Mach " + Hangar.jets[i].getSpeed());
				System.out.println("Range is " + Hangar.jets[i].getRange() + " miles");
				System.out.println("Capacity is " + Hangar.jets[i].getCapacity() + " passengers");
			}
		}
	}

	// Allows user to add jet objects to the fleet by prompting for the
	// necessary parameters and then searches the array for a null value to add
	// that jet object in its place.
	public static void Add() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the jet's name");
		String model = input.next();
		System.out.println("Enter the jet's speed(MPH) and numbers only please");
		float speed = input.nextFloat();
		System.out.println("Enter the jet's range(miles) and numbers only please");
		float range = input.nextFloat();
		System.out.println("Enter the jet's capacity(seating) and numbers only please");
		int capacity = input.nextInt();
		Hangar.addJet(new Jet(model, speed, range, capacity));
		//input.close();
	}

}