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
			5. Write a program that allows the user to convert a temperature given in degrees from either Celsius to
			Fahrenheit or Fahrenheit to Celsius. Prompt the user to enter a temperature and either a C or c for Celsius
			or an F or f for Fahrenheit. Convert the temperature to Fahrenheit if Celsius is entered,  or  to  Celsius
			if  Fahrenheit  is  entered.
		 */
		System.out.print("Enter temperature: ");
		int temperature = keyboard.nextInt();
		System.out.print("Enter C for Celsius or F for Fahrenheit: ");
		String label = keyboard.next();
		if (label.equals("C") || label.equals("c")) {
			System.out.println(temperature + "C is " + (9 * (temperature / 5) + 32) + "F");
		} else if (label.equals("F") || label.equals("f")) {
			System.out.println(temperature + "F is " + (5 * (temperature - 32) / 9) + "C");
		} else {
			System.out.println("YOU ENTERED INVALID TEMPERATURE");
			System.exit(1);
		}

		System.out.print("Enter a floating-point value: ");
		double value = keyboard.nextDouble();
		if (value > 150.45 || (value >= 60.30 && value <= 70.25)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		/*
			7. Write a program that calculates the blood alcohol content of someone drinking Jagerbombs. Assume that
			there are 0.55 ounces of alcohol in one Jagerbomb. BAC = (4.136 * numDrink * ouncesAlcohol) / (weight).
			Pick numbers of your own choosing.
		 */
		System.out.println("Drinking 4 shots of Jagerbomb would result in " + (4.136 * 4 * 0.55) / (150) + " BAC");


		/*
			Programming Projects
			3. Write a program that reads a string from the keyboard and tests whether the string contains one of our
			profane words (dog, cat, llama).
		 */

		System.out.println("Enter a text: ");
		String text = keyboard.nextLine();
		if (text.equalsIgnoreCase("dog") || text.equalsIgnoreCase("cat") || text.equalsIgnoreCase("llama")) {
			System.out.println("The text you entered has a profanity.");
		} else {
			System.out.println("The text you entered does not have a profanity.");
		}

	}
}
