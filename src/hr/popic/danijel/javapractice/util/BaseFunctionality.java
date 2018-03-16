package hr.popic.danijel.javapractice.util;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Class contains methods for inputing data from keyboard and for formating the
 * numbers.
 */
@SuppressWarnings("resource") // ignore scanner.close() while we are learning java
public class BaseFunctionality {

	/**
	 * Handle integer number input.
	 * 
	 * @return entered number.
	 */
	protected static int inputNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number;
		try {
			number = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("Error, invalid input! Please repeat.");
			number = inputNumber();
		}

		return number;
	}

	/**
	 * Handle integer number input. Show custom message to user.
	 * 
	 * @return entered number.
	 */
	protected static int inputNumber(final String message) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(message);
		int number;
		try {
			number = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("Error, invalid input! Please repeat.");
			number = inputNumber(message);
		}
		return number;
	}

	/**
	 * Handle double number input.
	 * 
	 * @return entered number.
	 */
	protected static double inputDecNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number: ");
		double number;
		try {
			number = Double.parseDouble(scanner.nextLine().replace(",", "."));
		} catch (Exception e) {
			System.out.println("Error, invalid input! Please repeat.");
			number = inputDecNumber();
		}
		return number;
	}

	/**
	 * Handle double number input. Show custom message to user.
	 * 
	 * @return entered number.
	 */
	protected static double inputDecNumber(final String message) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(message);
		double number;
		try {
			number = Double.parseDouble(scanner.nextLine().replace(",", "."));
		} catch (Exception e) {
			System.out.println("Error, invalid input! Please repeat.");
			number = inputDecNumber(message);
		}
		return number;
	}

	/**
	 * Handle text input from keyboard.
	 * 
	 * @return entered text.
	 */
	protected static String inputText() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter text: ");
		String text = scanner.nextLine();
		return text;
	}

	/**
	 * Handle text input from keyboard. Show custom message to user.
	 * 
	 * @return entered text.
	 */
	protected static String inputText(final String message) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(message);
		String text = scanner.nextLine();
		return text;
	}

	/**
	 * Handle single character input from keyboard.
	 * 
	 * @return entered character.
	 */
	protected static char inputCharachter() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter charachter: ");
		char c;
		try {
			c = scanner.nextLine().charAt(0);
		} catch (Exception e) {
			System.out.println("Error, invalid input! Please repeat.");
			c = inputCharachter();
		}

		return c;
	}

	/**
	 * Handle single character input from keyboard. Show custom message to user.
	 * 
	 * @return entered character.
	 */
	protected static char inputCharachter(final String message) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(message);
		char c;
		try {
			c = scanner.nextLine().charAt(0);
		} catch (Exception e) {
			System.out.println("Error, invalid input! Please repeat.");
			c = inputCharachter(message);
		}
		return c;
	}

	/**
	 * Round decimal number to 2 decimals.
	 * 
	 * @param number
	 *            value to be rounded
	 * 
	 * @return rounded number (value is changed).
	 */
	protected static double formatRoundTwo(final double number) {
		return Math.round(number * 100.0) / 100.0;
	}

	/**
	 * Round number to 2 decimals. Method used mostly when showing data to user.
	 * 
	 * @param number
	 *            value to be rounded
	 * 
	 * @return rounded number as string with zeros always shown at the end.
	 * 
	 *         eq. formatRoundTwoShow(11.4); => 11,40
	 */
	protected static String formatRoundTwoShow(final double number) {
		DecimalFormat decimalFormat = new DecimalFormat("#.00"); // format
		return decimalFormat.format(number);
	}

	/**
	 * Round number with custom format.
	 * 
	 * @param number
	 *            value to be rounded
	 * @param format
	 *            rounding rule
	 * @return rounded number as string
	 */
	protected static String formatRoundTwoShow(final double number, final String format) {
		DecimalFormat decimalFormat = new DecimalFormat(format); // format
		return decimalFormat.format(number);
	}
}
