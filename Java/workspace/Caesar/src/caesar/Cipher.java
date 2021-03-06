package caesar;

import java.util.Scanner;

public class Cipher {

	static int shift;
	static String choice;

	static Scanner input = new Scanner(System.in);

	public static void address() {

		System.out.println("Give me a String.  Remember I only cipher capital letters.");

		choice = input.next();

		System.out.println("How many characters would you like to shift? Integers only");

		shift = input.nextInt();

	}

	public static void Encrypt() {

		char[] ch = choice.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 65 && ch[i] <= 90) {

				if (ch[i] + shift > 90) {
					int j = ch[i] - 65;

					int l = (j + shift) % 26;

					System.out.print((char) (l + 65));
				} else {
					System.out.print((char)ch[i]+shift);

				}
				
			}
			else{
				System.out.print((char)ch[i]);
			}
		}
	}

	public static void Decrypt() {

		char[] ch = choice.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 65 && ch[i] <= 90) {

				if (ch[i] - shift < 65) {
					int j = ch[i] - 65;

					int l = (j + shift) % 26;

					System.out.print((char) (90-l));
				} else {
					System.out.print((char) (ch[i] - shift));

				}
			}
			else{
				System.out.print((char)ch[i]);
			}
		}
	}

	public static void Menu() {

		boolean check = true;
		int choose;

		while (check) {
			System.out.println("\nPlease pick a number(1, 2, or 3, 1 for Encrypt, 2 for Decrypt, and 3 for Quit):");
			choose = input.nextInt();

			if (choose == 1) {
				Cipher.address();
				Cipher.Encrypt();

			} else if (choose == 2) {
				Cipher.address();
				Cipher.Decrypt();
			} else {
				check = false;

			}
		}
	}
}