/**
 * File: CS106A_InchesToCentimeters.java
 * ----------------------------
 * This Java program asks the user to enter a number of inches
 * as a floating point number which then gets converted into 
 * centimeters.
 */

import acm.program.*;

public class CS106A_InchesToCentimeters extends ConsoleProgram
{
	private static final double CENTIMETERS_PER_INCH = 2.54;
	
	public void run()
	{ 
		promptUser();
	}
	
	
	public void promptUser()
	{
		println("This program converts inches to centimeters.");
		double inches = readDouble("Enter value inches: ");
		double cm = inches * CENTIMETERS_PER_INCH;
		println(inches + "in = " + cm + "cm");
		println("donezo");
	}
}