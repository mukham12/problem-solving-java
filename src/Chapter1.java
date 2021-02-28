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

		System.out.println("\nThe monthly payment will be: R " + roundMonthlyPaymentInterestTotal);
		System.out.println("The monthly interest payment will be: " + roundInterestAmount);
		System.out.println("Total interest paid: R " + roundMonthlyInterestTotal);
		System.out.println("Your total back payment will be: R " + roundPrincipalAmount);

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
			1. Write a program that converts degrees from Fahrenheit to Celsius, using the formula
			DegreesC = 5(DegreesF - 32) / 9
		 */
		System.out.print("Enter a temperature in degrees Fahrenheit: ");
		int fahrenheit = keyboard.nextInt();
		float celsius = 5 * (fahrenheit - 32) / 9f;
		System.out.printf("%d degrees Fahrenheit is %.1f degrees Celsius.\n\n", fahrenheit, celsius);

		/*
			2. Write a program that reads a line of text and then displays the line, but with the first occurrence of
			"hate" changed to love. For example, a possible sample dialogue might be
			Enter a line of text.
			I hate you.
			I have rephrased that line to read:
			I love you.
		 */
		// Code below is required to consume the new-line before cursor can be moved down to the needed line.
		keyboard.nextLine();
		System.out.println("Enter a line of text.");
		String text = keyboard.nextLine();
		System.out.println("I have rephrased that line to read:\n" + text.replaceFirst("hate", "love"));

		/*
			3. Write a program that will read a line of text as input and then display the line with the first word
			moved to the end of the line. For example, a possible sample interaction with the user might be

			Enter a line of text. No punctuation please.
			Java is the language
			I have rephrased that line to read
			Is the language Java

		 */
		System.out.println("Enter a line of text. No punctuation please.");
		String sentence = keyboard.nextLine();
		String firstWord = sentence.substring(0, sentence.indexOf(" "));
		sentence = sentence.replaceFirst(firstWord, "") + " " + firstWord;
		System.out.println("I have rephrased that line to read:\n" + sentence);

		/*
			4. Write a program that asks the user to enter a favorite color, a favorite food, a favorite animal, and the
			first name of a friend or relative. The program should then print the following two lines, with the user’s
			input replacing the items in quotes:

			I had a dream that "Name" ate a Color "Animal" and said it tasted like "Food"!
		 */
		System.out.print("Enter a name: ");
		String name = keyboard.next();
		System.out.print("Enter a color: ");
		String color = keyboard.next();
		System.out.print("Enter an animal: ");
		String animal = keyboard.next();
		System.out.print("Enter a food: ");
		String food = keyboard.next();

		System.out.printf("I had a dream that %s ate a %s %s and said it tasted like %s!\n", name, color, animal, food);

		/*
			5. Write a program that determines the change to be dispensed from a vending machine. An item in the can cost
			between 25 cents and a dollar, in 5-cent increments (25, 30, 35, ..., 90, 95, 100), and the machine accepts
			only a single dollar bill to pay for the item. For example, a possible dialogue with the use might be
			Enter price of item (from 25 cents to a dollar, in 5-cent increments): 45

			You bought an iterm for 45 cents and gave me a dollar, so your change is
			2 quarters,
			0 dimes, and
			1 nickel.
		 */
		System.out.print("Enter price of item (from 25 cents to a dollar, in 5-cent increments): ");
		int price = keyboard.nextInt();
		int change = 100 - price;

		int quarter =  change / 25;
		change %= 25;

		int dime = change / 10;
		change %= 10;

		int nickel = change / 5;

		System.out.printf("You bought an item for %d cents and gave me a dollar, so your change is" +
						  "\n%d quarters\n%d dimes, and \n%d nickel.\n", price, quarter, dime, nickel);

		/*
			6. Write a program that reads a 4-bit binary number from the keyboard as a string and then converts it into
			decimal. For example, if the input is 1100, the output should be 12.
		 */
		System.out.print("Enter 4-bit binary number: ");
		String binary = keyboard.next();
		int one = Integer.parseInt(binary.substring(0, 1));
		int two = Integer.parseInt(binary.substring(1, 2));
		int three = Integer.parseInt(binary.substring(2, 3));
		int four = Integer.parseInt(binary.substring(3, 4));

		int decimal = 8 * one + 4 * two + 2 * three + four;
		System.out.println(binary + " in binary is " + decimal + " in decimal.");

		/*
			7. Many private water wells produce only 1 or 2 gallons of water per minute. One way to avoid running out of
			water with these low-yield wells is to use a holding tank. A family of 4 will use about 250 gallons of water
			per day. However, there is a “natural” water holding tank in the casing (i.e., the hole) of the well itself.
			The  deeper  the  well,  the  more  water  that  will  be  stored that can be pumped out for household use.
			But how much water will be available?

			Write a program that allows the user to input the radius of the well casing in inches (a typical well will
			have a 3-inch radius) and the depth of the  well  in  feet  (assume  water  will  fill  this  entire  depth,
			although  in  practice that will not be true since the static water level will generally be 50 feet or more
			below the ground surface). The program should output the number of gallons stored in the well casing. For
			your reference:
			The volume of a cylinder is πr2h , where r is the radius and h is the height. 1 cubic foot = 7.48 gallons of water.
		 */
		System.out.print("Enter the depth of well [in feet]: ");
		double depth = keyboard.nextDouble();
		System.out.print("Enter the radius [in inches]: ");
		double radius = keyboard.nextDouble();
		double inchToFeet = radius / 12;
		double gallons = Math.PI * (inchToFeet * inchToFeet) * depth * 7.48;
		System.out.println("The well can hold up to " + gallons + " gallons of water.");
	}
}
