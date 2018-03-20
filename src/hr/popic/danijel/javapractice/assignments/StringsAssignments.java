package hr.popic.danijel.javapractice.assignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.swing.plaf.FontUIResource;

import hr.popic.danijel.javapractice.util.BaseFunctionality;

public class StringsAssignments extends BaseFunctionality {

	/**
	 * Input an sentence. Print the sentence length without using method length();
	 */
	public static void assignment1() {
		String s = inputText();
		char[] stringAsCharArray = s.toCharArray();
		int counter = 0;

		for (char charFromField : stringAsCharArray) {
			counter++;
		}

		System.out.println("Length of the sentence is " + counter);
	}

	/**
	 * Input a sentence. Print how many letters 'a' sentence contains.
	 */
	public static void assignment2() {
		String s = inputText();
		char[] charArray = s.toCharArray();
		int counter = 0;

		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 'a') {
				counter++;
			}
		}

		System.out.println("Occurrences of letter a = " + counter);
	}

	/**
	 * Input a sentence. Print how many upper case letters does it contain.
	 */
	public static void assignment3() {
		String s = inputText();
		char[] charArray = s.toCharArray();
		int counter = 0;

		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] >= 'A' && charArray[i] <= 'Z') {
				counter++;
			}
		}

		System.out.println("UpperCase Count = " + counter);
	}

	/**
	 * Input a sentence/word and print it backwards.
	 */
	public static void assignment4() {
		String s = inputText();
		char[] charArray = s.toCharArray();

		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
	}

	/**
	 * Input a sentence. Determine how many letters where numbers in sentence and
	 * what is their sum.
	 */
	public static void assignment5() {
		String s = inputText();
		char[] charArray = s.toCharArray();
		int counter = 0;
		int sum = 0;

		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] >= '0' && charArray[i] <= '9') {
				counter++;
				sum = sum + (charArray[i] - '0');
			}
		}

		System.out.println("Numbers count = " + counter);
		System.out.println("Sum = " + sum);
	}

	/**
	 * Input a sentence. Print first n characters.
	 */
	public static void assignment6() {
		String s = inputText();
		int n = inputNumber("Enter how many characters you wish to print: ");

		if (n > s.length()) {
			System.out.println("Number is too big! :(");
		} else {
			System.out.println(s.substring(0, n));
		}
	}

	/**
	 * Input two sentences. Print the sum of their lengths.
	 */
	public static void assignment7() {
		String s1 = inputText("Enter 1. sentence: ");
		String s2 = inputText("Enter 2. sentence: ");

		System.out.println("Total = " + (s1.length() + s1.length()));
	}

	/**
	 * Input a word. Check does word contain letter 'x'.
	 */
	public static void assignment8() {
		String w = inputText("Enter a word: ");
		if (w.contains("x")) {
			System.out.println("We have character x!");
		} else {
			System.out.println("It doesen't contain character x :(");
		}
	}

	/**
	 * Input a sentence. Print first word.
	 */
	public static void assignment9() {
		String s = inputText("Input a sentence: ");
		int indexOfFirstSpace = s.indexOf(" ");

		if (indexOfFirstSpace != -1) {
			System.out.println("First word is => " + s.substring(0, indexOfFirstSpace));
		} else {
			System.out.println("Sentence wasn't entered!");
		}
	}

	/**
	 * Input a sentence. Print every word in new line.
	 */
	public static void assignment10() {
		String s = inputText("Input a sentence: ");
		String[] words = s.split(" ");

		for (String word : words) {
			System.out.println(word);
		}
	}

	/**
	 * Input a sentence. Print last word.
	 */
	public static void assignment11() {
		String s = inputText("Input a sentence: ");
		int indexOfLastSpace = s.lastIndexOf(" ");

		if (indexOfLastSpace != -1) {
			System.out.println("Last word is => " + s.substring(indexOfLastSpace, s.length()));
		} else {
			System.out.println("Sentence wasn't entered!");
		}
	}

	/**
	 * Input a sentence. Print how many letters 'a' sentence contains on even
	 * positions.
	 */
	public static void assignment12() {
		String s = inputText();
		char[] charArray = s.toCharArray();
		int counter = 0;

		for (int i = 1; i < charArray.length; i = i + 2) {
			if (charArray[i] == 'a') {
				counter++;
			}
		}

		System.out.println("Occurrences of letter a (even positions) = " + counter);
	}

	/**
	 * Create mini calculator.</br>
	 * Input 2 numbers and then input action => +,-,/,* </br>
	 * After printing the result ask user does he wants to do another operation
	 */
	public static void assignment13() {
		double a = inputDecNumber("Enter 1. number: ");
		double b = inputDecNumber("Enter 2. number: ");

		while (true) {
			System.out.println("\nPossible actions:\n* => product\n+ => sum\n- => subtract\n/ => divide");
			char action = inputCharachter("\nInput action: ");

			double result = 0;

			switch (action) {
			case '*':
				result = a * b;
				break;
			case '+':
				result = a + b;
				break;
			case '-':
				result = a - b;
				break;
			case '/':
				result = a / b;
				break;
			default:
				action = 0;
				break;
			}

			if (action == 0) {
				System.out.println("Bad input!");
			} else {
				System.out.println("Result = " + result);
			}

			System.out.println("\nSelect action again?");
			System.out.println("y => yes\nn => no");
			action = inputCharachter("Input action: ");

			if (action == 'n') {
				break;
			} else if (action != 'y') {
				System.out.println("Bad input! Repeating action automatically.");
			}
		}
	}

	/**
	 * Input a character. Check is inputed character number, vowel or consonant.
	 */
	public static void assignment14() {
		char x = inputCharachter();

		if (x >= '0' && x <= '9') {
			System.out.println("Number has been entered!");
			return; // end of method execution
		}

		if (x >= 'A' && x <= 'z') {
			System.out.println("Letter has been entered!");

			Set<Character> vowels = new HashSet<>();
			vowels.add('a');
			vowels.add('e');
			vowels.add('i');
			vowels.add('o');
			vowels.add('u');

			if (vowels.contains(Character.toLowerCase(x))) {
				System.out.println("And it's a vowel!");
			} else {
				System.out.println("And it's consonant!");
			}
		}
	}

	/**
	 * Input a word and check is it a palindrome! (Palindromes are words or phrases
	 * that read the same backward and forward)
	 * 
	 * Palindrome examples: bob, ana, anna
	 */
	public static void assignment15() {
		String word = inputText("Input word: ");
		String wordIgnoreCase = word.toUpperCase();
		if (wordIgnoreCase.equals(new StringBuilder(wordIgnoreCase).reverse().toString())) {
			System.out.println("Word is palindrome!");
		} else {
			System.out.println("Word is not palindrome.");
		}
	}

	/**
	 * Input a sentence and check is it a palindrome! (Palindromes are words or
	 * phrases that read the same backward and forward). When comparing sentences,
	 * all characters except letters are ignored in comparison.
	 * 
	 * Sentence palindrome examples:</br>
	 * Was It A Rat I Saw?</br>
	 * Eva, Can I Stab Bats In A Cave?</br>
	 * Amore, Roma.</br>
	 * A Santa Lived As a Devil At NASA!!</br>
	 */
	public static void assignment16() {
		String sentence = inputText("Input sentence: ");
		String lettersOnly = stringToLettersOnly(new StringBuilder(sentence));

		System.out.println("Transformed string: " + lettersOnly);

		if (lettersOnly.equals(new StringBuilder(lettersOnly).reverse().toString())) {
			System.out.println("Sentence is palindrome!");
		} else {
			System.out.println("Sentence is not palindrome.");
		}
	}

	/**
	 * Helper method which recursively removes all non-letters from StringBuilder
	 * and then returns it string value.
	 * 
	 * @param sb
	 *            containing sentence.
	 * @return transformed string containing only lower case letters
	 */
	private static String stringToLettersOnly(final StringBuilder sb) { // call by reference
		char[] letters = sb.toString().toCharArray(); // StringBuilder to string then to char array
		for (int i = 0; i < letters.length; i++) {
			if (!Character.isLetter(letters[i])) { // if char is not a letter (UTF-8)
				sb.deleteCharAt(i); // remove it from StringBuilder
				stringToLettersOnly(sb); // indexes are now messy, just start from start again
				break;
			}
		}

		return sb.toString().toLowerCase(); // First method call will return proper value, rest is ignored
	}

}
