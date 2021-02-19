import javax.swing.JOptionPane;
import java.util.Scanner;

public class Chapter1 {
	public static void main(String[] args) {
		/*
		Chapter 1, Self-Test Question #39
		Write a complete Java program that produces a dialog window containing the message HelloWorld!.
		Your program does nothing else.
	    */
		JOptionPane.showMessageDialog(null, "HelloWorld");

		/*
		Chapter 1, Self-Test Question #40
		Write a complete Java program that behaves as follows. The program displays an input dialog window
		asking the user to enter a whole number. When the user enters a whole number and clicks the OK button,
		the window goes away, and an output dialog window appears. This window simply tells the user what number was entered.
		When the user clicks the OK button in the window, the program ends.
		 */
		String input = JOptionPane.showInputDialog("Enter a whole number: ");
		JOptionPane.showMessageDialog(null, input);

		// Practice Problems
		/*
		1. Write a program that reads Principal, Rate and Time from the user. The program then calculates
		   and displays the Simple Interest and the Amount.
		 */
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the Principal: ");
		double P = keyboard.nextDouble();
		System.out.println("Please enter the Rate: ");
		double R = keyboard.nextDouble();
		System.out.println("Please enter the Time: ");
		double T = keyboard.nextDouble();
		System.out.println("Your Simple Interest would be " + (P * R * T) / 100 + " and Amount is " + P + (P * R * T) / 100);
	}
}
