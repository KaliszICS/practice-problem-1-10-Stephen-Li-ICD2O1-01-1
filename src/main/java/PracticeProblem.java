/*
Lesson: String Manipulation
Author: Stephen Li
Date Created: Feb 26, 2026
Date Last Modified: Feb 26, 2026
 */

import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
	}

	public static void q1() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String word1 = input.nextLine();
		System.out.println(word1.contains("on"));
	}

	public static void q2() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input the word mango: ");
		String word1 = input.nextLine();
		String word2 = word1.toLowerCase();
		System.out.println(word2.compareTo("mango") == 0);
	}

	public static void q3() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a word: ");
		String word1 = input.nextLine();
		System.out.print("Input a letter: ");
		String letter = input.nextLine();
		System.out.println(word1.indexOf(letter));
		System.out.println(word1.lastIndexOf(letter));
	}

	public static void q4() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String word1 = input.nextLine();
		int length = word1.length();
		System.out.println("Your sentence is " + length + " characters long");
	}

	public static void q5() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String word1 = input.nextLine();
		System.out.print("Input a word to replace: ");
		String word2 = input.nextLine();
		System.out.print("What word would you like to replace it with: ");
		String word3 = input.nextLine();
		System.out.println(word1.replaceAll(word2, word3));
	}

	public static void q6() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String word1 = input.nextLine();
		System.out.println((word1.trim()).toUpperCase());
		System.out.println((word1.trim()).toLowerCase());
	}

	public static void q7() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a word: ");
		String word1 = input.nextLine();
		System.out.println(word1.substring(0,4));
		System.out.println(word1.substring(word1.length() - 4));
	}

	public static void q8() {
		//Write question 8 code here
	}

}
