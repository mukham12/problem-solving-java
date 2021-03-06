import javax.swing.JOptionPane;
import java.util.Scanner;

public class Chapter2 {
	public static void main(String[] args) {
		/*
			Self-Test Question
			23. Write code for a JOptionPane dialog that will ask whether the user is at least 18 years of age. Then set
			the boolean variable 'adult' equal to either true, if the user is at least 18, or false otherwise. Include
			the declaration of the variable 'adult'
		 */
		int age = JOptionPane.showConfirmDialog(null, "Are you 18 years old?", "Ask for age", JOptionPane.YES_NO_OPTION);
		boolean adult = false;
		if (age == JOptionPane.YES_OPTION) {
			adult = true;
			System.out.println("You are an adult!");
		}

		/*
			Practice Programs
			1. If a number x is multiplied by the number 0, the result is zero. Write a program that tests whether the
			result is zero if one number is multiplied by 0. Read the number from the keyboard.
		 */
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int x = keyboard.nextInt();
		if (x * 0 == 0) {
			System.out.println("Multiplication of " + x + " by 0 resulted in 0.");
		} else {
			System.out.println("This is impossible!");
		}

		/*
			2. Write a program to read in three nonnegative integers from the keyboard. Display the integers in increasing order.
		 */
		System.out.print("Enter first positive integer: ");
		int first = keyboard.nextInt();
		System.out.print("Enter second positive integer: ");
		int second = keyboard.nextInt();
		System.out.print("Enter third positive integer: ");
		int third = keyboard.nextInt();
		System.out.print(first + ", " + second + ", and " + third + " in increasing order: ");
		if (first < second) {
			if (second < third) {
				System.out.println(first + " " + second + " " + third);
			} else {
				if (first < third) {
					System.out.println(first + " " + third + " " + second);
				} else {
					System.out.println(third + " " + second + " " + first);
				}
			}
		} else {
			if (third < second) {
				System.out.println(third + " " + second + " " + first);
			} else {
				if (third < first) {
					System.out.println(second + " " + third + " " + first);
				} else {
					System.out.println(second + " " + first + " " + third);
				}
			}
		}

		/*
			3. Write a program that reads three strings from the keyboard. Although the strings are in no particular
			order, display the string that would be second if they were arranged lexicographically
		 */
		keyboard.nextLine();
		System.out.print("Enter first string: ");
		String s1 = keyboard.nextLine();
		System.out.print("Enter second string: ");
		String s2 = keyboard.nextLine();
		System.out.print("Enter third string: ");
		String s3 = keyboard.nextLine();

		System.out.print("Second string from the lexicographic order is '");
		if (s1.compareTo(s2) > 0 && s1.compareTo(s3) < 0 || s1.compareTo(s2) < 0 && s1.compareTo(s3) > 0) {
			System.out.print(s1 + "'");
		} else if (s1.compareTo(s2) < 0 && s2.compareTo(s3) < 0 || s1.compareTo(s2) > 0 && s2.compareTo(s3) > 0) {
			System.out.print(s2 + "'");
		} else {
			System.out.print(s3 + "'");
		}
	}
}
