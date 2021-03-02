import javax.swing.JOptionPane;
import java.util.Scanner;

public class Chapter1 {
	public static final double INTEREST_RATE = 7.49 / 12;

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
		System.out.print("Please enter the Principal: ");
		double P = keyboard.nextDouble();
		System.out.print("Please enter the Rate: ");
		double R = keyboard.nextDouble();
		System.out.print("Please enter the Time: ");
		double T = keyboard.nextDouble();
		System.out.println("Your Simple Interest would be " + (P * R * T) / 100 + " and Amount is " + P + (P * R * T) / 100);

		/*
			2. Write a program that uses Scanner to read two strings from the keyboard. Display each string, along with
			its length, on two separate lines. Then create a new string by joining the two strings, separated by a blank.
			Display the new string and its length on a third line.
		 */
		System.out.print("Enter first string: ");
		String first = keyboard.next();
		System.out.print("Enter second string: ");
		String second = keyboard.next();

		System.out.println("First string is '" + first + "' and its length is " + first.length());
		System.out.println("Second string is'" + second + "' and its length is " + second.length());

		String combined = first + " " + second;
		System.out.println("Joined string is '" + combined + "' and its length is " + combined.length());

		/*
			3 . Write a program that reads the amount of a monthly mortgage payment and the amount still owed the
				outstanding balance—and then displays the amount of the payment that goes to interest and the amount
				that goes to principal (i.e., the amount that goes to reducing the debt). Assume that the annual
				interest  rate  is  7.49  percent. Use a named constant for the interest rate. Note that payments are
				made monthly, so the interest is only one twelfth of the annual interest of 7.49 percent.
		 */
		double monthlyPayment = 1000000 / 12;
		double monthlyInterestTotal = monthlyPayment * (INTEREST_RATE / 100) * 12;
		double monthlyPaymentInterestTotal = monthlyPayment + monthlyPayment * (INTEREST_RATE / 100);
		double principalAmount = 1000000 + monthlyInterestTotal;

		double roundMonthlyPaymentInterestTotal = (double) Math.round(monthlyPaymentInterestTotal * 100) / 100d;
		double roundInterestAmount = (double) Math.round(monthlyPayment * (INTEREST_RATE / 100) * 100) / 100d;
		double roundMonthlyInterestTotal = (double) Math.round(monthlyInterestTotal * 100) / 100d;
		double roundPrincipalAmount = (double) Math.round(principalAmount * 100) / 100d;

		System.out.println("\nThe monthly payment will be: " + roundMonthlyPaymentInterestTotal);
		System.out.println("The monthly interest payment will be: " + roundInterestAmount);
		System.out.println("Total interest paid: " + roundMonthlyInterestTotal);
		System.out.println("Your total back payment will be: " + roundPrincipalAmount);

		/*
			4. Write a program that reads a four-digit integer, such as 2014, and then display it, one digit per line
			in reverse order, like so:
			4
			1
			0
			2
		 */
		System.out.print("Enter a 4-digit number: ");
		int number = keyboard.nextInt();
		System.out.println(number % 10);
		number /= 10;
		System.out.println(number % 10);
		number /= 10;
		System.out.println(number % 10);
		number /= 10;
		System.out.println(number);


		// 5. Repeat the previous project, but read the input in string and display the alternate characters from last.
		System.out.print("Enter a 4-digit number: ");
		String stringNumber = keyboard.next();
		System.out.println(stringNumber.charAt(3));
		System.out.println(stringNumber.charAt(1));

		// Practice Projects

		/*
			8. The Harris-Benedict equation estimates the number of calories your body needs to maintain your weight if
			you do no exercise. This is called your basal metabolic rate, or BMR. A typical chocolate bar will contain
			around 230 calories. Write a program that allows the user to input his or her weight in pounds, height in
			inches, and age in years. The program should then output the number of chocolate bars that should be consumed
			to maintain one’s weight for both a woman and a man of the input weight, height, and age.
		 */
		System.out.print("Enter your weight (lbs): ");
		int weight = keyboard.nextInt();
		System.out.print("Enter your height (inches): ");
		int height = keyboard.nextInt();
		System.out.print("Enter your age (years): ");
		int age = keyboard.nextInt();

		double femaleBMR = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
		double maleBMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);

		System.out.println("To maintain your BMR you will need to eat\n" + (int) (femaleBMR / 230) + " chocolate bars if" +
				" you are a female\nor\n" + (int) (maleBMR / 230) + " chocolate bars if you are a male!");

		// Skipping Practice Project #9 because it asks for exactly the same thing but using JOptionPane
		/*
			10. Write a program that reads a string for a date in the format month/day/year and displays it in the
			format day . month . year,  which is a typical format used in Europe. For example, if the input is 06 /17/11,
			the output should be 17.06.11.Your program should use JOptionPane for input and output.
		 */
		String monthDayYear = JOptionPane.showInputDialog("Enter date as month/day/year");
		String month = monthDayYear.substring(0, 2);
		String day = monthDayYear.substring(3, 5);
		String year = monthDayYear.substring(6, 10);

		JOptionPane.showMessageDialog(null,
				"American format: " + monthDayYear + "\nEuropean format: " + day + "." + month + "." + year);
	}
}
