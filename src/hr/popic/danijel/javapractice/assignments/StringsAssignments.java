package hr.popic.danijel.javapractice.assignments;

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
			if(charArray[i] == 'a') {
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
			if(charArray[i] >= 'A' && charArray[i] <= 'Z') {
				counter++;
			}
		}
		
		System.out.println("UpperCase Count = " + counter);
	}
	
	/**
	 * Input a sentence and print it reversed.
	 */
	public static void assignment4() {
		String s = inputText();
		char[] charArray = s.toCharArray();
		
		for (int i = charArray.length-1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
	}
}
