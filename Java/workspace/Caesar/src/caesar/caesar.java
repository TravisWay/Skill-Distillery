package caesar;

import java.lang.reflect.Array;
import java.util.Scanner;

public class caesar {

	char[] ch;

	public void Run() {

		boolean cont = true;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the string to be ciphered:");

		String casear = input.nextLine();

		System.out.println("How many places would you like to move this: ");

		int move = input.nextInt();

		Convert(casear);
		Cipher(move);
		Print();

	}

	public void Convert(String ToChange) {

		ch = ToChange.toCharArray();

	}

	public void Cipher(int move) {

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] >= 65 && ch[i] <= 90) {

				if ((ch[i] + move) > 90) {

					ch[i] = (char) (((ch[i] + move) - 90) + 65);

				} else {
					ch[i] = (char) (ch[i] + move);
				}

			}
			if (ch[i] >= 97 && ch[i] <= 122) {

				if ((ch[i] + move) > 122) {

					ch[i] = (char) (((ch[i] + move) - 122) + 96);
				}

				else {
					ch[i] = (char) (ch[i] + move);
				}
			}

		}

	}

	public void Print() {

		for (int i = 0; i < ch.length; i++) {

			System.out.print(ch[i] + "");
		}

	}

}
