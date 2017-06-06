package labs;

import java.util.Scanner;

public class BMI {

	public void beRate() {

		Scanner input = new Scanner(System.in);

		System.out.println("How tall are you(just feet here)?");

		double height = (input.nextDouble()) * 12;

		System.out.println("How tall are you(just inches here)?");

		height = input.nextDouble() + height;

		System.out.println("How much do you weigh in lbs?");

		double weight = input.nextDouble();

		Calc(height, weight);

	}

	public void Calc(double height, double weight) {

		double bmi = Cal(weight, height);

		if (bmi >= 30) {
			System.out.println("Obese");
		} else if (bmi >= 25 && bmi < 30) {
			System.out.println("Overweight");
		} else if (bmi >= 18.5 && bmi < 25) {
			System.out.println("Normal");
		} else {
			System.out.println("Underweight");
		}

	}

	public static double Cal(double weight, double height) {

		double bmi = (weight * 703) / (height * height);

		System.out.println(bmi + " is your bmi.");

		return bmi;

	}

}
