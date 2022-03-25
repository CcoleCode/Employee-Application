/*
 * Author: Chelsea Cole
 * Date: March 04, 2022
 * Description: The Payroll class holds the main method for the Employee Application
 */

import java.util.Scanner;

public class Payroll {

	// Creating an array out of the classes
	static Employee[] employees = new Employee[6];

	public static String printMenu() {

		return "Employee types\n\t1. Full-time" + "\n\t2. Part-time\n\t3. Intern\n" + "\t4. Consultant"
				+ "\n\t0. Exit System";
	}

	public static void main(String[] args) {

		// local variables stored here
		int count = 0;
		int userChoice;
		int hoursPerWeek;
		String university;
		boolean isPaid;

		// Declare the scanner object
		Scanner input = new Scanner(System.in);

		System.out.println("Select an employee type from the menu below:");

		do {
			System.out.println(printMenu());

			userChoice = input.nextInt();
			input.nextLine();

			if (userChoice == 1) { // FullTime
				System.out.println("Enter your name: ");
				String name = input.nextLine();

				System.out.println("Enter your ssn: ");
				String ssn = input.nextLine();

				System.out.println("Enter your salary: ");
				double salary = input.nextDouble();

				employees[count] = new FullTime(name, salary, ssn);
				count++;
			}

			if (userChoice == 2) {// PartTime
				System.out.println("Enter your name: ");
				String name = input.nextLine();

				System.out.println("Enter your ssn: ");
				String ssn = input.nextLine();

				System.out.println("Enter your salary: ");
				double salary = input.nextDouble();

				System.out.println("How many hours per week did you work?: ");
				hoursPerWeek = input.nextInt();

				employees[count] = new PartTime(name, salary, ssn, hoursPerWeek);
				count++;
			}

			if (userChoice == 3) {// Intern
				System.out.println("Enter your name: ");
				String name = input.nextLine();

				System.out.println("Enter your ssn: ");
				String ssn = input.nextLine();

				System.out.println("Enter your salary: ");
				double salary = input.nextDouble();

				System.out.println("How many hours per week did you work?: ");
				hoursPerWeek = input.nextInt();

				System.out.println("What university did you attend?: ");
				university = input.nextLine();

				System.out.println("Is it a paid internship?(True/False): ");
				isPaid = input.nextBoolean();

				employees[count] = new Intern(name, salary, ssn, hoursPerWeek, university, isPaid);
				count++;
			}

			else if (userChoice == 4) {// Consultant
				System.out.println("Enter your name: ");
				String name = input.nextLine();

				System.out.println("Enter your ssn: ");
				String ssn = input.nextLine();

				System.out.println("Enter your salary: ");
				double salary = input.nextDouble();

				System.out.println("How many months is your contract?: ");
				int contractPeriodInMonths = input.nextInt();

				employees[count] = new Consultant(name, salary, ssn, contractPeriodInMonths);
				count++;
			}
		} while (count != 6 && userChoice != 0);
		for (int i = 0; i < count; i++) {
			System.out.println(employees[i].getEmployeeId() + employees[i].getPay());
		}
		input.close();
	}
}
