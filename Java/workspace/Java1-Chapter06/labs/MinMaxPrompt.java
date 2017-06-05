package labs;

import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class MinMaxPrompt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = new int[5];

		for (int i = 0; i < test.length; i++) {

			System.out.println("Enter an integer:");

			Scanner input = new Scanner(System.in);

			test[i] = input.nextInt();

		}

		int temp = test[0];
		int temp2 = test[0];

		for (int i : test) {

			while (i > temp) {

				temp = i;
			}
		}
		for (int i : test) {
			while (i < temp2) {

				temp2 = i;
			}
		}

		System.out.println("" + temp + " " + temp2);

	}

}
