package main;

import java.util.*;

public class EmployeeMenu {

	static String Employee[] = new String[100];

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int x = 1;
		while (x != 0) {

			System.out.println("Employee Menu"
					+ "\nEnter 1 for the Employee List \nEnter 2 to Hire/Add an Employee \nEnter 3 to Fire an Employee \n Enter 0 to Quit");

			x = input.nextInt();

			switch (x) {
			case 0:
				System.out.println("Goodbye");
				break;
			case 1:
				List();
				break;
			case 2:
				System.out.println("Please enter a Employee Name to Hire: ");
				String name = input.next();
				Hire(name);
				break;
			case 3:
				System.out.println("Please enter a Employee Name to Fire: ");
				String name2 = input.next();
				Fire(name2);
				break;
			default:
				System.out.println("Employee Menu"
						+ "\nEnter 1 for the Employee List \nEnter 2 to Hire/Add an Employee \nEnter 3 to Fire an Employee \n Enter 0 to Quit");
				break;

			}

		}

	}

	public static void List() {
		for (int i = 0; i < Employee.length; i++) {
			System.out.print(Employee[i] + " ");
		}
	}

	public static void Hire(String name) {
		boolean stop = true;
		if (stop) {
			for (int i = 0; i < Employee.length; i++) {
				if (Employee[i] == null || Employee[i] == "") {
					Employee[i] = name;
					stop = false;
					break;
				}
			}
		}
	}

	public static void Fire(String name) {
		String name2 = name;
		boolean stop = true;
		if (stop) {

			for (int i = 0; i < Employee.length; i++) {
				if (Employee[i] != null && Employee[i] != "") {
					if (Employee[i].equals(name2)) {
						Employee[i] = "";
						stop = false;
						break;
					}

				}

				else {
					System.out.println("Employee does not exist");

				}

			}

		}
	}

}
