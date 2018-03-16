package hr.popic.danijel.javapractice.assignments;

import hr.popic.danijel.javapractice.util.BaseFunctionality;

/**
 * Examples with loops (for, while, do-while).
 */
public class LoopsAssignments extends BaseFunctionality {

	/**
	 * Print your name 50 times using: </br>
	 * - for loop </br>
	 * - while loop </br>
	 * - do while loop
	 */
	public static void assignment1() {
		// print value and print count are declared here so
		// they can be reused/changed through all loops
		final String name = "Danijel Popić";
		final int printCount = 50;

		System.out.println("For loop print:");
		for (int i = 1; i <= printCount; i++) {
			System.out.println(i + ". " + name);
		}

		System.out.println("\nWhile loop print:");
		int whileIterator = 1;
		while (whileIterator <= printCount) {
			System.out.println(whileIterator + ". " + name);
			whileIterator++;
		}

		System.out.println("\nDo-While loop print:");
		int doWhileIterator = 1;
		do {
			System.out.println(doWhileIterator + ". " + name);
			doWhileIterator++;
		} while (doWhileIterator <= printCount);
	}

	/**
	 * Print even numbers up to number 50 using:</br>
	 * - for loop </br>
	 * - while loop </br>
	 * - do while loop
	 */
	public static void assignment2() {
		final int endNumber = 50;

		System.out.println("For loop print:");
		for (int i = 0; i <= endNumber; i++) {
			if (i % 2 == 0) {
				System.out.print(i + "\t");
			}
		}

		System.out.println("\nWhile loop print:");
		int whileIterator = 0;
		while (whileIterator <= endNumber) {
			if (whileIterator % 2 == 0) {
				System.out.print(whileIterator + "\t");
			}
			whileIterator++;
		}

		System.out.println("\nDo-While loop print:");
		int doWhileIterator = 0;
		do {
			if (doWhileIterator % 2 == 0) {
				System.out.print(doWhileIterator + "\t");
			}
			doWhileIterator++;
		} while (doWhileIterator <= endNumber);
	}

	/**
	 * Print all three-digit numbers divisible with 7.
	 */
	public static void assignment3() {
		System.out.println("Three-digit numbers dividable with 7:");
		for (int i = 100; i <= 999; i++) {
			if (i % 7 == 0) {
				System.out.print(i + "\t");
			}
		}
	}

	/**
	 * Print numbers from 1 to 20 with their square value.
	 */
	public static void assignment4() {
		System.out.println("Number\tSquare");
		for (int i = 1; i <= 20; i++) {
			System.out.println(i + "\t" + Math.pow(i, 2));
		}
	}

	/**
	 * Print message "This is X. row!" for (n) number of times where n is inputed by
	 * user from console and X is value of currently printed row.
	 */
	public static void assignment5() {
		final int n = inputNumber("Please enter number of rows you wish to print: ");
		for (int i = 1; i <= n; i++) {
			System.out.println("This is " + i + ". row!");
		}
	}

	/**
	 * Print word "Java" 150 times in 10 rows (15 words in each row).
	 */
	public static void assignment6() {
		// We need 2 loops, with first loop we go throug rows and with second (inner)
		// loop we print words
		for (int rowPosition = 1; rowPosition <= 10; rowPosition++) {
			// Print row number at start
			System.out.print(rowPosition + "\t=>\t");

			// Second inner loop, print word 15 times
			for (int word = 1; word <= 15; word++) {
				System.out.print("Java\t");
			}

			// Row printed, go to new line
			System.out.println();

		}
	}

	/**
	 * Sum up all two-digit numbers.
	 */
	public static void assignment7() {
		int sum = 0;
		for (int i = 10; i <= 99; i++) {
			sum += i; // sum = sum + i;
		}
		System.out.println("Sum of all two-digit numbers is " + sum);
	}

	/**
	 * Write your name (n) times. Number n is inputed by user.
	 */
	public static void assignment8() {
		final String name = "Danijel Popić";
		final int n = inputNumber();

		for (int i = 1; i <= n; i++) {
			System.out.println(i + ". " + name);
		}
	}

	/**
	 * Print all even numbers from 1 to 100 divisible by 3.
	 */
	public static void assignment9() {
		System.out.println("Even numbers (1-100) dividable with 3:");
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.print(i + "\t");
			}
		}
	}

	/**
	 * Input numbers to program using console until number 5 is inputed. For every
	 * number check is it odd or even.
	 */
	public static void assignment10() {
		final int terminator = 5;
		int num = 0;
		System.out.println("Enter number " + terminator
				+ " to stop the program or enter some other number to check is it odd/even.\n");
		do {
			num = inputNumber();
			if (num % 2 == 0) {
				System.out.println("Number " + num + " is even!");
			} else {
				System.out.println("Number " + num + " is odd!");
			}
			System.out.println();
		} while (num != terminator);

		System.out.println("Number " + num + " entered, thank you, bye bye !");
	}

	/**
	 * Print square values of numbers from 1 to 10.
	 */
	public static void assignment11() {
		System.out.println("Square values of numbers from 1 to 10:");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "\t" + Math.pow(i, 2));
		}
	}

	/**
	 * Print all odd numbers from 1 to 10.
	 */
	public static void assignment12() {
		System.out.println("Odd numbers from 1 to 10:");
		for (int i = 1; i <= 10; i = i + 2) {
			System.out.println(i);
		}
	}

	/**
	 * Sum all numbers from 1 to 100.
	 */
	public static void assignment13() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("Sum form 1 to 100 is " + sum);
	}

	/**
	 * Sum even numbers from 0 to 100.
	 */
	public static void assignment14() {
		int sum = 0;
		for (int i = 0; i <= 100; i = i + 2) {
			sum += i;
		}
		System.out.println("Sum for even numbers form 1 to 100 is " + sum);
	}

	/**
	 * Calculate product of every third number in interval of 30 - 90
	 */
	public static void assignment15() {
		double product = 1;
		for (int i = 30; i <= 90; i = i + 3) {
			product *= i;
		}
		System.out.println("Product of every third number in interval of 30 - 90 is " + product);
	}

	/**
	 * Print all numbers from 0 to 111 which are divisible by 5 and 2
	 */
	public static void assignment16() {
		System.out.println("Numbers from 0 to 111 which are dividable by 5 and 2:");
		for (int i = 0; i <= 111; i = i + 2) {
			if (i % 5 == 0) {
				System.out.println(i);
			}

		}

	}

	/**
	 * Input two numbers and after that input 1 more which determines operation
	 * which will be done on 1st two numbers:</br>
	 * => 1 product</br>
	 * => 2 sum</br>
	 * => 3 subtract</br>
	 * => 4 divide</br>
	 * => 5 exit</br>
	 * 
	 * Selector can be chosen multiple times.
	 */
	public static void assignment17() {
		double a = inputDecNumber("First number: ");
		double b = inputDecNumber("Second number: ");
		int selector = 0;

		while (selector != 5) {
			System.out.println("\nSelector:\n1 => product\n2 => sum\n3 => subtract\n4 => divide\n5 => exit");
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
			case 5:
				break;
			default:
				selector = -1;
				break;
			}

			if (selector == -1) {
				System.out.println("Inputed selector is bad!");
			} else {
				System.out.println("Result = " + result);
			}
		}

	}

	/**
	 * Input numbers form console while whole numbers are inputed. Print how many
	 * positive and negative numbers where inputed.
	 */
	public static void assignment18() {
		int posCount = 0;
		int negCount = 0;
		double num = 0;

		System.out.println("When done, enter decimal number to exit the loop.");
		do {
			num = inputDecNumber();
			if (num > 0) {
				posCount++;
			} else if (num < 0) {
				negCount++;
			}
		} while ((int) num == num);

		System.out.println("We have " + posCount + " positive numbers and " + negCount + " negative numbers!");
	}

	/**
	 * Input number and calculate&print it's square value. Keep going until zero is
	 * entered.
	 */
	public static void assignment19() {
		double num = 0;
		while (true) {
			num = inputDecNumber();
			System.out.println(num + "\t" + Math.pow(num, 2));

			if (num == 0) {
				System.out.println("Zero is entered.");
				break;
			}
		}
	}

	/**
	 * Enter 10 characters 1 by 1. How many of them where small letter a.
	 */
	public static void assignment20() {
		char c;
		int counter = 0;
		for (int i = 1; i <= 10; i++) {
			c = inputCharachter(i + ". Enter character: ");
			if (c == 'a') {
				counter++;
			}
		}

		System.out.println("Number of character a entered = " + counter);
	}

	/**
	 * Input 10 numbers using while loop. Print highest inputed number.
	 */
	public static void assignment21() {
		int i = 1;
		int max = Integer.MIN_VALUE;
		int num = 0;

		while (i <= 10) {
			num = inputNumber("Enter " + i + ". number: ");
			if (num > max) {
				max = num;
			}
			i++;
		}

		System.out.println("Highest inputed number is " + max);
	}

	/**
	 * Input numbers until number 666 is inputed (do while). Print result of
	 * subtraction between sum of all inputed numbers and last number (666).
	 */
	public static void assignment22() {
		int num = 0;
		int sum = 0;
		System.out.println("Input 666 when done.");
		do {
			num = inputNumber();
			sum += num;
		} while (num != 666);

		System.out.println("Result = " + (sum - num));
	}

	/**
	 * Input number larger than 100. Print all numbers up to inputed number in
	 * descending order.</br>
	 * For example print for number 152 is => 152, 151, 150, 149...
	 */
	public static void assignment23() {
		int num = inputNumber("Input number larger than 100: ");
		for (int i = num; i >= 0; i--) {
			System.out.print(i + "\t");
			if ((i - 1) % 10 == 0) { // new line for prettier output
				System.out.println();
			}
		}
	}

	/**
	 * Enter two numbers (preferably two digit numbers) and sum all numbers between
	 * those numbers.
	 */
	public static void assignment24() {
		int start = inputNumber("Enter starting number of the range: ");
		int end = inputNumber("Enter ending number of the range: ");
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += i;
		}

		System.out.println("Sum = " + sum);

	}

	/**
	 * Input and sum numbers until zero is entered (while or do-while loop).
	 */
	public static void assignment25() {
		int sum = 0;
		int num;

		System.out.println("Enter 0 when done.");
		do {
			num = inputNumber();
			sum += num;
		} while (num != 0);

		System.out.println("Sum = " + sum);

	}

	/**
	 * Input and sum numbers until zero is entered. Print highest and lowest inputed
	 * number.
	 */
	public static void assignment26() {
		int sum = 0;
		int num;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		System.out.println("Enter zero when done.");
		while (true) {
			num = inputNumber();
			sum += num;

			if (num == 0) {
				break;
			}

			if (num > max) {
				max = num;
			}

			if (num < min) {
				min = num;
			}
		}

		System.out.println("Sum = " + sum);
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
	}
}
