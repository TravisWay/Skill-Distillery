package Jets;

import java.util.Scanner;

public class Hangar {

	static Jet[] jets = new Jet[100];

	public Hangar(int size) {
		super();
		Jet[] jets = new Jet[size];
		setJets(jets);
	}
	//Takes the object Jet and adds it to the jets array provided a null value is available
	public static void addJet(Jet j1) {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] == null) {
				jets[i] = j1;
				break;

			}
		}

	}

	public Jet[] getJets() {
		return jets;
	}

	public void setJets(Jet[] jets) {
		this.jets = jets;
	}
	//Calculates the jet object with longest range in the jets array by going through the entire array and comparing jet object range values
	public static void CalcRange() {
		float temp2 = 0;
		int big = 0;
		for (int i = 1; i < Hangar.jets.length; i++) {
			if (Hangar.jets[i] != null && Hangar.jets[i].getRange() > temp2) {
				temp2 = Hangar.jets[i].getRange();
				big = i;
			}

		}

		System.out.println("The jet with the longest range is \n\n" + Hangar.jets[big].getModel());
		System.out.println("Speed = Mach " + Hangar.jets[big].getSpeed());
		System.out.println("Range is " + Hangar.jets[big].getRange() + " miles");
		System.out.println("Capacity is " + Hangar.jets[big].getCapacity() + " passengers");
		;
	}

	public static void CalcSpeed() {
		float temp = 0;
		int fast = 0;
		for (int i = 1; i < Hangar.jets.length; i++) {
			if (Hangar.jets[i] != null  && Hangar.jets[i].getSpeed() > temp) {
					temp = Hangar.jets[i].getSpeed();
					fast = i;
			}

		}
		System.out.println("The fastest jet is \n\n" + Hangar.jets[fast].getModel());
		System.out.println("Speed = Mach " + Hangar.jets[fast].getSpeed());
		System.out.println("Range is " + Hangar.jets[fast].getRange() + " miles");
		System.out.println("Capacity is " + Hangar.jets[fast].getCapacity() + " passengers");

	}

	public static void Print() {
		for (int i = 0; i < Hangar.jets.length; i++) {
			if (Hangar.jets[i] != null) {
				System.out.println("\n\nName = " + Hangar.jets[i].getModel());
				System.out.println("Speed = Mach " + Hangar.jets[i].getSpeed());
				System.out.println("Range is " + Hangar.jets[i].getRange() + " miles");
				System.out.println("Capacity is " + Hangar.jets[i].getCapacity() + " passengers");

			}

		}
	}

	public static void Add() {

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

}