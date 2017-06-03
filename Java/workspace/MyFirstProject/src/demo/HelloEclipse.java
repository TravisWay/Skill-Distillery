package MakeChange;

import java.util.Scanner;

public class MakeChangeProject {

	static double total, tender, change;

	static final int twentybill = 20, tenbill = 10, fivebill = 5, onebill = 1, quarters = 25, dimes = 10, nickels = 5,
			pennies = 1;

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Would you like to start the cash register? Y or N");

		CashRegister(input.nextLine().toUpperCase());

	}

	public static double CashRegister(String Cr) {

		if (Cr == "Y") {

		}

		else if (Cr == "N") {

			System.out.println("Goodbye");

		} else {

			System.out.println("Please use only Y or N to answer the previous question, Upper or lowercase is fine");

		}

		System.out.println("How much was the total?");

		total = input.nextDouble();

		System.out.println("How much is being tendered?");

		tender = input.nextDouble();

		while (tender < total) {

			System.out.println("That is not enough money.  Please equal or exceed the total now");

			tender = input.nextDouble();
		}
		if (tender == total) {

			System.out.println("No change is required. Amounted tendered = Total Due.");

		} else {
			change = tender - total;

			Dollars(twentybill, change, "twenties");
			Dollars(tenbill, change, "tens");
			Dollars(fivebill, change, "fives");
			Dollars(onebill, change, "ones");
			Cents(quarters, change, "quarters");
			Cents(dimes, change, "dimes");
			Cents(nickels, change, "nickels");
			Cents(pennies, change, "pennies");

		}

	}

	public static int Dollars(int DollarType, double change, String DollarName) {

		if (change >= DollarType) {
			if (change >= DollarType && change % DollarType >= 0) {
				int bills = (int) (change / 20);
				change = change % 25;
				System.out.println(bills + " " + DollarName);
			}

		}
	}

	public static int Cents(int CoinType, double change, String CoinName) {

		change = (change * 100) + (.5);

		if (change >= CoinType) {
			if (change >= CoinType && change % CoinType >= 0) {
				int coins = (int) (change / 20);
				change = change % 25;
				System.out.println(coins + " " + CoinName);
			}

		}
	}

}
