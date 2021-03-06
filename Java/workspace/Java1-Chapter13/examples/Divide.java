package examples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divide {
	public static void main(String[] args) throws ArithmeticException {
		Scanner keyboard = new Scanner(System.in);

		int num1, num2, result;
		try {
			System.out.print("Please enter an int: ");
			num1 = keyboard.nextInt();
			System.out.print("Please enter another int: ");
			num2 = keyboard.nextInt();
			result = num1 / num2;
		} catch (InputMismatchException f) {
			System.err.println("not a valid number.");
			num1 = num2 = 1;
		} catch (ArithmeticException e) {
			System.err.println("can not divide by this.");

		}

		keyboard.close();

	}
}
