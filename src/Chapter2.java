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
	}
}
