package hr.popic.danijel.javapractice.assignments;

import hr.popic.danijel.javapractice.util.BaseFunctionality;

/**
 * Examples with if, if-else, if-else-if, switch.
 */
public class ConditionsAssignments extends BaseFunctionality {

	/**
	 * Input number of days. Calculate how many years, months and days number holds
	 * (year is always 365 days and month is always 30 days).
	 */
	public static void assignment1() {
		int days = inputNumber("Enter number of days: ");
		int years = days / 365; // we have integer, decimal part is gone
		int months = (days % 365) / 30; // get remaining days and calculate months
		int remainingDays = (days % 365) % 30; // remove years and months and get remaining days

		System.out.println("\nResult:");
		System.out.println("Years = " + years);
		System.out.println("Months = " + months);
		System.out.println("Days = " + remainingDays);
	}

	/**
	 * Input 3 numbers. Determine highest number.
	 */
	public static void assignment2() {
		int a = inputNumber("Enter 1. number: ");
		int b = inputNumber("Enter 2. number: ");
		int c = inputNumber("Enter 3. number: ");

		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}

		if (a == b && a == c) {
			System.out.println("All numbers are the same!");
		} else {
			System.out.println("Highest number is " + max);
		}
	}

	/**
	 * Input number. Determine is it equal to zero, higher than zero or lower than
	 * zero.
	 */
	public static void assignment3() {
		int n = inputNumber();

		if (n == 0) {
			System.out.println("Number is equal to zero");
		} else if (n > 0) {
			System.out.println("Number is higher than zero");
		} else {
			System.out.println("Number is lower than zero");
		}
	}

	/**
	 * Input two numbers and after that input 1 more which determines operation
	 * which will be done on 1st two numbers:</br>
	 * => 1 product</br>
	 * => 2 sum</br>
	 * => 3 subtract</br>
	 * => 4 divide</br>
	 * 
	 */
	public static void assignment4() {
		double a = inputDecNumber("First number: ");
		double b = inputDecNumber("Second number: ");
		int selector = 0;

		System.out.println("\nSelector:\n1 => product\n2 => sum\n3 => subtract\n4 => divide");
		selector = inputNumber("Enter selector:");
		double result = 0;

		switch (selector) {
		case 1:
			result = a * b;
			break;
		case 2:
			result = a + b;
			break;
		case 3:
			result = a - b;
			break;
		case 4:
			result = a / b;
			break;
		default:
			selector = -1;
			break;
		}

		System.out.println("Result = " + result);
	}

}
