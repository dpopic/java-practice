package hr.popic.danijel.javapractice.assignments;

import java.util.Arrays;
import java.util.stream.DoubleStream;

import hr.popic.danijel.javapractice.util.BaseFunctionality;

/**
 * Examples with arrays.
 */
public class ArraysAssignments extends BaseFunctionality {

	/**
	 * Store first 100 numbers in field and then print the field.
	 */
	public static void assignment1() {
		int[] numbers = new int[100];
		// store from 0 - 99
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i;
		}

		// print
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] + "\t");
		}
	}

	/**
	 * Store square values for numbers from 1 to 40 in a field. Print the field
	 * afterwards.
	 */
	public static void assignment2() {
		double[] numbers = new double[40];
		// store
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Math.pow((i + 1), 2);
		}

		// print
		for (int i = 0; i < numbers.length; i++) {
			System.out.println((i+1) + " => " + numbers[i] + "\t");
		}
	}

	/**
	 * Create filed containing numbers from 1 to 25. Print them in single line
	 * separated by ", ". Last number must end with ".".
	 */
	public static void assignment3() {
		int[] numbers = new int[25];
		// store
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}

		// print
		for (int i = 0; i < numbers.length; i++) {
			if ((i + 1) < numbers.length) {
				System.out.print(numbers[i] + ", ");
			} else {
				System.out.print(numbers[i] + ".");
			}
		}
	}

	/**
	 * Input (n) characters in field, (n) is determined by user input before field
	 * creation. Fill the field by input from console. Check even field positions
	 * for character 'a'.
	 */
	public static void assignment4() {
		int n = inputNumber("How many charachters you wish to enter: ");
		char[] ch = new char[n];

		// store
		for (int i = 0; i < ch.length; i++) {
			ch[i] = inputCharachter("Enter character at index " + i + ". => ");
		}

		// check & print
		System.out.println("\nSearching a characters on even index positions...");
		for (int i = 0; i < ch.length; i = i + 2) {
			if (ch[i] == 'a') {
				System.out.println("Charachter 'a' found on index position " + i);
			}
		}
		
		System.out.println("End of program.");
	}

	/**
	 * Input 10 characters in field. Determine how many of them where numbers and
	 * what is their sum.
	 */
	public static void assignment5() {
		char[] ch = new char[10];
		int counter = 0;
		int sum = 0;

		// store
		System.out.println("Please enter 10 charachters...");
		for (int i = 0; i < ch.length; i++) {
			ch[i] = inputCharachter("Enter " + (i + 1) + ". character: ");
			if (ch[i] >= '0' && ch[i] <= '9') {
				sum = sum + (ch[i] - '0'); // - '0' to get int from char
				counter++;
			}
		}

		System.out.println("Number count = " + counter);
		System.out.println("Sum = " + sum);
	}

	/**
	 * Enter 12 numbers, save them in field, print highest inputed number.
	 */
	public static void assignment6() {
		double[] numbers = new double[12];

		System.out.println("Max hunt => Enter 12 numbers...");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = inputDecNumber("Enter " + (i + 1) + ". number: ");
		}

		Arrays.sort(numbers); // ascending sort
		System.out.println("Max = " + numbers[numbers.length - 1]); // get the last/highest
	}

	/**
	 * Enter 12 numbers, save them in field, print highest inputed number. Also,
	 * print the field index of that number (don't use Arrays.sort).
	 */
	public static void assignment7() {
		double[] numbers = new double[12];
		double tempMax = Double.MIN_VALUE;
		int indexOfMax = 0;

		System.out.println("Max hunt(i) => Enter 12 numbers...");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = inputDecNumber("Enter " + (i + 1) + ". number: ");
			if (numbers[i] > tempMax) {
				tempMax = numbers[i];
				indexOfMax = i;
			}
		}

		System.out.println("Max = " + tempMax);
		System.out.println("Index of max number = " + indexOfMax);
	}

	/**
	 * Create a field and fill it with 25 generated random numbers in range from 1
	 * to 25. Sort the field and print the values in ascending and descending order.
	 */
	public static void assignment8() {
		int[] numbers = new int[25];
		// Fill/Generate
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) ((Math.random() * 100) + 1);
		}

		// Sort
		Arrays.sort(numbers);

		System.out.println("ASC print");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + "\t");
		}

		System.out.println("\nDESC print");
		for (int i = numbers.length - 1; i > 0; i--) {
			System.out.print(numbers[i] + "\t");
		}
	}

	/**
	 * Input (n) numbers in field and calculate the sum of all numbers. (n) is
	 * determined by user.
	 */
	public static void assignment9() {
		int n = inputNumber("How many numbers you wish to enter: ");
		double[] numbers = new double[n];

		// store
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = inputDecNumber((i + 1) + ". Enter number: ");
		}

		double sum = DoubleStream.of(numbers).sum(); // Java 8 !
		System.out.println("Sum = " + sum);
		// * Without java 8 and streams we would have to go through all field elements
		// in a loop and sum them 1 by 1

	}

	/**
	 * Input (n) numbers in field and calculate arithmetic mean of all numbers. (n)
	 * is determined by user.
	 */
	public static void assignment10() {
		int n = inputNumber("How many numbers you wish to enter: ");
		double[] numbers = new double[n];

		// store
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = inputDecNumber((i + 1) + ". Enter number: ");
		}

		double sum = DoubleStream.of(numbers).sum(); // Java 8 !
		System.out.println("Arithmetic mean = " + (sum / n));
	}

	/**
	 * Enter (n) numbers (double) and print all numbers higher than arithmetic mean
	 * of all entered numbers.
	 */
	public static void assignment11() {
		int n = inputNumber("How many numbers you wish to enter: ");
		double[] numbers = new double[n];

		// store
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = inputDecNumber((i + 1) + ". Enter number: ");
		}

		double arsr = DoubleStream.of(numbers).sum() / n; // Java 8 !
		System.out.println("\nArithmetic mean = " + arsr);

		System.out.println("Numbers higher than arithmetic mean value: ");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > arsr) {
				System.out.print(numbers[i] + "\t");
			}
		}
	}

	/**
	 * Enter (n) numbers in field then print all numbers which are even, divisible
	 * with number 3 and are stored in even field index.
	 */
	public static void assignment12() {
		int n = inputNumber("How many numbers you wish to enter: ");
		int[] numbers = new int[n];

		// store
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = inputNumber((i + 1) + ". Enter number: ");
		}

		// print
		System.out.println("\nNumbers that meet conditions: ");
		for (int i = 0; i < numbers.length; i = i + 2) {
			if (numbers[i] % 2 == 0 && numbers[i] % 3 == 0) {
				System.out.println(numbers[i] + "\t");
			}
		}
		
		System.out.println("End of program.");
	}

	/**
	 * Number rounding practice</br>
	 * 
	 * Generate 60 random decimal numbers (with Math class) in range from 100-999.
	 * All numbers must be stored in field. Print the numbers:</br>
	 * - First 20 rounded with math class on 4 decimals</br>
	 * - Next 20 rounded with DecimalFormat class on 2 decimals (if last digit is
	 * zero, it mustn't be visible)</br>
	 * - Last 20 rounded with DecimalFormat class on 2 decimals (if last digit is
	 * zero, it must be visible)</br>
	 */
	public static void assignment13() {
		double[] numbers = new double[60];

		// Fill/Generate
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = ((Math.random() * 999) + 100);
		}

		System.out.println("First 20: ");
		for (int i = 0; i < 20; i++) {
			System.out.print(Math.round(numbers[i] * 10000.0) / 10000.0);
			System.out.print("\t");
		}

		System.out.println("\nRage 20-40: ");
		for (int i = 20; i < 40; i++) {
			System.out.print(formatRoundTwoShow(numbers[i], "#.##"));
			System.out.print("\t");
		}

		System.out.println("\nRage 40-60: ");
		for (int i = 40; i < 60; i++) {
			System.out.print(formatRoundTwoShow(numbers[i]));
			System.out.print("\t");
		}
	}

	/**
	 * Calculate sum of numbers in range from 1 to 20 and store values in field for
	 * every number. Print the values of the field afterwards.
	 * 
	 * Output example:</br>
	 * sum(1) = 1</br>
	 * sum(2) = 3</br>
	 * sum(3) = 6</br>
	 * sum(3) = 10</br>
	 * ...
	 */
	public static void assignment14() {
		int[] numbers = new int[20];
		int sum = 0;

		// input
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + (i + 1);
			numbers[i] = sum;
		}

		// print
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("sum(" + (i + 1) + ") = " + numbers[i]);
		}
	}
}
