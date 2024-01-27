/* Purpose:
 * 		Converts kilograms into other forms of measurement
 * Programmer: Lanz Salviejo
 * Date: Jan 2024
 */

// Imports scanner utility to read inputs
import java.util.Scanner;
import java.text.DecimalFormat;

public class KilogramConversion {

	// Rounds decimal to 2 places
	private static final DecimalFormat df = new DecimalFormat("0.00");
	
	public static void main(String[] args) {
		// Welcomes user and describes program
		System.out.println("This program will prompt "
						+ "the user to input a kilogram "
						+ "value, which will then be "
						+ "converted to pounds, stones "
						+ "and ounces.\n");
		
		// Allows for user input
		Scanner scanner = new Scanner(System.in);
		
		// Prompts for user input of kilograms
		System.out.print("Enter kilogram value: ");
		
		// Detects user input for kilogram value
		double kilograms = scanner.nextDouble();
		// Closes scanner
		scanner.close();
		// Declare pounds to be a double variable
		final double KG_TO_POUNDS = 2.20462262;
		// Declare stones to be a double variable
		final double KG_TO_STONES = 0.157473044;
		// Declare ounces to be a double variable
		final double KG_TO_OUNCES = 35.2739619;
		
		if (kilograms > 0) {
		
			// Prints results for kilogram conversion to pounds
			System.out.println("Converted to pounds: " + df.format(kilograms * KG_TO_POUNDS));
			// Prints results for kilogram conversion to stones
			System.out.println("Converted to stones: " + df.format(kilograms * KG_TO_STONES));
			// Prints results for kilogram conversion to ounces
			System.out.println("Converted to ounces: " + df.format(kilograms * KG_TO_OUNCES));
		}
		else {
			// Prints if number input is negative or zero
			System.out.println("Invalid input, number cannot be negative or zero.");
		}
		// Print out final message
		System.out.println("\nWritten by Lanz Salviejo, Spring 2024");
	} // Main
} // KGconv